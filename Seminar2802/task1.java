// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 0, 3}. 
// Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 0, 3}.  
// Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 0, 3}.  
// Распечатайте содержимое данного множества.

package Seminar2802;

import java.util.*;

public class task1 {
    public static void main(String[] args) {      // у Set только уникальные значения (нет повторений)
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        System.out.println(set);                  // [0, 1, 2, 3, 4, 5, 6] сортировка по хэшкоду
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        System.out.println(set2);                 // [1, 2, 6, 4, 5, 0, 3]  не сортируется
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        System.out.println(set3);                 // [0, 1, 2, 3, 4, 5, 6]  отсортировано по значению
    } 
}
