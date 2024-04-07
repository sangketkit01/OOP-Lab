package Lab08;

public class CPU {
    private String model;

    public CPU(String model){
        setModel(model);
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String toString(){
        return String.format("CPU : %s",getModel());
    }
}
