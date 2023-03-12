package SeminarOOP1003_HW_3;

public class Square extends Rectangle {
    public Square(int firstSide) {
        super(firstSide, firstSide);
    }

    @Override
    public int compareTo(Figure o) {
        return Double.compare(this.area(), o.area());    
    }

    @Override
    public String toString() {
        return "Фигура " + this.getClass().getSimpleName() +
                " со стороной " + firstSide + " см, периметр = " + perimeter() +
                " см, площадь = " + area() + " кв. см.";
    }
}
