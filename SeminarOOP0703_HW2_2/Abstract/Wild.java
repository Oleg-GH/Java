package SeminarOOP0703_HW2_2.Abstract;

public abstract class Wild extends Animal{
    protected String habitat;
    protected String foundDate;

    public Wild(int height, int weight, String eyesColor, String habitat, String foundDate) {
        super(height, weight, eyesColor);
        this.habitat = habitat;
        this.foundDate = foundDate;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getFoundDate() {
        return foundDate;
    }
}
