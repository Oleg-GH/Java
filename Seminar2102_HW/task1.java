// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
// вернет “перевернутый” список. Постараться не обращаться к листу по индексам.

package Seminar2102_HW;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = randomLl(5, 10);
        System.out.printf("Исходный список:     %s\n", myLinkedList);
        System.out.printf("Перевернутый список: %s\n", reverseLl(myLinkedList));
    }

    private static LinkedList<Integer> randomLl(int size, int upperBond) {
        LinkedList<Integer> llist = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            llist.add(random.nextInt(upperBond));       // список из случайных чисел
        }
        return llist;
    } 

    private static LinkedList<Integer> reverseLl(LinkedList<Integer> list) {
        LinkedList<Integer> llist = new LinkedList<>();
        
        while (list.size() > 0) {
            llist.addFirst(list.remove());  // remove забирает первый элемент из исходного списка
        }                                // addFirst вставляет этот элемент в начало нового списка
        return llist;                    // можно использовать метод pop()
    }
}


// Исходный список:  [5, 2, 9, 7, 8]
// Новый список      Старый список (остаток после remove)
// [5]               [2, 9, 7, 8]
// [2, 5]            [9, 7, 8]
// [9, 2, 5]         [7, 8]
// [7, 9, 2, 5]      [8]
// [8, 7, 9, 2, 5]   []
// Перевернутый список: [8, 7, 9, 2, 5]
