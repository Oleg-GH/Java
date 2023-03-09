package SeminarOOP0703_HW2_2.DomesticAnimals;

import SeminarOOP0703_HW2_2.Abstract.Domestic;
import SeminarOOP0703_HW2_2.Interfaces.Ihairiness;

public class Cat extends Domestic implements Ihairiness {
    protected boolean hasHairiness;

    public Cat(int height, int weight, String eyesColor, String nickname,
               String breed, String vaccinated, String woolColor, boolean hasHairiness) {
        super(height, weight, eyesColor, nickname, breed, vaccinated, woolColor);
        this.hasHairiness = hasHairiness;
        if (!hasHairiness)
            super.woolColor = "None";
    }
    @Override
    public String makeSound() {
        return super.nickname + ": Мяяяяяу!";
    }

    @Override
    public String tender() {
        return super.nickname +": Муррррр! Мурррр!";
    }


    @Override
    public boolean hasHairiness() {
        return hasHairiness;
    }
}
