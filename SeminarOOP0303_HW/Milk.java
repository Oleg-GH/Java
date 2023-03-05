package SeminarOOP0303_HW;

public class Milk extends Foods{
    protected String volume;
    protected String fat;
    
    public Milk(String name, Integer price, Integer quantity, String unit, String keepingTime, 
                String volume, String fat) {
        super(name, price, quantity, unit, keepingTime);
        this.volume = volume;
        this.fat = fat;
        
    }
    
    @Override
    public String toString() {
        return super.toString() + ", volume='" + this.volume + "', fat='" + this.fat + '\'';
    }
}


