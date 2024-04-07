package Test06;

import Lab06.Megazine;

public class MagazineTest {
    public static void main(String[] args) {
        Megazine m = new Megazine("RO News", "COMP", 136, 20);
        System.out.println(m);
        System.out.printf("Yearly Subscription : %,d%n", m.getYearSubscriptionPrice());
        System.out.println();
        Megazine n = new Megazine();
        System.out.println(n);
    }
}
