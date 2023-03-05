package SeminarOOP0303_HW;

public class Bread extends Foods{
    String flourType;

    public Bread(String name, Integer price, Integer quantity, String unit, String keepingTiime, String flourType) {
        super(name, price, quantity, unit, keepingTiime);
        this.flourType = flourType;
    }

    @Override
    public String toString() {
        return super.toString() + ", flourType='" + this.flourType + '\'';
    }
}
