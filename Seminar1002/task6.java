// 3. Реализовать простой калькулятор

package Seminar1002;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        float a = 0, b = 1;
        boolean flag = true;
        // String action;
        
        while (flag) {                                             // проверка корректности ввода числа
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Введите первое число a: ");
            if (iScanner.hasNextFloat()) {
                a = iScanner.nextFloat();
                flag = false;
                break;
            } else {
                System.out.println("Вы ввели некорректное значение. Попробуйте снова. ");
            }
            iScanner.close();
        }

        Scanner scanner1 = new Scanner(System.in);              // как проверять на корректность строку, причем
        System.out.printf("Введите действие(+, -, *, /): ");    // конкретный символ, пока не разобрался
        String action = scanner1.nextLine();                    // iScan.nextLine(); // надо спросить на семинаре.
        System.out.println(action);                             // Есть небольшая проверка ниже в switch
        scanner1.close();

        flag = true;
        while (flag) {                                           // проверка корректности ввода числа
            Scanner iScann = new Scanner(System.in);
            System.out.printf("Введите второе число b: ");
            if (iScann.hasNextFloat()) {
                b = iScann.nextFloat();
                flag = false;
                break;
            } else {
                System.out.println("Вы ввели некорректное значение. Попробуйте снова. ");
            }
            iScann.close();
            //break;
        }

        switch (action) {
            case "+":
                System.out.printf("%d + %d = %d. \n", a, b, (a + b));
                break;
            case "-":
                System.out.printf("%d - %d = %d. \n", a, b, (a - b));
                break;
            case "*":
                System.out.printf("%d * %d = %d. \n", a, b, (a * b));
                break;
            case "/":
                if (b != 0) {
                    System.out.printf("%d + %d = %d. \n", a, b, (a / b));
                    break;
                } else {
                    System.out.println("На ноль делить нельзя!");
                    break;
                }
            default:
                System.out.println("Введено некорректное действие. Попробуйте снова");
                break;
        }

    }
}    