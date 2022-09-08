package practice_2._7;

public class BookTester {
    public static void main(String[] args) {
        Book book = new Book("Tolstoy", "War and peace", 1865);
        System.out.println(book);
        book.setName("Crime and Punishment");
        book.setAuthor("Dostoevky");
        book.setYear(1866);
        System.out.println(book);
    }
}
