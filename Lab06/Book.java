package Lab06;

public class Book {
    protected String title, publisher;

    public Book() {
        setTitle("");
        setPublisher("");
    }

    public Book(String title, String publisher) {
        setTitle(title);
        setPublisher(publisher);
    }

    public void setTitle(String title) {
        if(title.isEmpty()){
            System.out.println("Title cannot be empty.");
            this.title = this.title == null ? "Unknown title" : getTitle();
        }else{
            this.title = title;
        }

    }

    public String getTitle() {
        return title;
    }

    public void setPublisher(String publisher) {
        if(publisher.isEmpty()){
            System.out.println("Publisher cannot be empty.");
            this.publisher = this.publisher == null ? "Unknown publisher" : getPublisher();
        }else{
            this.publisher = publisher;
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public String toString() {
        return String.format("%s [title = %s, publisher = %s]",getClass().getSimpleName(), getTitle(), getPublisher());
    }

}
