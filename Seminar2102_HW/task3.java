// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

package Seminar2102_HW;

import java.util.*;

public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = randomLl(6, 10);
        System.out.printf("Исходный список: %s\n", myLinkedList);
        System.out.printf("Сумма элементов: %d\n", sumValue(myLinkedList));
    }

    private static LinkedList<Integer> randomLl(int size, int upperBond) {
        LinkedList<Integer> llist = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            llist.add(random.nextInt(upperBond));       // список из случайных чисел
        }
        return llist;
    } 

    private static int sumValue(LinkedList<Integer> list) {
        int sum = 0;

        Iterator<Integer> col = list.iterator();        // итератор
        while (col.hasNext()) {
            sum += col.next();                          // подсчет суммы элементов списка
        }    
        System.out.printf("Список после вычисления суммы: %s\n", col);
        return sum;
    }
}
