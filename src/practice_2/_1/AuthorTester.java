package practice_2._1;

import java.util.Scanner;

public class AuthorTester {
    public static void main(String[] args) {
        Author author = new Author();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        author.setName(sc.nextLine());
        System.out.println("Enter email:");
        author.setEmail(sc.nextLine());
        System.out.println("Enter gender:");
        author.setGender(sc.next().charAt(0));
        System.out.println(author);
    }
}
