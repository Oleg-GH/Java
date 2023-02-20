// 1.Реализовать алгоритм сортировки слиянием

package Seminar1702_HW;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] array1 = { 7, 1, -4, 3, 5, 8, 6, -5, 1, 23, -33 };
        System.out.println("Исходный массив: \n" + Arrays.toString(array1));
        
        int[] result = mergeSort(array1);
        System.out.println("Отсортированный массив: \n" + Arrays.toString(result));
    }

    public static int[] mergeSort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);           // Массив для сортировки.
        int[] buffer2 = new int[array1.length];                         // Буфер размером как buffer1
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;                              // startIndex - начальный индекс в buffer1 для сортировки
    }
 
    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
            int startIndex, int endIndex) {         // endIndex - конечный индекс в buffer1 для сортировки
        if (startIndex >= endIndex - 1) {
            return buffer1;                         // 
        }
        
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);   // левая половина
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);     // правая половина
        
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}