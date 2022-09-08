package practice_2._5;

public class Dog {
    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int to_human_ages(){
        return age*7;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + "\n"
                + "Age: " + age;

    }
}
