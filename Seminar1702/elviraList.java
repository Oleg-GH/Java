// Примеры работы с List

package Seminar1702;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class elviraList {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        list.add("Hello"); // метод добавления
        list.add(123);
        list.add(true);
        list.add("world");

        // Удаление элемента по значению
        list.remove("Hello");

        // Удаление элемента по индексу
        list.remove(1);

        for (Object item : list) { // вывод списка
            System.out.println(item);
        }

        // пример для сортировки
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(5);
        list2.add(1);
        list2.add(7);
        list2.add(3);
        list2.add(9);
        list2.add(2);

        System.out.println("Список до сортировки:");
        for (Integer item : list2) {
            System.out.println(item);
        }

        Collections.sort(list2);

        System.out.println("Список после сортировки:");
        for (Integer item : list2) {
            System.out.println(item);
        }
        System.out.println();
        // пример работы итератора
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            System.out.println(current);
        }

        // Пример создания двумерного списка для дз
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(1, 2, 3));
        matrix.add(Arrays.asList(4, 5, 6));
        matrix.add(Arrays.asList(7, 8, 9));

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.println("Элемент (" + i + ", " + j + "): " + matrix.get(i).get(j));
            }
        }
        System.out.println(matrix.get(1));

        // в задаче 3 использовать instanceof, который позволяет проверять тип данных в
        // списке

        List<Integer> list4 = new ArrayList<>(List.of(1, 2, 5, 6, 3, 7));
        System.out.println(list4);
        list4.remove(3);
        System.out.println(list4);
    }
}
