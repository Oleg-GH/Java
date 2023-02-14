// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, 
// начиная с c1.

package Seminar1402;

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int n = iScanner.nextInt();
        String new_str = make_str('a', 'b', n);
        System.out.println(new_str);
        System.out.println(new_str.length());
        iScanner.close();
    } 
    public static String make_str(char c1, char c2, int n) {
       
        StringBuilder sb = new StringBuilder();
        sb.append(c1).append(c2);

        String new_str = "";
        for (int i = 0; i < n/2; i++) {
            new_str += sb;
        }
        return new_str;
    }
}
