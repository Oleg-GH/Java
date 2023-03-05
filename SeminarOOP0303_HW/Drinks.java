package SeminarOOP0303_HW;

public class Drinks extends Goods{
    protected String volume;
    
    public Drinks(String name, Integer price, Integer quantity, String unit, String volume) {
        super(name, price, quantity, unit);
        this.volume = volume;
    }    

    @Override
    public String toString() {
        return super.toString() + ", volume='" + this.volume + '\'';
    }
}
