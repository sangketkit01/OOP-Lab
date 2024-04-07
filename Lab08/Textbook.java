package Lab08;

public class Textbook implements Book {

    @Override
    public String getContent() {
        return String.format("mc^2 is a Textbook's content from %s",getClass().getTypeName(),publisher);
    }
    
}
