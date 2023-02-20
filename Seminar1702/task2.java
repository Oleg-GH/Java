// Заполнить список десятью случайными числами

package Seminar1702;

import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

public class task2 {
    //private static final String ArrayList = null;

    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Random rand = new Random();
        int min = 20;
        int max = 40;
        //rand.nextInt((max - min + 1) + min);
        for (int i  = 0; i < 10; i++) {
            list1.add(rand.nextInt(max - min + 1) + min);
        }
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);


        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Random random = new Random();
        int min2 = 20;
        int max2 = 40;
        //rand.nextInt((max - min + 1) + min);
        for (int i  = 0; i < 10; i++) {
            list2.add(random.nextInt(max2 - min2 + 1) + min2);
        }
        System.out.println(list2);

        list2.sort(Comparator.reverseOrder());  // если в скобках null, то сортировка по возрастанию. 
        System.out.println(list2);              // или Comparator.naturalOrder

    }      
}
