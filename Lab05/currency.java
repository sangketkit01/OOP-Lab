package Lab05;

public class currency {
    private double usdRate;

    public currency(double usdRate){
        this.usdRate = usdRate;
    }
    public double getUSD_Rate(){
        return usdRate;
    }
    public double convertToUSD(double thb){
        return thb/usdRate;
    }
    public double convertToTHB(double usd){
        return usd*usdRate;
    }
    public String toString(){
        return String.format("USD Rate : $1 - %.2f%n1,000.00 Bath - %.2f",getUSD_Rate(),convertToUSD(1000));
    }
}
