package SeminarOOP0303_HW;

public class Foods extends Goods{
    String keepingTime;

    public Foods(String name, Integer price, Integer quantity, String unit, String keepingTime) {
        super(name, price, quantity, unit);
        this.keepingTime = keepingTime;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", keepingTime='" + this.keepingTime + '\'';
    }
}
