package SeminarOOP0703_HW2_2;

import SeminarOOP0703_HW2_2.Abstract.Animal;
import SeminarOOP0703_HW2_2.Abstract.Birds;
import SeminarOOP0703_HW2_2.Abstract.Domestic;
import SeminarOOP0703_HW2_2.Abstract.Wild;
import SeminarOOP0703_HW2_2.Interfaces.Ihairiness;
import SeminarOOP0703_HW2_2.Interfaces.IpackLeader;
import SeminarOOP0703_HW2_2.Interfaces.ItrainingAvailability;

import java.util.LinkedList;

public class Zoo {
    private final LinkedList<Animal> zoo;

    public Zoo() {
        zoo = new LinkedList<>();
    }
    public LinkedList<Animal> getZoo() {
        return zoo;
    }
    public void addAnimal(Animal animal) {
        zoo.add(animal);
    }

    public void removeAnimal(int i) {
        if (i < 0 || i >= zoo.size())
            System.out.println("Нет животного с указанным индексом!");
        else {
            System.out.printf(String.format("Животное %s с индексом %d удален из зоопарка!\n", 
                              zoo.get(i).getClass().getSimpleName(), i));
            zoo.remove(i);
        }
    }

    public String getAnimalInfo(int i) {
        if (i < 0 || i >= zoo.size())
            return "Нет животного с указанным индексом!";
        else {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(
                "Информация о животном %s с индексом %d:\nВысота: %d см,\nВес: %d кг,\nЦвет глаз: %s. ",
                    zoo.get(i).getClass().getSimpleName(), i,
                    zoo.get(i).getHeight(),
                    zoo.get(i).getWeight(),
                    zoo.get(i).getEyesColor()));
        
            if (zoo.get(i) instanceof Birds)
                sb.append(String.format("Высота полета: %s м\n",
                        ((Birds) zoo.get(i)).getFlightAltitude()));

            else if (zoo.get(i) instanceof Domestic)
                sb.append(String.format(
                            "Кличка: %s, Порода: %s, Вакцинация: %s, Цвет шерсти: %s. ",
                        ((Domestic) zoo.get(i)).getNickname(),
                        ((Domestic) zoo.get(i)).getBreed(),
                        ((Domestic) zoo.get(i)).getVaccinated(),
                        ((Domestic) zoo.get(i)).getWoolColor()));

            else if (zoo.get(i) instanceof Wild)
                sb.append(String.format(
                            "Место обитания: %s, Найден, дата: %s. ",
                        ((Wild) zoo.get(i)).getHabitat(),
                        ((Wild) zoo.get(i)).getFoundDate()));

            if (zoo.get(i) instanceof Ihairiness)
                sb.append(String.format("Наличие шерсти: %b.\n ",
                        ((Ihairiness) zoo.get(i)).hasHairiness()));
            if (zoo.get(i) instanceof ItrainingAvailability)
                sb.append(String.format("Дрессировка: %b.\n ",
                        ((ItrainingAvailability) zoo.get(i)).hasTrainingAvailability()));
            if (zoo.get(i) instanceof IpackLeader)
                sb.append(String.format("Вожак стаи: %b.\n ",
                        ((IpackLeader) zoo.get(i)).isPackLeader()));

            return sb.toString();
        }
    }

    public String getAllAnimalsInfo () {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zoo.size(); i++)
            sb.append(getAnimalInfo(i)).append("\n");
        return sb.toString();
    }

    public String makeSoundAtIndex(int i) {
        if (i < 0 || i >= zoo.size())
            return ("Нет животного с указанным индексом!");
        else
            return zoo.get(i).makeSound();
    }

    public String makeAllSound () {
        StringBuilder sb = new StringBuilder();
        for (Animal animal : zoo)
            sb.append(animal.makeSound()).append("\n");
        return sb.toString();
    }
}
