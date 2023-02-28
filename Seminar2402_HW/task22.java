/*Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, 
Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, 
Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, 
Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет повторяющиеся имена 
с количеством повторений. Отсортировать по убыванию популярности. 
Для сортировки использовать TreeMap.
*/

package Seminar2402_HW;

import java.util.*;

public class task22 {
    public static void main(String[] args) {
        String[] fullNames = { "Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
                "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов" };
    
        LinkedList<String> list = new LinkedList<>();
        for (String firstName : fullNames) {
            list.add(firstName.split(" ")[0]);              // получаем список имен
        }
        System.out.println("Список имен:");
        System.out.println(list);

        Map<String, Integer> map = new TreeMap<String, Integer>();
        for (String firstName : list) {
            if (map.containsKey(firstName)) {
                map.put(firstName, map.get(firstName) + 1); // считаем имена
            } else map.put(firstName, 1);    
        }
        System.out.println();

        Map<Integer, List<String>> map1 = new TreeMap<>(Comparator.reverseOrder());
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (map1.containsKey(entry.getValue())) {            // меняем ключи и значения map
                List<String> list1 = map1.get(entry.getValue()); // местами, получаем новую
                list1.add(entry.getKey());                       // кол-цию, где ключи - кол-во
            } else {                                             // упоминаний имен, значения - 
                List<String> list1 = new ArrayList<>();          // список имен, соотв-щих
                list1.add(entry.getKey());                       // данному количеству упоминаний
                map1.put(entry.getValue(), list1); 
            }
        }
        System.out.println("Имена в порядке убывания популярности:");
        for (Map.Entry<Integer, List<String>> entry: map1.entrySet()){
            System.out.println(entry);   
        }
    }
}
