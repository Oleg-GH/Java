package SeminarOOP0703_HW2_2.Birds;

import SeminarOOP0703_HW2_2.Abstract.Birds;

public class Stork extends Birds {

    public Stork(int height, int weight, String eyesColor, int flightAltitude) {
        super(height, weight, eyesColor, flightAltitude);
    }

    @Override
    public String makeSound() {
        return "Аист: Клак-клак-клак!";
    }

    @Override
    public String fly() {
        return "Аист: " + super.fly();
    }
}
