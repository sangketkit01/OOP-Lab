package Lab07;

public class Vehicle {
    protected String type;
    protected int price;
    static int count;

    public Vehicle(String type , int price){
        setPrice(price);
        setType(type);
        setCount();
    }
    public void setType(String type){
        this.type = type.isEmpty() ? "Undefined type" : type;
    }
    public String getType(){
        return type;
    }
    public void setPrice(int price){
        this.price = price < 0 ? 50000 : price; 
    }
    public int getPrice(){
        return price;
    }
    public void setCount(){
        count++;
    }
    public int getCount(){
        return count;
    }
    public double calDeteriorate(int year){
        return (getPrice() - (getPrice()*0.1))/year;
    }
    public String toString(){
        return String.format("%s [type = %s, price = %d, count = %d]",getClass().getSimpleName(),getType(),getPrice(),getCount());
    }
}
