
//  1. Вычислить n-ое треугольное число (сумма чисел от 1 до n), 
//     n! (произведение чисел от 1 до n)

package Seminar1002_HW;

import java.util.Scanner;

public class task1 {
    static double factor(int n) {
        if (n == 1) return 1;
        return n * factor(n - 1);
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: "); 
        int n = iScanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(n + "-ое треугольное число равно " + sum);
        double f = factor(n);
        System.out.println("Факториал числа " + n + " равен " + f);
        iScanner.close();    
    }
}