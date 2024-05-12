import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BusInfo info = new BusInfo();
        Reservation reservation = new Reservation();
        Login login = new Login();
        while (true){
            login.login();
            String user= login.getUser();
            String pass= login.getPass();
            if(user.equals("Ayman")&& pass.equals("1234")){
                System.out.println("--------------------------------");
                System.out.println("---------Welcome User-----------");
                System.out.println("--------------------------------");
                break;
            }
            else System.out.println("Incorrect Username OR Password");
        }


    while(true) {
        System.out.println("--------------------------------");
        System.out.println("        Bus Reservation");
        System.out.println();
        System.out.println("-------  Main Menu  ----------");
        String[] menu = {"View Bus List", "Book Tickets", "Cancel Booking", "Exit"};
        int size = menu.length;
        for (int i = 0; i < size; i++) {
            System.out.printf("[%d] => ", i + 1);
            System.out.println(menu[i]);
        }
        System.out.println("----------------------");
        System.out.print("Enter Your Choice: ");
        int choice=scanner.nextInt();
        switch (choice){
            case 1: info.viewList();
                    break;
            case 2: reservation.viewList();
                    break;
            case 3: reservation.pass();
                   break;
            case 4: return;
        }

    }

    }
}