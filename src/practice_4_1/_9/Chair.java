package practice_4_1._9;

public class Chair extends Furniture {
    @Override
    void description() {
        System.out.println("It is a chair");
    }

    public Chair() {
        super(50);
    }

}
