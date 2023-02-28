/* 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество. 
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
*/

package Seminar2802;

import java.time.LocalDate;
// import java.util.HashSet;
// import java.util.Set;
//import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args) {
        //Set<Cat> set = new HashSet<>();         // это уже второе задание про equals()

        Cat cat = new Cat();  // конструктор - метод, который создает объект класса Cat
        System.out.println(cat);  // default цвет red, возраст 13 лет   (т.е. сначала выходит Cat())
        cat.name = "Барсик";      // и только с этого момента Cat становится рыжим Барсиком 5 лет
        cat.color = "Рыжий";
        cat.dateOfBirth = LocalDate.of(2018, 1, 20);


        Cat cat1 = new Cat();
        cat1.name = "Васька";
        cat1.color = "Рыжий";
        cat1.dateOfBirth = LocalDate.of(2015, 1, 20);

        System.out.println(cat.name + " " + cat.getAge());    // Барсик 5
        System.out.println(cat1.name + " " + cat1.getAge());  // Васька 8

        System.out.println(cat);  // если не переопределить метод в toString, то выведется хэш Cat@30f39991
        System.out.println(cat1); // и Cat@452b3a41. После переопределения метода выйдут сообщения типа
                                  // Барсик цвета Рыжий возраста 5 лет
                                   // Васька цвета Рыжий возраста 8 лет
        


    }
}
