package SeminarOOP0303_HW;

public class Goods {
    protected String name;
    protected Integer price;
    protected Integer quantity;
    protected String unit;

    public Goods(String name, Integer price, Integer quantity, String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    //public Goods() {
    //}
    
    @Override
    public String toString() {
        return  "name='" + this.name + '\'' +
                ", price=" + this.price +
                ", quantity=" + this.quantity +
                ", unit='" + this.unit + '\'';
    }
}
