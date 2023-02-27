// Взять набор строк, например,
// Мороз и солнце день чудесный 
// Еще ты дремлешь друг прелестный 
// Еще ты дремлешь день прелестный 
// Пора красавица проснись.
// Написать метод, который отсортирует эти строки по длине с помощью TreeMap. 
// Строки с одинаковой длиной не должны “потеряться”.


package Seminar_2402;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Map;
// import java.util.TreeMap;
import java.util.*;

public class task4 {
    public static void main(String[] args) {
        ex1("a\n" + "Мороз и солнце день чудесный\n" +
            "Еще ты дремлешь друг прелестный\n" + 
            "Еще ты дремлешь день прелестный\n" + 
            "Пора красавица проснись.\n");
    }

    static void ex1(String s) {
        Map<Integer, List<String>> treeMap = new TreeMap<>();
        String[] s1 = s.split("\n");
        for (String s2: s1) {
            if (treeMap.containsKey(s2.length())) {
                List<String> list = treeMap.get(s2.length());
                list.add(s2);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s2);
                treeMap.put(s2.length(), list);
            }
        }
        System.out.println(treeMap);  // выводим отсортированный по длине строк treeMap
    }

    // static void ex1(String s) {
    //     Map<Integer, List<String>> treeMap = new TreeMap<>(new Comparator<Integer>()) {
    //         @Override
    //         public int compare(Integer o1, Integer o2) {
    //             return Integer.compare(01, 02);
    //         }
    //     };
    //     String[] s1 = s.split("\n");
    //     for (String s2: s1) {
    //         if (treeMap.containsKey(s2.length())) {
    //             List<String> list = treeMap.get(s2.length());
    //             list.add(s2);
    //         } else {
    //             List<String> list = new ArrayList<>();
    //             list.add(s2);
    //             treeMap.put(s2.length(), list);
    //         }
    //     }
    //     System.out.println(treeMap);
    // 
}
        
