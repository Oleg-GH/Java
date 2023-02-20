// Пусть дан произвольный список целых чисел, удалить из него четные числа

package Seminar1702_HW;

import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

public class task2 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = randomList(10, 15);
        System.out.printf("Исходный список: %s\n", nums.toString());

        System.out.printf("Оставлены нечетные элементы: %s\n", separateOdd(nums).toString());

    }

    private static ArrayList<Integer> randomList(int size, int upperBond) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(upperBond));
        }
        return list;
    }    

    private static ArrayList<Integer> separateOdd(ArrayList<Integer> list) {
        Iterator<Integer> editedList = list.iterator();

        while(editedList.hasNext()) {
            int item = editedList.next();
            if (item % 2 == 0) editedList.remove();            
        }
        return list;        
    }
}
