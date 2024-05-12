import java.util.Scanner;

public class CancelTicket extends AvailabeSeats {
    Scanner scanner = new Scanner(System.in);

    int delete(String[][]availabeseats1,String[][]availabeseats2,String[][] availabeseats3,String[][] availabeseats4,String[][] availabeseats5)
    {
        System.out.print("Enter Bus Number: ");
        int choice=scanner.nextInt();
        int row=0,column=0;
        scanner.nextLine();
        System.out.print("Enter Your name: ");
        String name= scanner.nextLine();
        int c=0;

        switch (choice) {
            case 1 -> {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (availabeseats1[i][j].equals(name)) {
                            row = i;
                            column = j;
                            c = 1;
                            break;
                        }
                    }
                    if (c == 1) break;
                }
                if (c == 1) {
                    availabeseats1[row][column] = "Empty";
                    System.out.println("Seat Canceled");
                } else System.out.println("No one is Booked with this name");
            }
            case 2 -> {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (availabeseats2[i][j].equals(name)) {
                            row = i;
                            column = j;
                            c = 1;
                            break;
                        }

                    }
                    System.out.println();
                }
                if (c == 1) {
                    availabeseats2[row][column] = "Empty";
                    System.out.println("Seat Canceled");
                    c=2;
                } else System.out.println("No one is Booked with this name");
            }
            case 3 -> {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (availabeseats3[i][j].equals(name)) {
                            row = i;
                            column = j;
                            c = 1;
                            break;
                        }
                    }
                }
                if (c == 1) {
                    availabeseats3[row][column] = "Empty";
                    System.out.println("Seat Canceled");
                    c=3;
                } else System.out.println("No one is Booked with this name");
            }
            case 4 -> {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (availabeseats4[i][j].equals(name)) {
                            row = i;
                            column = j;
                            c = 1;
                            break;
                        }
                    }
                }
                if (c == 1) {
                    availabeseats4[row][column] = "Empty";
                    System.out.println("Seat Canceled");
                    c=4;
                } else System.out.println("No one is Booked with this name");
            }
            case 5 -> {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (availabeseats5[i][j].equals(name)) {
                            row = i;
                            column = j;
                            c = 1;
                            break;
                        }
                    }
                }
                if (c == 1) {
                    availabeseats5[row][column] = "Empty";
                    System.out.println("Seat Canceled");
                    c=5;
                } else System.out.println("No one is Booked with this name");
            }
            default -> System.out.println("Invalid choice");
        }
        System.out.print("Enter any key and Enter: ");
        scanner.next();
        if(c==1)return 1;
        else if(c==2)return 2;
        else if(c==3)return 3;
        else if(c==4)return 4;
        else if(c==5)return 4;
        else return 0;
    }

}
