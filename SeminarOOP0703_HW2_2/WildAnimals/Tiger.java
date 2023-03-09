package SeminarOOP0703_HW2_2.WildAnimals;

import SeminarOOP0703_HW2_2.Abstract.Wild;

public class Tiger extends Wild {

    public Tiger(int height, int weight, String eyesColor, String habitat, String foundDate) {
        super(height, weight, eyesColor, habitat, foundDate);
    }

    @Override
    public String makeSound() {
        return "Тигр: Ррр-р-р!";
    }
}
