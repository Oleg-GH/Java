// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы
// в конец массива. Т.о. первые несколько (или все) элементы массыва должны быть 
// отличны от заданного, а остальные - равны ему

package Seminar1002;

import java.util.Arrays;
public class task2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 3, 3, 3, 2, 2, 3 };
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 3) {
                temp = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != 3) {
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);          // вывод в столбик по одному элементу
        System.out.println(Arrays.toString(arr));   // вывод списка в одну строку 
        }
}

