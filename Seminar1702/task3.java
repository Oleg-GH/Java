// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.
// Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.


package Seminar1702;

import java.util.*;

public class task3 {
    public static void main(String[] args){
        ArrayList<String> planets = new ArrayList<String>(Arrays.asList("a", "a", "b", "b", "b", "b", "b", "c", "c", "d", "e", "e", "e"));
        System.out.println(planets);

        for (int i = 0; i < planets.size() - 1; i++) {
            int count  = 1;
            for (int j = i + 1; j < planets.size(); j++) {
                if (planets.get(i).equals(planets.get(j))) {
                    count++;
                    planets.remove(planets.get(j));
                } else break;
            }
            System.out.printf("Планета %s повторяется %d раз. \n", planets.get(i), count);
            //count = 1;
        }
        System.out.println(planets);
    }  
}
