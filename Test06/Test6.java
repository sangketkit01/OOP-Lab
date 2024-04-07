package Test06;

import Lab06.Book;

public class Test6 {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1);
        System.out.println();

        Book book2 = new Book("Guide of Elden Ring","");
        System.out.println(book2);
        book2.setTitle("");
        book2.setPublisher("Fromsoftware Inc.");
        System.out.println(book2);
    }
}
