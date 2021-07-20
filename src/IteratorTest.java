import com.entity.Book;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        /*HashMap<String,Book> bookMap = new HashMap<>();
        bookMap.put("001",new Book("001","红楼梦","cao"));
        bookMap.put("002",new Book("002","三国","luo"));
        bookMap.put("003",new Book("003","西游记","wu"));
        bookMap.put("004",new Book("004","水浒传","shi"));

        Iterator<Map.Entry<String, Book>> bookIterator = bookMap.entrySet().iterator();
        while (bookIterator.hasNext())
        {
            System.out.println(bookIterator.next().getValue());
        }*/
        ArrayList<Book> bookList = new ArrayList();
        bookList.add(new Book("005","AAA","1"));
        bookList.add(new Book("006","BBB","2"));
        bookList.add(new Book("007","CCC","3"));
        bookList.add(new Book("008","DDD","4"));

        ListIterator<Book> bookListIterator1 = bookList.listIterator();
        ListIterator<Book> bookListIterator2 = bookList.listIterator();
        /*while(bookListIterator.hasNext())
        {
            System.out.println(bookListIterator.next().toString());
        }*/
        System.out.println(bookListIterator1.next().toString());
        System.out.println(bookListIterator2.next().toString());

    }
}
