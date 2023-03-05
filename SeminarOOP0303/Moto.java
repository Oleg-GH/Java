package SeminarOOP0303;

public class Moto extends Viicle {
    public Moto(String color, String model, int wheel, int weight, int speed) {
        this.color = color;
        this.model = model;
        this.wheel = wheel;
        this.weight = weight;
        this.speed = speed;
    //   super.getProperties();
   }

   @Override
   public void go() {
    System.out.printf("Moto go\n");
   }
}
