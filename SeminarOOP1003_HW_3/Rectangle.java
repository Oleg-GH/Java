package SeminarOOP1003_HW_3;

public class Rectangle extends Figure {
    protected int firstSide;
    protected int secondSide;

    public Rectangle(int firstSide, int secondSide){
        if(firstSide < 1 || secondSide < 1){
            throw new IllegalArgumentException("Нет такого прямоугольника");
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double perimeter() {
        return (firstSide + secondSide) * 2;
    }

    @Override
    public double area() {
        return firstSide * secondSide;
    }

    @Override
    public int compareTo(Figure o) {
        return Double.compare(this.area(), o.area());    
    }

    @Override
    public String toString() {
        return "Фигура " + this.getClass().getSimpleName()  +
                " со сторонами " + this.firstSide + " и " + this.secondSide +
                " см, периметр = " + perimeter() +
                " см, площадь = " + area() + " кв. см.";
    }
}
