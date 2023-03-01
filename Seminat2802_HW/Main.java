/* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
Реализовать в java. Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) 
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры 
фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям. 
 */

package Seminat2802_HW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook(0, 250, 8, 14, "Windows10", "black", "Asus"));
        notebooks.add(new Notebook(1, 250, 16, 14, "Windows10", "white", "Asus"));
        notebooks.add(new Notebook(2, 250, 16, 14, "Windows11", "silver", "Asus"));
        notebooks.add(new Notebook(3, 500, 16, 15, "Dos", "black", "Lenovo"));
        notebooks.add(new Notebook(4, 750, 16, 16, "None", "blue", "Acer"));
        notebooks.add(new Notebook(5, 1000, 32, 15, "Windows11", "red", "Sony"));
        notebooks.add(new Notebook(6, 750, 32, 15, "Windows11", "red", "Xiaomi"));
        notebooks.add(new Notebook(7, 750, 64, 15, "Windows11", "white", "Acer"));
        notebooks.add(new Notebook(8, 750, 32, 15, "Windows11", "silver", "Sony"));
        notebooks.add(new Notebook(9, 750, 32, 17, "Linux", "silver", "Sony"));
        notebooks.add(new Notebook(10, 1000, 64, 17, "Windows11", "silver", "Sony"));
        
        Selection(userRequest(), notebooks);
    } 

    public static HashMap<String, String> userRequest() {
        HashMap<String, String> userRequest = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите параметры для поиска либо оставьте пустыми (память и экран обязательны, хотя бы 0): ");
        System.out.print("Введите тип ОС: ");
        userRequest.put("system", scanner.nextLine());
        System.out.print("Введите цвет корпуса: ");
        userRequest.put("color", scanner.nextLine());
        System.out.print("Введите производителя: ");
        userRequest.put("brand", scanner.nextLine());
        System.out.print("Введите минимальный размер жесткого диска: ");
        userRequest.put("hdd", scanner.nextLine());
        System.out.print("Введите минимальный размер оперативной памяти: ");
        userRequest.put("ram", scanner.nextLine());
        System.out.print("Введите минимальную диагональ дисплея: ");
        userRequest.put("display", scanner.nextLine());
        scanner.close();
        // System.out.println(userRequest);  // для отладки
        return userRequest;
    }

    public static void Selection(HashMap<String, String> userRequest, HashSet<Notebook> catalog) {
        Boolean notFoundFlag=true;
        //HashSet<Notebook> results = new HashSet<Notebook>();          // как вариант сбора подходящих ноубуков в множество
        System.out.println("\nРезультаты поиска по вашему запросу: ");
        for (Notebook nb : catalog) {
            if (userRequest.get("brand").equals(nb.getBrand()) || userRequest.get("brand").equals("")) {
                if (userRequest.get("color").equals(nb.getColor()) || userRequest.get("color").equals("")) {
                    if (userRequest.get("system").equals(nb.getOS()) || userRequest.get("system").equals("")) {
                        if (nb.getDisplay() >= Integer.parseInt(userRequest.get("display")) &&
                                (nb.getHDD() >= Integer.parseInt(userRequest.get("hdd"))) &&
                                (nb.getRAM() >= Integer.parseInt(userRequest.get("ram")))) {
                            //results.add(nb);;                            // при сборе в множество
                            System.out.println(nb);
                            notFoundFlag=false;
                        }
                    }
                }
            }
        }
        //System.out.println(results);                                      // при сборе в множество
        if (notFoundFlag){
            System.out.println("Ноутбуков, удовлетворяющих вашему запросу, к сожалению нет. Попробуйте изменить запрос.");
        }
    }
}
