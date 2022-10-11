package practice_4_1._5;

public class Reader {
    private String name;
    private int number;
    private String faculty;
    private String date;
    private String phoneNumber;

    public Reader(String name) {
        this.name = name;
    }

    public void takeBook(int n){
        System.out.println(name + " took " + n + " books");
    }

    public void takeBook(String... books){
        System.out.println(name + " took " + " those books:");
        for (String book: books) {
            System.out.println(book);
        }

    }

    public void takeBook(Book... books){
        System.out.println(name + " took " + " those books:");
        for (Book book: books) {
            System.out.println(book.name + " written by " + book.author);
        }
    }

    public void returnBook(int n){
        System.out.println(name + " returned " + n + " books");
    }

    public void returnBook(String... books){
        System.out.println(name + " returned " + " those books:");
        for (String book: books) {
            System.out.println(book);
        }
    }

    public void returnBook(Book... books){
        System.out.println(name + " took " + " those books:");
        for (Book book: books) {
            System.out.println(book.name + " written by " + book.author);
        }
    }

}
