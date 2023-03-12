package SeminarOOP1003_HW_3;

public class Triangle extends Figure {
    private int firstSide;
    private int secondSide;
    private int thirdSide;


    public Triangle(int firstSide, int secondSide, int thirdSide) throws IllegalArgumentException{
        if(firstSide + secondSide <= thirdSide || secondSide + thirdSide <= firstSide ||
           firstSide + thirdSide <= secondSide || firstSide < 1 || secondSide < 1 || thirdSide < 1) {
            throw new IllegalArgumentException("Нет такого треугольника");
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double perimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.round(Math.sqrt(p * (p - firstSide) * (p - secondSide) * 
                         (p - thirdSide)) * 100.0) / 100.0;
    }

    @Override
    public int compareTo(Figure o) {
        return Double.compare(this.area(), o.area());    
    }
    
    @Override
    public String toString() {
        return "Фигура " + this.getClass().getSimpleName()  +
                " со сторонами " + this.firstSide + ", " + this.secondSide +
                " и " + this.thirdSide + " см, периметр = " + perimeter() +
                " см, площадь = " + area() + " кв. см.";
    }
}
