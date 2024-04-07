package Lab03;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        try (Scanner kbd = new Scanner(System.in)) {
            int days = 0;

            for (;;) {
                System.out.print("Enter month [1-12] : ");
                int month = kbd.nextInt();
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    days = 31;
                    break;
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    days = 30;
                    break;
                } else if (month == 2) {
                    days = 28;
                    break;
                } else {
                    System.out.println("Invalid month number. Please enter number between 1 and 12.");
                    continue;
                }
            }
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            for (int i = 1; i <= days; i++) {

                if (i == 1) {
                    System.out.printf("              %d", i);
                } else {
                    if (i >= 10) {
                        System.out.printf(" %d ", i);
                    } else if (i <= 4) {
                        System.out.printf("   %d", i);
                    } else {
                        System.out.printf("  %d ", i);
                    }
                }
                if (i % 7 == 4) {
                    System.out.println();
                }
            }
            kbd.close();
        }
    }
  
}
