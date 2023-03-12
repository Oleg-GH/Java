package SeminarOOP1003_HW_3;

public abstract class Figure implements Comparable<Figure>{
 
    public abstract double area();

    public abstract double perimeter();

    public double getArea() {
        return area();
    }

    public double getPerimeter() {
        return perimeter();
    }    

    @Override
    public String toString() {
        return "Фигура " + getClass().getSimpleName() +
                " периметр = " + perimeter() +
                " см, площадь = " + area() + " кв. см.";
    }

    @Override
    public int compareTo(Figure o) {
        return Double.compare(this.area(), o.area()); 
    }
}
    


