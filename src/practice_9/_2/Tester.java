package practice_9._2;

public class Tester {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        fill(students);
        print(students);
        quickSort(students, 0, 9);
        print(students);
    }

    private static void fill(Student[] students) {
        for (int i = 0; i < 10; i++) {
            students[i] = new Student(10 - i);
        }
    }

    private static void print(Student[] students) {
        for (int i = 0; i < 10; i++) {
            System.out.print(students[i].GPA + " ");
        }
        System.out.println();
    }

    public static void quickSort(Student[] sortArr, int low, int high) {
        //завершить,если массив пуст или уже нечего делить
        if (sortArr.length == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        Student border = sortArr[middle];

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (sortArr[i].compareTo(border) < 0) i++;
            while (sortArr[j].compareTo(border) > 0) j--;
            if (i <= j) {
                Student swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }
}
