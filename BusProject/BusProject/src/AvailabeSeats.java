import java.util.Scanner;

public class AvailabeSeats {
    Scanner scanner=new Scanner(System.in);


    int  jude(int total,String[][] availabeseats1){
        if(total<0)total=0;
        System.out.println("----------- Tisha Express--------------");
        System.out.println("-------------------------------------");
        System.out.println("------------Bus Reservation----------");
        System.out.println("--------------------------------------");
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                System.out.printf("[%d][%d].%s  ",i+1,j+1,availabeseats1[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Available Seats: "+total);
        System.out.print("Number Of Tickets You Want: ");
        int need= scanner.nextInt();
        if(total==0 || need>total){
            System.out.println("Seats Not Available");
            System.out.print("Press any key and Enter: ");
            scanner.next();
            return 0;
        }

        for(int i=0; i<need; i++){
            System.out.printf("--------Enter the details for ticket no %d---------\n",i+1);
            System.out.println("Enter The Seat Number: ");
            System.out.print("Enter Row: ");
            int row=scanner.nextInt();
            System.out.print("Enter Column: ");
            int column=scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Your Name: ");
            String name=scanner.nextLine();
            availabeseats1[row-1][column-1]=name;

        }
        System.out.println("------------------------------------");
        System.out.printf("Your Total Taka Is: %d\n",100*need);
        System.out.print("Press Any key and Enter: ");
        scanner.next();
        return need;
    }
    int  adones(int total,String[][] availabeseats2){
        if(total<0)total=0;
        System.out.println("----------- Relax Liner--------------");
        System.out.println("-------------------------------------");
        System.out.println("------------Bus Reservation----------");
        System.out.println("--------------------------------------");
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                System.out.printf("[%d][%d].%s  ",i+1,j+1,availabeseats2[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Available Seats: "+total);
        System.out.print("Number Of Tickets You Want: ");
        int need= scanner.nextInt();
        if(total==0 || need>total){
            System.out.println("Seats Not Available");
            System.out.print("Press any key and Enter: ");
            scanner.next();
            return 0;
        }

        for(int i=0; i<need; i++){
            System.out.printf("--------Enter the details for ticket no %d---------\n",i+1);
            System.out.println("Enter The Seat Number: ");
            System.out.print("Enter Row: ");
            int row=scanner.nextInt();
            System.out.print("Enter Column: ");
            int column=scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Your Name: ");
            String name=scanner.nextLine();
            availabeseats2[row-1][column-1]=name;

        }
        System.out.println("------------------------------------");
        System.out.printf("Your Total Taka Is: %d\n",100*need);
        System.out.print("Press Any key and Enter: ");
        scanner.next();
        return need;
    }
    int bicol(int total, String[][] availabeseats3){
        if(total<0)total=0;
        System.out.println("----------- Asia Aircon ltd--------------");
        System.out.println("-------------------------------------");
        System.out.println("------------Bus Reservation----------");
        System.out.println("--------------------------------------");
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                System.out.printf("[%d][%d].%s  ",i+1,j+1,availabeseats3[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Available Seats: "+total);
        System.out.print("Number Of Tickets You Want: ");
        int need= scanner.nextInt();
        if(total==0 || need>total){
            System.out.println("Seats Not Available");
            System.out.print("Press any key and Enter: ");
            scanner.next();
            return 0;
        }

        for(int i=0; i<need; i++){
            System.out.printf("--------Enter the details for ticket no %d---------\n",i+1);
            System.out.println("Enter The Seat Number: ");
            System.out.print("Enter Row: ");
            int row=scanner.nextInt();
            System.out.print("Enter Column: ");
            int column=scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Your Name: ");
            String name=scanner.nextLine();
            availabeseats3[row-1][column-1]=name;

        }
        System.out.println("------------------------------------");
        System.out.printf("Your Total Taka Is: %d\n",100*need);
        System.out.print("Press Any key and Enter: ");
        scanner.next();
        return need;
    }
    int  sax(int total,String[][] availabeseats4){
        if(total<0)total=0;
        System.out.println("----------- Miami Bus Lines--------------");
        System.out.println("-------------------------------------");
        System.out.println("------------Bus Reservation----------");
        System.out.println("--------------------------------------");
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                System.out.printf("[%d][%d].%s  ",i+1,j+1,availabeseats4[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Available Seats: "+total);
        System.out.print("Number Of Tickets You Want: ");
        int need= scanner.nextInt();
        if(total==0 || need>total){
            System.out.println("Seats Not Available");
            System.out.print("Press any key and Enter: ");
            scanner.next();
            return 0;
        }


        for(int i=0; i<need; i++){
            System.out.printf("--------Enter the details for ticket no %d---------\n",i+1);
            System.out.println("Enter The Seat Number: ");
            System.out.print("Enter Row: ");
            int row=scanner.nextInt();
            System.out.print("Enter Column: ");
            int column=scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Your Name: ");
            String name=scanner.nextLine();
            availabeseats4[row-1][column-1]=name;

        }
        System.out.println("------------------------------------");
        System.out.printf("Your Total Taka Is: %d\n",100*need);
        System.out.print("Press Any key and Enter: ");
        scanner.next();
        return need;
    }
            int phil(int total, String[][] availabeseats5){
            if(total<0)total=0;
            System.out.println("----------- Padma Express--------------");
            System.out.println("-------------------------------------");
            System.out.println("------------Bus Reservation----------");
            System.out.println("--------------------------------------");
            for(int i=0; i<4; i++){
        for(int j=0; j<5; j++){
        System.out.printf("[%d][%d].%s  ",i+1,j+1,availabeseats5[i][j]);
        }
        System.out.println();
        }
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Available Seats: "+total);
        System.out.print("Number Of Tickets You Want: ");
        int need= scanner.nextInt();
                if(total==0 || need>total){
                    System.out.println("Seats Not Available");
                    System.out.print("Press any key and Enter: ");
                    scanner.next();
                    return 0;
                }

        for(int i=0; i<need; i++){

        System.out.printf("--------Enter the details for ticket no %d---------\n",i+1);
        System.out.println("Enter The Seat Number: ");
        System.out.print("Enter Row: ");
        int row=scanner.nextInt();
        System.out.print("Enter Column: ");
        int column=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Your Name: ");
        String name=scanner.nextLine();
        availabeseats5[row-1][column-1]=name;

        }
                System.out.println("------------------------------------");
                System.out.printf("Your Total Taka Is: %d\n",100*need);
                System.out.print("Press Any key and Enter: ");
                scanner.next();
                return need;
        }
}
