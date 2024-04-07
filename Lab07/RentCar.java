package Lab07;

public class RentCar extends Vehicle {
    private int id, rPrice;
    private String name;

    public RentCar(String type, int price, String name, int rPrice) {
        super(type, price);
        setName(name);
        setrPrice(rPrice);
        id = super.getCount();
    }

    public int getId() {
        return id;
    }

    public int getrPrice() {
        return rPrice;
    }

    public String getName() {
        return name;
    }

    public void setrPrice(int rPrice) {
        this.rPrice = rPrice < 0 ? 500 : rPrice;
    }

    public void setName(String name) {
        this.name = name.isEmpty() ? "Undefined name" : name;
    }

    public int calCost() {
        return rPrice * 7;
    }

    public int calCost(int day) {
        return rPrice * day;
    }

    @Override
    public double calDeteriorate(int year) {
        return (super.getPrice() - (super.getPrice() * 0.05)) / year;
    }

    public String toString() {
        return String.format("RentCar [id = %d, name = %s, type = %s, price = %d, rPrice = %d]", getId(), getName(),
                super.getType(), super.getPrice(), getrPrice());
    }
}
