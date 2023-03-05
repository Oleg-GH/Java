package SeminarOOP0303_HW;

public class Eggs extends Foods{
    Integer qtyInBox;

    public Eggs(String name, Integer price, Integer quantity, String unit, String keepingTime, Integer qtyInBox) {
        super(name, price, quantity, unit, keepingTime);
        this.qtyInBox = qtyInBox;
    }    

    @Override
    public String toString() {
        return super.toString() + ", qtyInBox=" + this.qtyInBox;
    }
}
