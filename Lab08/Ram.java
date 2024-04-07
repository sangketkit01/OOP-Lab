package Lab08;

public class Ram {
    private int sizeInKB;

    public Ram(int sizeInKB){
        setSizeInKB(sizeInKB);
    }
    public int getSizeInKB(){
        return sizeInKB;
    }
    public void setSizeInKB(int sizeInKB){
        this.sizeInKB = sizeInKB;
    }
    public int getSizeInGB(){
        return sizeInKB/1024;
    }
    public String toString(){
        return String.format("Ram : %dKB (%dGB)",getSizeInKB(),getSizeInGB());
    }
}
