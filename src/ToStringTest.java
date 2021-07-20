import com.entity.Book;
import com.entity.Fiction;

public class ToStringTest {
    Book book = new Book("001","Wolf","Tom");

    public static void main(String[] args) {
        //System.out.println((new ToStringTest().getBook()));
        Fiction fiction = new Fiction("001","Wolf","Tom");
    }

    public Book getBook() {
        return book;
    }
}