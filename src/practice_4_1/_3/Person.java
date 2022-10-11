package practice_4_1._3;

public class Person {
    private String fullnname;
    private int age;

    public void move(){
        System.out.println("Какой-то человек ходит");
    }

    public void talk(){
        System.out.println("Какой-то человек говорит");
    }

    public Person() {
    }

    public Person(String fullnname, int age) {
        this.fullnname = fullnname;
        this.age = age;
    }
}
