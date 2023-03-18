//package SeminarOOP4_1403_HW2;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        System.out.println("\n---- Выполнение для Integers ----\n");

        UserList<Integer> myIntList = new UserList<>();
        Random rand = new Random();
        myIntList.add(30);
        
        // Заполняем список случайными числами
        for (int i = 0; i < 10; i++) {
            myIntList.add(rand.nextInt(10));
            if (i == 5) {
                myIntList.add(30);
            }
        }
        myIntList.add(30);
        System.out.println("Заполненный список:");
        myIntList.print();

        myIntList.remove(1);
        System.out.println("\nУдален элемент с индексом [1]:");
        myIntList.print();
        myIntList.remove(5);
        System.out.println("\nУдален элемент с индексом [5]:");
        myIntList.print();

        myIntList.removeAll(30);
        System.out.println("\nУдалены все элементы со значением = 30:");
        myIntList.print();

        myIntList.add(50);
        System.out.println("\nДобавлен элемент 50 в конец списка:");
        myIntList.print();

        try {
            System.out.printf("\nМинимальный элемент %d\n", myIntList.getMin());
            System.out.printf("Максимальный элемент %d\n", myIntList.getMax());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("Сумма элементов = %d\n", myIntList.sum());
        System.out.printf("Произведение элементов = %d\n", myIntList.multi());
        System.out.printf("Индекс элемента %d - [%d]\n", 4, myIntList.indexOf(4));
        System.out.printf("Список содержит элемент 5? %b\n", myIntList.contains(5));
        System.out.printf("Список содержит элемент 25? %b\n", myIntList.contains(25));
        
        try {
            myIntList.BubbleSort();
            // myIntList.InsertionSort();   // при необходимости раскомментировать
            // myIntList.SelectionSort();   // при необходимости раскомментировать
            System.out.println("\nОтсортированный список:");
            myIntList.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        

        System.out.printf("\nЭлемент под индексом [%d] - %d\n", 0, myIntList.get(0));
        // System.out.println(myIntList.get(30));

        System.out.printf("\nЗаменен на 100 элемент %d под индексом [4]\n",
                          myIntList.set(4, 100));
        myIntList.print();

        System.out.println("\n----  Завершено с Integers  ----\n");



        System.out.println("\n----  Выполнение для Strings ----\n");

        UserList<String> myStringList = new UserList<>();
        myStringList.add("Апельсин");
        myStringList.add("Банан");
        myStringList.add("Арбуз");
        myStringList.add("Яблоко");
        myStringList.add("Груша");
        myStringList.add("Киви");
        myStringList.add("Лайм");
        myStringList.add("Апельсин");
        myStringList.add("Вишня");
        myStringList.add("Виноград");
        myStringList.add("Клубника");
        myStringList.add("Ананас");
        myStringList.add("Лимон");
        myStringList.add("Апельсин");
        
        System.out.println("Заполненный лист:");
        myStringList.print();

        myStringList.remove(1);
        System.out.println("\nУдален элемент с индексом [1]");
        myStringList.print();
        myStringList.remove(5);
        System.out.println("\nУдален элемент с индексом [5]");
        myStringList.print();

        myStringList.removeAll("Апельсин");
        System.out.println("\nУдалены все элементы со значением = \"Апельсин\"");
        myStringList.print();

        myStringList.add("Манго");
        System.out.println("\nДобавлен элемент \"Манго\" в конец списка");
        myStringList.print();

        try {
            System.out.printf("\nМинимальный элемент - %s\n", myStringList.getMin());
            System.out.printf("Максимальный элемент - %s\n", myStringList.getMax());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("Индекс элемента \"Виноград\" - [%d]\n",
                          myStringList.indexOf("Виноград"));
        System.out.printf("Список содержит элемент \"Арбуз\"? %b\n\n", 
                          myStringList.contains("Арбуз"));

        try {
            // myStringList.BubbleSort();
            myStringList.InsertionSort();
            // myStringList.SelectionSort();
            System.out.println("Отсортированный список:");
            myStringList.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        

        System.out.printf("\nЭлемент под индексом [%d] - %s\n", 0, myStringList.get(0));

        System.out.printf("\nЗаменен на \"Абрикос\" элемент %s под индексом [4]\n",
                        myStringList.set(4, "Абрикос"));
        myStringList.print();

        System.out.println("\n----  Завершено со Strings  ----\n");



        System.out.println("\n---- Выполнение для People ----\n");

        UserList<People> myPeopleList = new UserList<>();
        myPeopleList.add(new People("Иван", 180));
        String[] names = new String[]{"Петр", "Игорь", "Алекс", "Вова", "Стас", 
                                     "Настя", "Ирина", "Оля", "Наташа", "Маша"};
        // Заполняем список случайными людьми
        for (int i = 0; i < 10; i++) {
            myPeopleList.add(new People(names[rand.nextInt(10)], 150 + rand.nextInt(35)));
            if (i == 5) {
                myPeopleList.add(new People("Иван", 180));
            }
        }
        myPeopleList.add(new People("Иван", 180));
        
        System.out.println("Заполненный список:");
        myPeopleList.print();

        myPeopleList.remove(1);
        System.out.println("\nУдален элемент с индексом [1]");
        myPeopleList.print();
        myPeopleList.remove(5);
        System.out.println("\nУдален элемент с индексом [5]");
        myPeopleList.print();

        myPeopleList.removeAll(new People("Иван", 180));
        System.out.println("\nУдалены все элементы со значением = 180");
        myPeopleList.print();

        myPeopleList.add(new People("Анжела", 170));
        System.out.println("\nДобавлен элемент \"Анжела\" в конец списка");
        myPeopleList.print();

        try {
            System.out.printf("\nМинимальный элемент %s\n", myPeopleList.getMin());
            System.out.printf("Максимальный элемент %s\n", myPeopleList.getMax());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("Индекс элемента \"Анжела\" - [%d]\n", myPeopleList.indexOf(new People("Анжела", 170)));
        System.out.printf("В списке есть Анжела? %b\n\n", myPeopleList.contains(new People("Анжела", 170)));

        try {
            // myPeopleList.BubbleSort();       // при необходимости раскомментировать
            // myPeopleList.InsertionSort();    // при необходимости раскомментировать
            myPeopleList.SelectionSort();
            System.out.println("Отсортированный список:");
            myPeopleList.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        

        System.out.printf("\nЭлемент под индексом [%d] - %s\n", 0, myPeopleList.get(0));

        System.out.printf("\nЗаменен на \"Дима: 185\" элемент %s под индексом [4]\n", myPeopleList.set(4, new People("Дима", 185)));
        myPeopleList.print();

        System.out.println("\n----  Завершено с People  ----\n\n");
    }
} 

