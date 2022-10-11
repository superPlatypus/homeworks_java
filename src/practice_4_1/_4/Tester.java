package practice_4_1._4;

public class Tester {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3,3);
        matrix.fillRandom();
        System.out.println("First matrix");
        matrix.print();
        Matrix tmp = new Matrix(3,3);
        tmp.fillRandom();
        System.out.println("Second matrix");
        tmp.print();
        matrix.sum(tmp);
        System.out.println("Sum of matrixes");
        matrix.print();
        matrix.multByNumber(10);
        System.out.println("Mult by 10");
        matrix.print();
    }
}
