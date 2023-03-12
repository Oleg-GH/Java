package SeminarOOP1003_HW_3;

public class Program {
    public static void main(String[] args) {

        FigureCollection collection = new FigureCollection();

        try {
            Triangle triangle = new Triangle(5,10,8);
            double per = triangle.perimeter();
            double sq = triangle.area();
            collection.addFigure(triangle);
            System.out.println("\nПериметр треугольника " + per);
            System.out.println("Площадь  треугольника " + sq);
            System.out.println();


        } catch (Exception e){
            System.out.println(e);
        }

        try{
            Circle circle = new Circle(5);
            double circumferenceLength = circle.circumferenceLength();
            double areaCircle = circle.area();
            collection.addFigure(circle);
            System.out.println("Длина окружности " + circumferenceLength);
            System.out.println("Площадь   круга  " + areaCircle);
            System.out.println();
        } catch (Exception e){
            System.out.println(e);
        }

        try{
            Square square = new Square(9);
            double perimeterSquare = square.perimeter();
            double areaSquare = square.area();
            collection.addFigure(square);
            System.out.println("Периметр квадрата " + perimeterSquare);
            System.out.println("Площадь  квадрата " + areaSquare);
            System.out.println();
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }

        try{
            Rectangle rectangle = new Rectangle(5,9);
            double perimeterRectangle = rectangle.perimeter();
            double areaRectangle = rectangle.area();
            collection.addFigure(rectangle);
            System.out.println("Периметр прямоугольника " + perimeterRectangle);
            System.out.println("Площадь  прямоугольника " + areaRectangle);
            System.out.println();

        } catch (IllegalArgumentException e){
            System.out.println(e);
        }

        Console menu = new Console(collection);
        menu.run();

    } 
}
