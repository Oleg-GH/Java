// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).

package Seminar1402;

public class task3 {
    public static void main(String[] args) {

        System.out.println(isPalindrom("qwerewq"));
    } 
    public static boolean isPalindrom(String my_str) {
        boolean answer = true;
        for (int i = 0; i < my_str.length()/2; i++){
            if (my_str.charAt(i) != my_str.charAt(my_str.length() - 1 - i)) {
                answer = false;
                break;
            }
       
        }
        return answer;
    }
}
