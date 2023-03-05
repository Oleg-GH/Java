package SeminarOOP0303_HW;

public class Kids extends Goods {
    Integer minAge;
    String allergen;

    public Kids(String name, Integer price, Integer quantity, String unit, Integer minAge, String allergen) {
        super(name, price, quantity, unit);
        this.minAge = minAge;
        this.allergen = allergen;
    }

    @Override
    public String toString() {
        return super.toString() + ", minAge=" + this.minAge + ", hypoallergenic='" + this.allergen + '\'';
    }                                                
    
}

// + ", qtyInPackage='" 