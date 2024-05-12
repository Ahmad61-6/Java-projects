import java.util.Scanner;

public class BusInfo {
    public String[][] availabeseats1={{"Empty","Empty","Empty","Empty","Empty"},{"Empty","Empty","Empty","Empty","Empty"},{"Empty","Empty","Empty","Empty","Empty"},{"Empty","Empty","Empty","Empty","Empty"}};
    public String[][] availabeseats2={{"Empty","Empty","Empty","Empty","Empty"},{"Empty","Empty","Empty","Empty","Empty"},{"Empty","Empty","Empty","Empty","Empty"},{"Empty","Empty","Empty","Empty","Empty"}};
    public String[][] availabeseats3={{"Empty","Empty","Empty","Empty","Empty"},{"Empty","Empty","Empty","Empty","Empty"},{"Empty","Empty","Empty","Empty","Empty"},{"Empty","Empty","Empty","Empty","Empty"}};
    public String[][] availabeseats4={{"Empty","Empty","Empty","Empty","Empty"},{"Empty","Empty","Empty","Empty","Empty"},{"Empty","Empty","Empty","Empty","Empty"},{"Empty","Empty","Empty","Empty","Empty"}};
    public String[][] availabeseats5={{"Empty","Empty","Empty","Empty","Empty"},{"Empty","Empty","Empty","Empty","Empty"},{"Empty","Empty","Empty","Empty","Empty"},{"Empty","Empty","Empty","Empty","Empty"}};
    Scanner scanner = new Scanner(System.in);
    String [] busname ={"Tisha Express","Relax Liner","Asia Aircon ltd","Miami Bus Lines","Padma Express"};
    int n= busname.length;
    void viewList(){
        System.out.println("--------------------------------");
        System.out.println("        Bus Reservation");
        System.out.println();
        System.out.println("-------  Bus List  ----------");
        for(int i=0; i<n; i++){
            System.out.printf("[%d] => ",i+1);
            System.out.println(busname[i]);
        }
        System.out.println("--------------------------");
        System.out.print("Press Any Character and Enter: ");
        scanner.next();
    }
}
