package SeminarOOP0703_HW2_2;

import SeminarOOP0703_HW2_2.Abstract.Birds;
import SeminarOOP0703_HW2_2.Abstract.Domestic;
import SeminarOOP0703_HW2_2.Birds.Hen;
import SeminarOOP0703_HW2_2.Birds.Stork;
import SeminarOOP0703_HW2_2.DomesticAnimals.Cat;
import SeminarOOP0703_HW2_2.DomesticAnimals.Dog;
import SeminarOOP0703_HW2_2.WildAnimals.Tiger;
import SeminarOOP0703_HW2_2.WildAnimals.Wolf;

import java.util.Scanner;

public class Console {
    Zoo zoo;

    public Console(Zoo zoo) {
        this.zoo = zoo;
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        
        while (true) {
            System.out.println(//"Добро пожаловать в зоопарк!\n" +
            "\nСписок доступных команд для управления зоопарком:\n" +
            "1 - Добавить животное в зоопарк\n" +
            "2 - Удалить животное с указанным индексом из зоопарка\n" +
            "3 - Посмотреть информацию о животном с указанным индексом\n" +
            "4 - Посмотреть информацию обо всех животных в зоопарке\n" +
            "5 - Узнать, какой звук издает животное с указанным индексом\n" +
            "6 - Узнать, какие звуки издают все животные зоопарка\n" +
            "7 - Узнать,на какой высоте летает птица с указанным индексом\n" +
            "8 - Узнать, как домашнее животное с указанным индексом проявляет ласку\n" +
            "9 - Дрессировка домашнего животного с указанным индексом\n" +
            "10 - Выход\n" +
            "\nВведите команду:  ");

            int choice = inputNaturalNumber(in);
                switch (choice) {
                    case 1: inputAnimal(in);
                        break;
                    case 2: {
                        System.out.println("\nВведите индекс животного, которое надо удалить из зоопарка: ");
                        zoo.removeAnimal(inputNaturalNumber(in));
                    }
                        break;
                    case 3: {
                        System.out.println("\nВведите индекс животного для просмотра информации о нем: ");
                        System.out.println(zoo.getAnimalInfo(inputNaturalNumber(in)));
                    }
                        break;
                    case 4: System.out.println(zoo.getAllAnimalsInfo());
                        break;
                    case 5: {
                        System.out.println("\nВведите индекс животного, чтобы узнать, как он звучит: ");
                        System.out.println(zoo.makeSoundAtIndex(inputNaturalNumber(in)));
                    }
                        break;
                    case 6: System.out.println(zoo.makeAllSound());
                        break;
                    case 7: {
                        System.out.println("\nВведите индекс птицы, чтобы она полетела: ");
                        choice = inputNaturalNumber(in);
                        if (choice < zoo.getZoo().size() && zoo.getZoo().get(choice) instanceof Birds)
                            System.out.println(((Birds) zoo.getZoo().get(choice)).fly());
                        else
                            System.out.println("\nПо указанному индексу нет птицы!");
                    }
                        break;
                    case 8: {
                        System.out.println("\nВведите индекс домашнего животного, чтобы оно проявило ласку: ");
                        choice = inputNaturalNumber(in);
                        if (choice < zoo.getZoo().size() && zoo.getZoo().get(choice) instanceof Domestic)
                            System.out.println(((Domestic) zoo.getZoo().get(choice)).tender());
                        else
                            System.out.println("\nПо указанному индексу нет домашнего животного!");
                        }
                        break;
                    case 9: {
                        System.out.println("\nВведите индекс домашнего животного для дрессировки: ");
                        choice = inputNaturalNumber(in);
                        if (choice < zoo.getZoo().size() && zoo.getZoo().get(choice) instanceof Dog)
                            System.out.println(((Dog) zoo.getZoo().get(choice)).train());
                        else
                            System.out.println("\nПо указанному индексу нет собаки!");
                    }
                        break;
                    case 10: {
                        in.close();
                        return;
                    }

                }
            }
        }


    private void inputAnimal(Scanner in) {

        System.out.println("\nВведите высоту (рост) в см: ");
        int height = inputNaturalNumber(in);
        System.out.println("\nВведите вес в кг: ");
        int weight = inputNaturalNumber(in);
        System.out.println("\nВведите цвет глаз: ");
        String eyesColor = in.next();
        System.out.println("Какой вид животных вы вводите?\n" +
                "1 - Домашние\n" +
                "2 - Дикие\n" +
                "3 - Птицы");
        int choice = inputNaturalNumber(in);
        switch (choice) {
            case 1: {
                System.out.println("\nВведите кличку: ");
                String nickname = in.next();
                System.out.println("\nВведите породу: ");
                String breed = in.next();
                System.out.println("\nВведите информацию о вакцинации: ");
                String vaccinated = in.next();
                System.out.println("\nВведите цвет шерсти: ");
                String woolColor = in.next();
                System.out.println("Какой вид домашнего животного вы вводите?\n" +
                        "1 - Кошка\n" +
                        "2 - Собака");
                choice = inputNaturalNumber(in);
                switch (choice) {
                    case 1: {
                        System.out.println("\nУ кошки есть шерсть? ");
                        boolean hasHairiness = inputBoolean(in);
                        zoo.addAnimal(new Cat(height, weight, eyesColor, nickname,
                                breed, vaccinated, woolColor, hasHairiness));
                    }
                        break;
                    case 2: {
                        System.out.println("\nСобака дрессированная? ");
                        boolean trainingAvailability = inputBoolean(in);
                        zoo.addAnimal(new Dog(height, weight, eyesColor, nickname,
                                breed, vaccinated, woolColor, trainingAvailability));
                    }
                        break;
                    default: System.out.println("\nНеверный пункт, возвращаемся в главное меню...");
                } 
            } break;
            case 2: {
                System.out.println("\nВведите ареал обитания: ");
                String habitat = in.next();
                System.out.println("\nВВедите дату, когда животное было найдено: ");
                String foundDate = in.next();
                System.out.println("Какой вид дикого животного вы вводите?\n" +
                        "1 - Тигр\n" +
                        "2 - Волк");
                choice = inputNaturalNumber(in);
                switch (choice) {
                    case 1: zoo.addAnimal(new Tiger(height, weight, eyesColor, habitat,
                            foundDate));
                            break;
                    case 2: {
                        System.out.println("\nЯвляется ли волк вожаком стаи? ");
                        boolean packLeader = inputBoolean(in);
                        zoo.addAnimal(new Wolf(height, weight, eyesColor, habitat,
                                foundDate, packLeader));
                    } break;
                    default: System.out.println("\nНеверный пункт, возвращаемся в главное меню...");
                }
            } break;
            case 3: {
                System.out.println("\nВведите максимальную высоту полета птицы: ");
                int flightAltitude = inputNaturalNumber(in);
                System.out.println("Какой вид птиц вы вводите?\n" +
                        "1 - Курица\n" +
                        "2 - Аист");

                choice = inputNaturalNumber(in);
                switch (choice) {
                    case 1: zoo.addAnimal(new Hen(height, weight, eyesColor));
                        break;
                    case 2: zoo.addAnimal(new Stork(height, weight, eyesColor, flightAltitude));
                        break;
                    default: System.out.println("\nНеверный пункт, возвращаемся в главное меню...");
                }
            }
        }
    }

    int inputNaturalNumber(Scanner in) {
        int number = 0;
        boolean checkNegative = false;

        while (!checkNegative) {

            while (!in.hasNextInt()) {
                System.out.println("Вы ввели не число, пожалуйста, повторите ввод!");
                in.next();
            }
            number = in.nextInt();

            if (number < 0)
                System.out.println("Вы ввели отрицательное число, пожалуйста, повторите ввод!");
            else
                checkNegative = true;
        }
        return number;
    }

    boolean inputBoolean(Scanner in) {
        boolean bool;

        while (!in.hasNextBoolean()) {
            System.out.println("Вы ввели не логическое значение, пожалуйста, повторите ввод!");
            in.next();
        }
        bool = in.nextBoolean();
        return bool;
    }
}