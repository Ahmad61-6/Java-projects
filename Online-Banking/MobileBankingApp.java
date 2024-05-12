
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.*;

public class MobileBankingApp extends JFrame {
    // GUI components
    private JTextField nameTextField = new JTextField(20);
    private JTextField accountTextField = new JTextField(10);
    private JTextField balanceTextField = new JTextField(10);
    private JTextField depositTextField = new JTextField(10);
    private JTextField withdrawTextField = new JTextField(10);
    private JTextArea transactionsTextArea = new JTextArea(10, 30);
    private JButton createAccountButton = new JButton("Create Account");
    private JButton depositButton = new JButton("Deposit");
    private JButton withdrawButton = new JButton("Withdraw");
    private JButton viewBalanceButton = new JButton("View Balance");

    // MobileBankingApp properties
    private String name;
    private String accountNumber;
    private double balance;
    private ArrayList<Transaction> transactionList = new ArrayList<>();

    public MobileBankingApp() {
        super("Mobile Banking App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameTextField);
        inputPanel.add(new JLabel("Account Number:"));
        inputPanel.add(accountTextField);
        inputPanel.add(new JLabel("Initial Balance:"));
        inputPanel.add(balanceTextField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(createAccountButton);
        buttonPanel.add(depositButton);
        buttonPanel.add(withdrawButton);
        buttonPanel.add(viewBalanceButton);

        JPanel transactionPanel = new JPanel();
        transactionPanel.add(new JLabel("Transactions:"));
        transactionsTextArea.setEditable(false);
        transactionPanel.add(new JScrollPane(transactionsTextArea));

        setLayout(new BorderLayout(10, 10));
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(transactionPanel, BorderLayout.SOUTH);

        addListeners();
        setVisible(true);
    }

    private void addListeners() {
        createAccountButton.addActionListener(this::createAccount);
        depositButton.addActionListener(this::deposit);
        withdrawButton.addActionListener(this::withdraw);
        viewBalanceButton.addActionListener(this::viewBalance);
    }

private void createAccount(ActionEvent e) {
    if (validateInput(nameTextField.getText(), "<a-zA-Z>+", "Invalid name. Please enter only alphabetical characters.") &&
        validateInput(accountTextField.getText(), "\\d{10}", "Invalid account number. Please enter 10 digits only.") &&
        validateInput(balanceTextField.getText(), "\\d+(\\.\\d+)?", "Invalid balance. Please enter a valid decimal number.")) {
        name = nameTextField.getText();
        accountNumber = accountTextField.getText();
        balance = Double.parseDouble(balanceTextField.getText());
        JOptionPane.showMessageDialog(this, "Account has been created successfully!");
    }
}

    

    private void deposit(ActionEvent e) {
        try {
            double amount = Double.parseDouble(depositTextField.getText());
            balance += amount;
            transactionList.add(new Transaction("Deposit", amount));
            updateTransactionHistory();
            JOptionPane.showMessageDialog(this, "Deposit of " + amount + " has been made successfully!");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid deposit amount.");
        }
    }

    private void withdraw(ActionEvent e) {
        try {
            double amount = Double.parseDouble(withdrawTextField.getText());
            if (balance >= amount) {
                balance -= amount;
                transactionList.add(new Transaction("Withdrawal", amount));
                updateTransactionHistory();
                JOptionPane.showMessageDialog(this, "Withdrawal of " + amount + " has been made successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Insufficient funds.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid withdrawal amount.");
        }
    }

    private void viewBalance(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Current balance: " + balance);
    }

    private boolean validateInput(String input, String pattern, String errorMessage) {
        if (!Pattern.matches(pattern, input)) {
            JOptionPane.showMessageDialog(this, errorMessage);
            return false;
        }
        return true;
    }

    private void updateTransactionHistory() {
        transactionsTextArea.setText("");
        transactionList.forEach(transaction -> transactionsTextArea.append(transaction.toString() + "\n"));
    }

    public static void main(String<> args) {
        SwingUtilities.invokeLater(MobileBankingApp::new);
    }
}
