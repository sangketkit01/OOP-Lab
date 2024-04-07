package Lab07;

public class Test {
    public static void main(String[] args) {
        Vehicle obj1 = new Vehicle("Boat", 0);
        System.out.println(obj1);
        Vehicle obj2 = new Vehicle("Car", 500000);
        System.out.println(obj2);
        System.out.printf("Deteriorate of obj2 = %,.2f\n", obj2.calDeteriorate(10));

        RentCar obj3 = new RentCar("Car", 200000, "Car01", 550);
        System.out.println(obj3);
        RentCar obj4 = new RentCar("Car", 500000, "Car02", 800);
        System.out.println(obj4);
        System.out.printf("Rental cost of obj4 one week = %,d\n", obj4.calCost());
        System.out.printf("Rental cost of obj4 ten days= %,d\n", obj4.calCost(10));
        System.out.printf("Deteriorate of obj4 = %,.2f\n", obj4.calDeteriorate(10));
    }
}
