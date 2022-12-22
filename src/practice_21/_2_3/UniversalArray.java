package practice_21._2_3;
import java.util.Scanner;

public class UniversalArray<T> {
    Scanner sc = new Scanner(System.in);
    private int size;
    private Object[] array;
    public UniversalArray(int size) throws Exception {
         this.size = size;
        this.array = new Object[size];
         System.out.println("Type " + this.size + " array elements: ");
         for (int i = 0; i < this.size; i++) {
             try{
                 this.array[i] = (T) sc.next();
             }
             catch (Exception e){
                 throw new Exception("Error while generic transform");
             }
         }
    }
    public void showArray() {
        for (Object tmp : this.array) {
            System.out.print(tmp + " ");
        }
    }

    public Object getElement(int index) {
        try {
            return this.array[index - 1];
        }
        catch (Exception e) {
            throw new IndexOutOfBoundsException("wrong index");
        }
    }

}
