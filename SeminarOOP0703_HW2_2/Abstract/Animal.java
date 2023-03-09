package SeminarOOP0703_HW2_2.Abstract;

public abstract class Animal {
    protected int height;
    protected int weight;
    protected String eyesColor;

    public Animal(int height, int weight, String eyesColor) {
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public abstract String makeSound();

    @Override
    public String toString() {
        return "Животное{" +
                "высота(рост)=" + height +
                ", вес=" + weight +
                ", цвет глаз='" + eyesColor + '\'' +
                '}';
    }
}
