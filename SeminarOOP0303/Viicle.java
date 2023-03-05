package SeminarOOP0303;

public class Viicle {
   public String color;
   public String model;
   public int wheel;
   public int weight;
   public int speed;

   public void go() {
    System.out.println("Vheicle Go");
   }

   public void getProperties(){
      System.out.printf("color: %s, model: %s, wheel: %d, weight: %d, speed: %d\n", 
                        color, model, wheel, weight, speed );
   }
}




