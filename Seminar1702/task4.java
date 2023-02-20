// Создать список типа ArrayList<String>, поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.


package Seminar1702;

import java.util.ArrayList;
import java.util.Iterator;

public class task4 {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Строка 1");
        arr.add("1");
        arr.add("Строка 2");
        arr.add("2");
        arr.add("Строка 3");
        arr.add("3");

        Iterator<String> iterator = arr.iterator();
        System.out.println(arr);

        while (iterator.hasNext()) {
            String current = iterator.next();
            if (isParsable(current)) {
                //Integer.parseInt(current);
                iterator.remove();
            } else {
                System.out.printf("\"%s\" - это было не число...\n", current);
            }
        }
        System.out.println(arr);

        // Вариант от Артема Маклашева (в одну строчку + вывод результата)
        // arr.removeIf(s->s.chars().allMatch(Character::isDigit));
        // System.out.println(arr);
    }

    public static Boolean isParsable(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
