package SeminarOOP0303;

public class Bike extends Viicle{
    public Bike(String color, String model, int wheel, int weight, int speed) {
        this.color = color;
        this.model = model;
        this.wheel = wheel;
        this.weight = weight;
        this.speed = speed;
    }    

    @Override
   public void go() {
    System.out.printf("Bike go\n");
   }
}
