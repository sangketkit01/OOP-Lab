package Lab02;

import java.util.Scanner;

public class problem01 {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter cost price(bath) : ");
		double cost = kbd.nextDouble();
		System.out.print("Enter selling price(bath) : ");
		double sell = kbd.nextDouble();
		
		if(sell > cost) {
			System.out.printf("You made a profit of : %.2f bath (%.2f%s)",sell-cost,((sell-cost)/cost)*100,"%");
		}else if(sell < cost) {
			System.out.printf("You incurred a loss of: %.2f baht (%.2f%s)",cost-sell,((sell-cost)/cost)*100,"%");
		}else {
			System.out.println("No Profit No Loss.");
		}
		kbd.close();
	}
}
