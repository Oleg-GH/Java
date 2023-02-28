// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24. 
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите 
// процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

package Seminar2802;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Integer[] arr = getArray(0, 25, 1000);
        //System.out.println(Arrays.toString(arr));         // слишком много значений
        System.out.println(unicValue(arr));                 // 2.5
    }

    private static Integer[] getArray(int minn, int maxx, int size) {
        Integer[] array = new Integer[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(25);
        }
        return array;
    }

    private static Double unicValue(Integer[] someArray) {
        double unVal = 0;
        HashSet<Integer> someset = new HashSet<>(Arrays.asList(someArray));
        unVal = someset.size() * 100.0 / someArray.length;  // ставим точку (100.0), чтобы получить
        return unVal;                                       // double, иначе потеряем дробную часть 
    }                                                       // типа 2.0  вместо 2.5
}
