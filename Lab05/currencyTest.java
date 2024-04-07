package Lab05;

public class currencyTest {

    public static void main(String[] args) {
        currency c1 = new currency(37.66);
        System.out.println(c1);
        System.out.printf("$25.5 = %.2f Bath", c1.convertToTHB(25.5));
    }
}
