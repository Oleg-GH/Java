
// Реализовать простой калькулятор

package Seminar1002_HW;

import java.util.Scanner;

public class task3 {
    public static void main(String args[]) {
        float a;
        float b;
        // float res;
        String str;

        do {

            Scanner scn = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            a = scn.nextFloat();
            System.out.println("Введите: + , - , *, / )");
            str = scn.next();
            System.out.println("Введите второе число: ");
            b = scn.nextFloat();

            if (str.equals("+")) {
                float res_sum = a + b;
                System.out.printf("%f + %f = %f. \n", a, b, res_sum);
                System.out.println();                
            }

            if (str.equals("-")) {
                float res = a - b;
                System.out.printf("%f - %f = %f. \n", a, b, res);
                System.out.println();
            }

            if (str.equals("*")) {
                float res_mult = a * b;
                System.out.printf("%f * %f = %f. \n", a, b, res_mult);
                System.out.println();
            }

            if (str.equals("/")) {
                float res_div = a / b;
                System.out.printf("%f / %f = %f. \n", a, b, res_div);
                System.out.println();                
            }

            System.out.println("Введите q для выхода или любую другую для продолжение");
            str = scn.next();
            scn.close();
            if (str.equals("q")) {
                System.out.println("Выход");
                return;
            }             
        } while (true);

    }
}
