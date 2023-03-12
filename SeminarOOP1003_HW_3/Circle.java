package SeminarOOP1003_HW_3;

public class Circle extends Figure{
    private int radius;

    public Circle(int radius) {
        if(radius < 1){
            throw new IllegalArgumentException(String.format("Круга с радиусом %d нет.", radius));
        }
        this.radius = radius;
    }

    public double circumferenceLength() {
        return Math.round(2 * Math.PI * radius *100.0) / 100.0;
    }
    
    @Override
    public double perimeter() {
        return circumferenceLength();
    }

    @Override
    public double area() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }


    @Override
    public int compareTo(Figure o) {
        return Double.compare(this.area(), o.area());    
    }

    @Override
    public String toString() {
        return "Фигура " + this.getClass().getSimpleName()  +
                " с радиусом " + this.radius + " см, длина окружности = " + perimeter() +
                " см, площадь = " + area() + " кв. см.";
    }
}
