
// 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
//    могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
//    восстановить выражение до верного равенства. Предложить хотя бы
//    одно решение или сообщить, что его нет.


package Seminar1002_HW;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("В выражении: ax + xb = c  число х является неизвестным (искомым). ");
        System.out.println("Для определения х введите по порядку числа a, b, c: ");
        int x = -1;
        Scanner iScan = new Scanner(System.in);                  
        System.out.printf("Введите а: ");                
        int a = iScan.nextInt();  
        System.out.printf("Введите b: ");                
        int b = iScan.nextInt(); 
        System.out.printf("Введите c: ");                
        int c = iScan.nextInt();  
        for (int i = 0; i < 10; i++) {
            if (10 * a + i + 10 * i + b == c) {
                x = i;
                System.out.println("Искомое значение х = " + x);
                System.out.println("Искомое выражение: " + (10 * a + x) + " + " + (10 * x + b) + " = " + c);
            }
        }
        if (x == -1) {
            System.out.println("Нет целочисленного значения x. ");
        }
        iScan.close();                            
    }
} 

