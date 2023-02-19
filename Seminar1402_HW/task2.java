// 2 . Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

package Seminar1402_HW;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;

public class task2 {
    public static void main(String[] args) throws IOException {
        int[] array = createRandArr(10, -5, 15);
        System.out.print("Исходный массив: ");
        System.out.println(showArray(array));
        int[] sortArray = bulbSort(array);
        System.out.print("Массив после сортировки: ");
        System.out.println(showArray(sortArray));

    }   
    static int[] createRandArr(int size, int downBound, int upperBond) {
        Random rand = new Random();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = rand.nextInt(upperBond) + downBound;
        }
        return array;
    }

    static String showArray(int[] array) {
        return Arrays.toString(array);
    }

    static int[] bulbSort(int[] array) throws IOException {
        Logger log = log_result();
        int[] sortArray = Arrays.copyOf(array, array.length);
        int temp = 0;
        for (int i = 0; i < sortArray.length; i++) {
            for (int j = 0; j < sortArray.length - i - 1; j++) {
                if (sortArray[j] > sortArray[j + 1]) {
                    temp = sortArray[j+1];
                    sortArray[j + 1] = sortArray[j];
                    sortArray[j] = temp;

                    log.log(Level.INFO, showArray(sortArray) + "\n");
                }
            }
        }
        return sortArray;
    }

    static Logger log_result() throws IOException {
        Logger log = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("logBulb.txt", true);
        log.addHandler(fh);
        log.setUseParentHandlers(false);

        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        return log;
    }    
}






// boolean isSorted = false;
// int buf;
// while(!isSorted) {
//     isSorted = true;
//     for (int i = 0; i < mas.length-1; i++) {
//         if(mas[i] > mas[i+1]){
//             isSorted = false;
//             buf = mas[i];
//             mas[i] = mas[i+1];
//             mas[i+1] = buf;