package Lab02;

import java.util.Scanner;

public class problem02 {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.print("salary : ");
		int salary = kbd.nextInt()*12-100000;
		double rate = 0;
		if(salary > 1 && salary <= 150000) {
			System.out.println("Your tax is exemption.");
			System.exit(0);
		}else if(salary > 150000 && salary <= 300000) {
			rate = 0.05;
		}else if(salary > 300000 && salary <= 500000) {
			rate = 0.10;
		}else if(salary > 500000 && salary <= 750000) {
			rate = 0.15;
		}else if(salary > 750000 && salary <= 1000000) {
			rate = 0.20;
		}
		else if(salary > 1000000 && salary <= 2000000) {
			rate = 0.25;
		}
		else if(salary > 2000000 && salary <= 5000000) {
			rate = 0.30;
		}
		else {
			rate = 0.35;
		}
		System.out.printf("Tax rate is %.0f%s %nYour tax is %,.0f bath",rate*100,"%",salary*rate);
		kbd.close();
	}
}
