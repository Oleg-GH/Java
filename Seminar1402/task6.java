// ЗАДАЧА: Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9.  Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1.  Пример 4: а = 0, b = 0, ответ: не определено

// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

// нельзя использовать math.pow

// Декомпозиция:
// Создать файл README
// Создать метод чтения из файла
// Создать метод возведения числа в положительную степень
// Создать метод возведения числа в отрицательную степень
// Создать метод записи в файл
// Создать метод управления работой программы


package Seminar1402;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) throws FileNotFoundException { 
        int a = readFile()[0];
        int b = readFile()[1];
        if(a == 0 && b == 0) writeFile("Не определено"); // записать в файл "Не определено"
        else if(b < 0) writeFile(negativPow(a, b)); // Вычисляем и записываем в случае отрицательной степени
        else writeFile(positivPow(a, b)); // Вычисляем и записываем в случае положительной степени
    }

    // Метод считывания файла:
    public static int[] readFile() throws FileNotFoundException {// FileNotFoundException Выдаст ошибку при отсутствии файла
        File file = new File("input.txt"); // создаем класс файл - присвоим файл некой сущности)
        Scanner scanner = new Scanner(file); // На вход классу сканер подаем файл
        String line = scanner.nextLine(); // присвоить строковой переменной следующую строку
        int[] intArray = new int[2];
        String[] stringArray = line.split(" "); // Создали массив из строки разбив по пробелам
        int a = Integer.parseInt(stringArray[1]); // Преобразуем в число второй элемент стокового массива
        intArray[0] = a;
        line = scanner.nextLine(); // присвоить строковой переменной следующую строку
        stringArray = line.split(" "); // Создали массив из строки разбив по пробелам
        a = Integer.parseInt(stringArray[1]); // Преобразуем в число второй элемент стокового массива
        intArray[1] = a;
        // scanner.hasNextLine() - проверяет, есть ли несчитанные строки
        scanner.close(); // Закрыли сканер
        return intArray;
    }

    // ВЫчисление положительной степени
    public static String positivPow(int a, int b) {
        int temp = 1;
        String result = "";
        for(int i = 0; i < b; i++){
            temp *= a;
        }
        result = String.valueOf(temp);
        return result;
    }   
    
    // Вычисление отрицательной степени
    public static String negativPow(int a, int b) {
        double temp = 1;
        String result = "";
        for(int i = 0; i < b * -1; i++){
            temp *= a; 
        }
        result = String.valueOf(1/temp);
        return result;
    }

    // Метод записи в файл:
    public static void writeFile(String string) throws FileNotFoundException {
        File file = new File("output.txt"); // Создаем объект класса "файл"
        PrintWriter pw = new PrintWriter(file); // Создаем объект класса записи в файл "PrintWriter"
        pw.println(string); // Метод (команда) записи в файл
        pw.close(); // закрываем объект класса "PrintWriter" (файл) 
    }
}
