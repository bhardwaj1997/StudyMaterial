package lambda.example;

import java.util.ArrayList;
import java.util.List;

public class BooksDOA {

    private List<Book> book;

    public List<Book> getBook() {
        List<Book> book = new ArrayList<>();
        book.add(new Book(101, "Core Java", 500));
        book.add(new Book(155, "Hibernate", 223));
        book.add(new Book(101, "Spring", 220));
        book.add(new Book(101, "Apring", 220));
        System.out.println("book = " + book);
        return book;
    }
}
