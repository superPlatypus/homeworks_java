package practice_4;


import java.util.Scanner;

public class timesOfYear {
    public timesOfYear() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любимое время года\n");
        String favYearTime = sc.next();
        Years time = timesOfYear.Years.valueOf(favYearTime);
        switch (time) {
            case Summer:
                System.out.println("Я люблю Лето!");
                break;
            case Autumn:
                System.out.println("Я люблю Осень!");
                break;
            case Winter:
                System.out.println("Я люблю Зиму!");
                break;
            case Spring:
                System.out.println("Я люблю Весну!");
        }

        System.out.println("Все времена года: \n");
        Years[] q = timesOfYear.Years.values();


        for(int i = 0; i < q.length; ++i) {
            Years times = q[i];
            System.out.println("" + times + "; Temperature = " + times.getAverageTemp() + "; " + times.getDescription());
        }

    }

    public static enum Years {
        Summer(30, "Самое теплое время года"),
        Autumn(15, "Пора на учебу"),
        Winter(-10, "Новый год"),
        Spring(5, "Снег тает");

        private int averageTemp;
        private String description;

        private Years(int temp, String desc) {
            this.averageTemp = temp;
            this.description = desc;
        }

        public int getAverageTemp() {
            return this.averageTemp;
        }

        public String getDescription() {
            return this.description;
        }
    }
}
