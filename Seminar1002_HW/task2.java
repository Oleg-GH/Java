
// 2. Вывести все простые числа от 1 до 1000

package Seminar1002_HW;

import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: "); // вводим int
        int n = iScanner.nextInt();
        int simple = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                simple = i;
                System.out.print(simple + " ");
            }   
            simple = 0; 
        }    
        System.out.println();
        iScanner.close(); 
    }
}    


