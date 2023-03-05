package SeminarOOP0303_HW;

public class Nappy extends Hygiene {
    Integer size;
    Integer minWeight;
    Integer maxWeight;
    String type;

    public Nappy(String name, Integer price, Integer quantity, String unit, Integer qtyInBox,
                 Integer size, Integer minWeight, Integer maxWeight, String type) {
        super(name, price, quantity, unit, qtyInBox);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", size=" + this.size
                                + ", minWeight=" + this.minWeight
                                + ", maxWeight=" + this.maxWeight
                                + ", type='" + this.type + '\'';
    }
}    
