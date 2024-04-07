package Lab08;

public class Fiction implements Book {

    @Override
    public String getContent() {
       return String.format("\"Easy Hacking\" is a Fiction's content from %s",publisher);
    }
    
}
 