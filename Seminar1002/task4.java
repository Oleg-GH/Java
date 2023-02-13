package Seminar1002;
// Задать целочисленный массив, состоящий из элементов 0 и 1. 
// С помощью цикла и условия заменить 0 на 1 и 1 на 0.

import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        int[] arr = new int[10];                // объявляем новый массив из 10 элементов
        Random random = new Random();           // переменная random. А Random - это класс
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);         // заполняем массив случайными 1 и 0
            System.out.print(arr[i] + " ");
            }
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
                }
            else {
                arr[i] = 1;
                }    
            }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");;
            }   
        System.out.println();   
    }
}

    
