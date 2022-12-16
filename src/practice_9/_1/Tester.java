package practice_9._1;

public class Tester {
    public static void main(String[] args) {
        int size = 10;
        Student[] students = new Student[size];
        fill(students, size);
        print(students);
        sort(students, size);
        print(students);

    }

    private static void sort(Student[] students, int size) {
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0 && students[j - 1].number > students[j].number; j--) {
                Student tmp = students[j - 1];
                students[j - 1] = students[j];
                students[j] = tmp;
            }
        }
    }

    private static void print(Student[] students) {
        for (Student student : students) {
            System.out.print(student.number + " ");
        }
        System.out.println();
    }

    private static void fill(Student[] students, int size) {
        for (int i = 0; i < size; i++) {
            students[i] = new Student(size - i - 1);
        }
    }
}
