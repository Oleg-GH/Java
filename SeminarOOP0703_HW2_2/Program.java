package SeminarOOP0703_HW2_2;

import SeminarOOP0703_HW2_2.Abstract.Birds;
import SeminarOOP0703_HW2_2.Abstract.Domestic;
import SeminarOOP0703_HW2_2.Abstract.Wild;
import SeminarOOP0703_HW2_2.Birds.Hen;
import SeminarOOP0703_HW2_2.Birds.Stork;
import SeminarOOP0703_HW2_2.DomesticAnimals.Cat;
import SeminarOOP0703_HW2_2.DomesticAnimals.Dog;
import SeminarOOP0703_HW2_2.WildAnimals.Tiger;
import SeminarOOP0703_HW2_2.WildAnimals.Wolf;

public class Program {
    public static void main(String[] args) {

        Domestic maineсoon = new Cat(45, 6, "зеленые",
                "Кот Арнольд", "мейнкун", "Пуревакс 08.01.2023",
                "черный", true);
        Domestic sphinx = new Cat(30, 3, "карие",
                "Кот Принц", "сфинкс", "нет",
                "серый", false);
        Domestic dog = new Dog(40, 9, "карие",
                "Пёсик Шарик", "дворняжка", "нет",
                "серый", false);
        Wild tigr = new Tiger(90, 200, "желтые",
                "уссурийская тайга", "15.10.2022");
        Wild volchok = new Wolf(90, 100, "синие",
                "тамбовские леса", "20.12.2022", true);
        Birds hen = new Hen(30,2, "карие");
        Birds stork = new Stork(80,3, "голубые", 500);

        Zoo zoo = new Zoo();
        zoo.addAnimal(maineсoon);
        zoo.addAnimal(sphinx);
        zoo.addAnimal(dog);
        zoo.addAnimal(tigr);
        zoo.addAnimal(volchok);
        zoo.addAnimal(hen);
        zoo.addAnimal(stork);

        Console menu = new Console(zoo);
        menu.run();
    }
}
