package SeminarOOP1003_HW_3;

import java.util.Scanner;

public class Console {
   FigureCollection figureCollection;
   
   public Console(FigureCollection figureCollection) {
        this.figureCollection = figureCollection;
   }

   public void run() {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println(
            "\nСписок доступных команд для управления фигурами:\n" +
            "1 - Вывести информацию о всех периметрах, площадях и длинах окружности всех фигур, " + 
            "где это возможно\n" +
            "2 - Добавить фигуру в коллекцию\n" +
            "3 - Удалить фигуру с указанным индексом из коллекции\n" +
            "4 - Изменить фигуру с указанным индексом\n" +
            "5 - Сортировать фигуры по площади\n" +
            "6 - Выход\n" +
            "\nВведите команду:  ");
            
            int choice = inputNaturalNumber(in);
            switch (choice) {
                case 1: figureCollection.getAllFigureInfo();
                    break;

                case 2: inputFigure(in);
                    break;

                case 3: {
                    System.out.println("\nВведите индекс фигуры, которую надо удалить из коллекции: ");
                    figureCollection.removeFigure(inputNaturalNumber(in));
                }
                    break;

                case 4: {
                    // inputFigure(in);                         // первоначальный (халтурный) вариант
                    // figureCollection.removeFigure(inputNaturalNumber(in));  

                    System.out.println("\nВведите индекс имеющейся фигуры, которую надо изменить: ");
                    int i = inputNaturalNumber(in);
                    if (figureCollection.getName(i).equals("Triangle")) {
                        System.out.println("Введите стороны треугольника через Enter: ");
                        figureCollection.set(i, new Triangle(inputNaturalNumber(in), 
                                             inputNaturalNumber(in), inputNaturalNumber(in)));
                        System.out.printf("Фигура %s изменена. \n", figureCollection.getName(i));  
                        break;                   
                    }
                    else if (figureCollection.getName(i).equals("Circle")) {
                        System.out.println("Введите радиус окружности: ");
                        figureCollection.set(i, new Circle(inputNaturalNumber(in)));
                        System.out.printf("Фигура %s изменена. \n", figureCollection.getName(i));
                        break;
                    }
                    else if (figureCollection.getName(i).equals("Square")) {
                        System.out.println("Введите сторону квадрата: ");
                        figureCollection.set(i, new Square(inputNaturalNumber(in)));
                        System.out.printf("Фигура %s изменена. \n", figureCollection.getName(i));
                    }
                    else //if (figureCollection.getName(i).equals("Rectangle")) {
                        System.out.println("Введите стороны прямоугольника через Enter: ");
                        figureCollection.set(i, new Rectangle(inputNaturalNumber(in), inputNaturalNumber(in)));
                        System.out.printf("Фигура %s изменена. \n", figureCollection.getName(i));
                        break;
                    }
          
                case 5: {
                    figureCollection.sortByArea(); 
                    System.out.println("Фигуры отсортированы по величине площади.");
                }
                    break;
                
                case 6: {
                    System.out.println("Выход из программы.");
                    in.close();
                    return;
                }
            }
        } 
    }

    int inputNaturalNumber(Scanner in) {
        int number = 0;
        boolean checkNegative = false;

        while (!checkNegative) {

            while (!in.hasNextInt()) {
                System.out.println("Вы ввели не число, пожалуйста, повторите ввод!");
                in.next();
            }
            number = in.nextInt();

            if (number < 0)
                System.out.println("Вы ввели отрицательное число, пожалуйста, повторите ввод!");
            else
                checkNegative = true;
        }
        return number;
    }   
    
    private void inputFigure(Scanner in) {
        
        System.out.println("Какую фигуру вы добавляете?\n" +
                "1 - Круг\n" +
                "2 - Треугольник\n" +
                "3 - Прямоугольник\n" +
                "4 - Квадрат");
        int choice = inputNaturalNumber(in);
        switch (choice) {
            case 1: {
                System.out.println("\nВведите радиус окружности: ");
                Integer radius = in.nextInt();
                figureCollection.addFigure(new Circle(radius));
                System.out.printf("Теперь в списке есть круг с радиусом %d.\n", radius); 
            } break;

            case 2: {
                System.out.println("\nВведите сторону 1 треугольника: ");
                Integer side1 = in.nextInt();
                System.out.println("Введите сторону 2 треугольника: ");
                Integer side2 = in.nextInt();
                System.out.println("Введите сторону 3 треугольника: ");
                Integer side3 = in.nextInt();   
                figureCollection.addFigure(new Triangle(side1, side2, side3));
                System.out.printf("Теперь в списке есть треугольник со сторонами %d, %d и %d.\n", 
                                    side1, side2, side3); 
            } break;

            case 3: {
                System.out.println("\nВведите сторону 1 прямоугольника: ");
                Integer side1 = in.nextInt();
                System.out.println("Введите сторону 2 прямоугольника: ");
                Integer side2 = in.nextInt();
                figureCollection.addFigure(new Rectangle(side1, side2));  
                System.out.printf("Теперь в списке есть прямоугольник со сторонами %d и %d.\n", 
                        side1, side2);      
            } break;

            case 4: {
                System.out.println("\nВведите сторону квадрата: ");
                Integer side1 = in.nextInt();
                figureCollection.addFigure(new Square(side1));   
                System.out.printf("Теперь в списке есть квадрат со стороной %d.\n", side1);     
            }
            break;
            default: System.out.println("\nНеверный пункт, возвращаемся в главное меню...");
        }
   }
}   


