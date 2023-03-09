package SeminarOOP0703_HW2_2.WildAnimals;

import SeminarOOP0703_HW2_2.Abstract.Wild;
import SeminarOOP0703_HW2_2.Interfaces.IpackLeader;

public class Wolf extends Wild implements IpackLeader {
    protected boolean packLeader;

    public Wolf(int height, int weight, String eyesColor, String habitat, String foundDate, boolean packLeader) {
        super(height, weight, eyesColor, habitat, foundDate);
        this.packLeader = packLeader;
    }

    @Override
    public String makeSound() {
        return "Волк: Оууу-уу-уу!";
    }

    @Override
    public boolean isPackLeader() {
        return packLeader;
    }
}
