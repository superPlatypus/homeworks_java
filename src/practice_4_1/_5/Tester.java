package practice_4_1._5;

public class Tester {
    public static void main(String[] args) {
        Reader reader = new Reader("Vasya");
        reader.takeBook(3);
        reader.takeBook("War and peace", "some book");
        reader.takeBook(new Book("war and peace", "Tolstoy"), new Book("some name", "some author"));
    }


}
