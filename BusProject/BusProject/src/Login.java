import java.util.Scanner;

public class Login {
    Scanner scanner = new Scanner(System.in);
    private String user;
    private String pass;
    void login(){
        System.out.print("Enter Username: ");
         user=scanner.nextLine();
        System.out.print("Enter Password: ");
        pass= scanner.nextLine();
    }
    String getUser(){
        return user;
    }
    String getPass(){
        return pass;
    }
}
