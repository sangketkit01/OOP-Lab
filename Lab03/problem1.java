package Lab03;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter an Integer number : ");
        long number = kbd.nextLong();

        int digit = 0;
        int even = 0;
        for (int i = 0; i < String.valueOf(number).length(); i++) {
            digit++;
            if (Long.valueOf(String.valueOf(number).charAt(i)) % 2 == 0) {
                even++;
            }
        }
        System.out.printf("Number of digits : %d%nNumber of even digits : %d%n", digit, even);
        String a = String.valueOf(true);
        System.out.println(a instanceof String);
        kbd.close();
    }
}
