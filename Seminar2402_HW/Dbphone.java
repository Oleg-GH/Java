package Seminar2402_HW;

import java.util.*;

public class Dbphone {
    Map<String, LinkedList<Integer>> contacts = new TreeMap<>();

    void phoneBook(){
        if (!contacts.isEmpty()){
            System.out.println("Телефонная книга:");
            for (String name : contacts.keySet()) {
                System.out.println(name + ":");
                int count = 0;
                for (int number : contacts.get(name)){
                    count++;
                    System.out.printf("%d. %d\n", count, number);
                }
            }
        } else {
            System.out.println("Телефонная книга пуста.");
        }
        System.out.println();
    }

    void findContact(String name){
        if (contacts.containsKey(name)){
            System.out.printf("%s имеет номера:\n", name);
            int count = 0;
            for (int number : contacts.get(name)){
                count++;
                System.out.printf("%d. %d\n", count, number);
            }
        } else {
            System.out.printf("%s отсутствует в телефонной книге.\n", name);
        }
        System.out.println();
    }

    void newContact(String name, int number){
        if (contacts.containsKey(name)){
            contacts.get(name).add(number);
        } else {
            LinkedList<Integer> lList = new LinkedList<>();
            lList.add(number);
            contacts.put(name, lList);
        }
    }
}
