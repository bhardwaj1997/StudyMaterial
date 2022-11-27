package lambda.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    public List<Book> getBooksinSort(){
        List<Book> allBook =new BooksDOA().getBook();
//        Collections.sort(allBook , new MyComparator());
       // Collections.sort(allBook , (o1,o2)-> o2.getName().compareTo(o2.getName()));
        allBook.stream().sorted(Comparator.comparing(Book::getPages).reversed() ).forEach(t-> System.out.println("t = " + t));
        return allBook;
    }

    public static void main(String[] args) {
        List<Book> getsortBook = new BookService().getBooksinSort();
        getsortBook.stream().collect(Collectors.toList());
        System.out.println("getsortBook = " + getsortBook);
    }


}

//class  MyComparator implements Comparator<Book>{
//
//    @Override
//    public int compare(Book book, Book t1) {
//        return book.getName().compareTo(t1.getName());
//    }
//}
