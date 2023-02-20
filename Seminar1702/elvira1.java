// использование Scanner

package Seminar1702;

import java.util.Scanner;

public class elvira1 {
    public static void main(String[] args) {
        /*
         * Создаем один объект для сканера и пользуемся, создание лишних объектов
         * Scanner может привести к неэффективному
         * использованию памяти
         */
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите знак: ");

        String oper = iScanner.next(); // со строками всё не просто

        System.out.print("Введите число: ");
        int value = iScanner.nextInt();

        System.out.println(value);
        String s = "+";
        /*
         * Оператор "==" сравнивает ссылки на объекты, а не их содержимое, поэтому для
         * сравнения содержимого строк следует использовать метод equals().
         */
        if (oper.equals(s))
            System.out.println("вход");
        iScanner.close();// обязательно закрываем в конце программы, чтобы освободить системные ресурсы

    }
}
