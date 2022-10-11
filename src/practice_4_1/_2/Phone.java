package practice_4_1._2;

public class Phone {
    private String model;
    private String number;
    private double weight;

    public Phone(String model, String number, double weight) {
        //new Phone(model,number);
        this(model, number);
        this.weight = weight;
    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public Phone() {
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number){
        System.out.println("Звонит " + name);
        System.out.println("С номера " + number);
    }
    
    public void sendMessage(String... numbers){
        for (String number: numbers) {
            System.out.println(number);
        }
    }

    public String getNumber() {
        return number;
    }


}
