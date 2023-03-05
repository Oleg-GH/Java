package SeminarOOP0303_HW;

public class Hygiene extends Goods{
    protected Integer qtyInBox;

    public Hygiene(String name, Integer price, Integer quantity, String unit, Integer qtyInBox) {
        super(name, price, quantity, unit);
        this.qtyInBox = qtyInBox;
    }

    @Override
    public String toString(){
        return super.toString() + ", qtyInBox=" + this.qtyInBox;
    }
}
