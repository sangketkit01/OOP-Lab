package Lab06;

public class Megazine extends Book {
    private int issueNumber,price;
    public Megazine(){
        setPrice(0);
        setIssueNumber(0);
    }
    public Megazine(String title,String publisher,int issueNumber,int price){
        super(title,publisher);
        setPrice(price);
        setIssueNumber(issueNumber);
    }
    public void setIssueNumber(int issueNumber){
        this.issueNumber = issueNumber <= 0 ? 1 : issueNumber;
    }
    public int getIssueNumber(){
        return issueNumber;
    }
    public void setPrice(int price){
        this.price = price <= 0 ? 30 : price;
    }
    public int getPrice(){
        return price;
    }
    public int getYearSubscriptionPrice(){
        return price *12;
    }
    public String toString(){
        return String.format("%s [title = %s, publisher = %s, issueNumber = %d, price = %d]",getClass().getSimpleName(),super.getTitle(),super.getPublisher(),getIssueNumber(),getPrice());
    }
}
