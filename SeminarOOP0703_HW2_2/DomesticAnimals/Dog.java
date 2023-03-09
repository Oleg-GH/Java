package SeminarOOP0703_HW2_2.DomesticAnimals;

import SeminarOOP0703_HW2_2.Abstract.Domestic;
import SeminarOOP0703_HW2_2.Interfaces.IbeeingTrained;
import SeminarOOP0703_HW2_2.Interfaces.ItrainingAvailability;

public class Dog extends Domestic implements IbeeingTrained, ItrainingAvailability {
    protected boolean trainingAvailability;

    public Dog(int height, int weight, String eyesColor, String nickname,
               String breed, String vaccinated, String woolColor, boolean trainingAvailability) {
        super(height, weight, eyesColor, nickname, breed, vaccinated, woolColor);
        this.trainingAvailability = trainingAvailability;
    }

    @Override
    public String makeSound() {
        return super.nickname + ": Гав-гав!";
    }

    @Override
    public String train() {
        return super.nickname + " дрессируется";
    }
    @Override
    public String tender() {
        return super.nickname + " виляет хвостиком";
    }

    @Override
    public boolean hasTrainingAvailability() {
        return trainingAvailability;
    }
}
