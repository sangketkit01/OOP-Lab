package Lab05;

public class Employee {
    private String name;
    private int salary;
    
    public Employee(){
        name = "";
        salary = 15000;
    }
    public Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getYearSalary(){
        return salary*12;
    }
    public void upSalary(int rate){
        if(rate >= 0 && rate <=100){
            System.out.printf("If salary is raised %d%%, the salary will be %,.2f bath/month.",rate,getSalary() + (getSalary() * rate/100.0));
        } else{
            System.out.printf("%d is invalid percent.",rate);
        }
    }

    //ไม่ต้องสนใจ
    public String toString(){
        return String.format("%s's salary is %,d bath/month (%,d bath/year).",getName(),getSalary(),getYearSalary());
    }
}   
