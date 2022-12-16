package practice_6._11;

public class Converter implements Convertable {
    private int c;

    public Converter(int c){
        this.c = c;
    }


    @Override
    public void convert() {
        System.out.println(c + " по Цельсию\n" + (c+273) + " по Кельвину\n" +  (c*9/5 + 32) + " по Фаренгейту");
    }
}
