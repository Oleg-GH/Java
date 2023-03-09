package SeminarOOP0703_HW2_2.Birds;

import SeminarOOP0703_HW2_2.Abstract.Birds;

public class Hen extends Birds {

    public Hen(int height, int weight, String eyesColor) {
        super(height, weight, eyesColor, 1);
    }

    @Override
    public String makeSound() {
        return "Курица: Ко-ко-ко-ко!!!!";
    }

    @Override
    public String fly() {
        return "Курица: " + super.fly();
    }
}
