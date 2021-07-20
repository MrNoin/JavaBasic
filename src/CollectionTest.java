import com.entity.Book;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList(Collections.nCopies(5,new String("33")));
        System.out.println(Arrays.toString(bookList.toArray()));

        Collections.fill(bookList,new Book("001","hill","cat"));
        System.out.println(Arrays.toString(bookList.toArray()));

        System.out.println(Collections.min(bookList));

        Collections.max(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return 0;
            }
        });
    }
}
