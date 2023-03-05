package SeminarOOP0303_HW;

public class Paper extends Hygiene {
    protected Integer layer;

    public Paper(String name, Integer price, Integer quantity, String unit, Integer qtyInBox, Integer layer){
        super(name, price, quantity, unit, qtyInBox);
        this.layer = layer;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", слоев: " + layer;
    }
}
