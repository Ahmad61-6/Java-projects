import java.util.Scanner;

public class Reservation extends BusInfo{
     int total1 = 20;
    int total2 = 20;
    int total3 = 20;
    int total4 = 20;
    int total5 = 20;
    AvailabeSeats availabeSeats = new AvailabeSeats();
    CancelTicket cancelTicket = new CancelTicket();
    Scanner scanner = new Scanner(System.in);
    void viewList(){
        System.out.println("--------------------------------");
        System.out.println("        Bus Reservation");
        System.out.println();
        System.out.println("-------  Bus List  ----------");
        for(int i=0; i<n; i++){
            System.out.printf("[%d] => ",i+1);
            System.out.println(busname[i]);
        }
        reserve();
    }
    void reserve() {
        System.out.print("Enter The Bus Number: ");
        int choice=scanner.nextInt();
        switch (choice) {
            case 1 -> {
                int t1 = availabeSeats.jude(total1, availabeseats1);
                total1 -= t1;
            }
            case 2 -> {
                int t2 = availabeSeats.adones(total2, availabeseats2);
                total2 -= t2;
            }
            case 3 -> {
                int t3 = availabeSeats.bicol(total3, availabeseats3);
                total3 -= t3;
            }
            case 4 -> {
                int t4 = availabeSeats.sax(total4, availabeseats4);
                total4 -= t4;
            }
            case 5 -> {
                int t5 = availabeSeats.phil(total5, availabeseats5);
                total5 -= t5;
            }
            default -> System.out.println("Invalid Input");
        }
    }
    void pass(){
       int t= cancelTicket.delete(availabeseats1,availabeseats2,availabeseats3,availabeseats4,availabeseats5);
       if(t==1) {
           total1+=t;
       }
       else if(t==2){
           total2+=1;
       }
       else if(t==3)total3+=1;
       else if(t==4)total4+=1;
       else if(t==5)total5+=1;

    }

}
