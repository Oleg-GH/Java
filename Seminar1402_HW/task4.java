// 4*. К калькулятору из предыдущего дз добавить логирование.

package Seminar1402_HW;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class task4 {
    public static void main(String args[]) throws IOException {
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
                log_result(a, b, res_sum, str);
            }

            if (str.equals("-")) {
                float res = a - b;
                System.out.printf("%f - %f = %f. \n", a, b, res);
                System.out.println();
                log_result(a, b, res, str);
            }

            if (str.equals("*")) {
                float res_mult = a * b;
                System.out.printf("%f * %f = %f. \n", a, b, res_mult);
                System.out.println();
                log_result(a, b, res_mult, str);
            }

            if (str.equals("/")) {
                if (b == 0) {
                    throw new ArithmeticException("На ноль делить нельзя.");
                }
                float res_div = a / b;
                System.out.printf("%f / %f = %f. \n", a, b, res_div);
                System.out.println();
                log_result(a, b, res_div, str);
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

    static void log_result(double a, double b, double result, String operation) throws IOException {
        Logger log = Logger.getLogger(task4.class.getName());
        FileHandler fh = new FileHandler("logCalc.txt", true);
        log.addHandler(fh);
        log.setUseParentHandlers(false);

        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);

        StringBuilder sb = new StringBuilder("Результат вычисления: ");
        sb.append(a);
        sb.append(" ");
        sb.append(operation);
        sb.append(" ");
        sb.append(b);
        sb.append(" ");
        sb.append(" = ");
        sb.append(" ");
        sb.append(result);
        sb.append(";");
        sb.append("\n");
        String res = sb.toString();

        log.log(Level.INFO, res);
    }
}
