package SeminarOOP0703_HW2_2.Abstract;

import SeminarOOP0703_HW2_2.Interfaces.Itender;

public abstract class Domestic extends Animal implements Itender {
    protected String nickname;
    protected String breed;
    protected String vaccinated;
    protected String woolColor;

    public Domestic(int height, int weight, String eyesColor, String nickname,
                    String breed, String vaccinated, String woolColor) {
        super(height, weight, eyesColor);
        this.nickname = nickname;
        this.breed = breed;
        this.vaccinated = vaccinated;
        this.woolColor = woolColor;
    }

    public String getNickname() {
        return nickname;
    }

    public String getBreed() {
        return breed;
    }

    public String getVaccinated() {
        return vaccinated;
    }

    public String getWoolColor() {
        return woolColor;
    }
}
