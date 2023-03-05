package SeminarOOP0303_HW;

public class Goods {
    String name;
    private Integer price;
    private Integer quantity;
    private String unit;

    public Goods(String name, Integer price, Integer quantity, String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    
    @Override
    public String toString() {
        return  "name='" + this.name + '\'' +
                ", price=" + this.price +
                ", quantity=" + this.quantity +
                ", unit='" + this.unit + '\'';
    }
}
