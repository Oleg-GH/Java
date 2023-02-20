// 3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

package Seminar1702_HW;

import java.util.ArrayList;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = randomList(10, 15);
        System.out.printf("Исходный список: %s\n", nums.toString());
        // Collection.sort(nums);
        System.out.printf("Минимальное значение: %d\n", minItem(nums));  // min = nums.get(0);
        System.out.printf("Максимальное значение: %d\n", maxItem(nums));    // max = nums.get(num(size - 1));
        System.out.printf("Среднее арифметическое: %.2f\n", averageValue(nums));
    }

    private static int minItem(ArrayList<Integer> list) {
        int minNum = list.get(0);

        for (Integer i: list) {
            if(i < minNum) minNum = i;
        }
        return minNum;
    }

    private static int maxItem(ArrayList<Integer> list) {
        int maxNum = list.get(0);

        for (Integer i: list) {
            if(i > maxNum) maxNum = i;
        }
        return maxNum;
    }

    private static double averageValue(ArrayList<Integer> list) {
        double average = 0;
        int sum = 0;
        for (Integer i: list) {
            sum += i;
        }
        System.out.printf("Для проверки: сумма членов: %d\n", sum);
        System.out.printf("Для проверки: количество членов: %d\n", list.size());
        average = (double) sum / list.size();
        return average;
    }

    private static ArrayList<Integer> randomList(int size, int upperBond) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(upperBond));
        }
        return list;
    }    
}
