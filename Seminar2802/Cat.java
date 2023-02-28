/*
Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.

Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные 
поля и методы. Создайте несколько экземпляров этого класса, выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст 
(или другие параметры на ваше усмотрение).
 */

package Seminar2802;

import java.time.LocalDate;

public class Cat {              // Класс - это шаблон для будущих объектов
    String name;                // У класса есть поля (переменные) и методы (то, что может делать объект)
    String color;
    LocalDate dateOfBirth;
    String nameOwner;
    int id;
    String gender;
    double weight;
                                // Медод - конструктор (единственный, кот. пишется с большой буквы)
    Cat() {                     // называется как класс (Cat). Используется редко.
        name = "default";       // т.е. в жизни так почти не делают. Поэтому этот код закомментируем
        color = "red";
        dateOfBirth = LocalDate.of(2010, 1, 20);   // а делают как показано ниже
    }

    public Cat(String name, String color, LocalDate dateOfBirth) {
        this.name = name;
        this.color = color;  // чтобы не спутать регистры, лучше написать:  color.toLowerCase();
        this.dateOfBirth = dateOfBirth;  // теперь после создания этого контруктора, наш ранее созданный контруктор
    }                                    // в файле Main горит красным, т.к. в нем нет аргументов



    int getAge(){
        LocalDate date = LocalDate.now();
        return date.getYear() - dateOfBirth.getYear();
    }

    @Override                   // переопределение метода, иначе на печать выйдет хэшкод
    public String toString(){       
        return name + " цвет " + color + ", возраст " + getAge() + " лет";
    }

    //@Override
    public boolean equals(Object obj) {         // создаем метод equals
        // TODO Auto-generated method stub
        if (this == obj){
            return true;        // super - это обращение к родительскому классу. нам не нужен, пишем свое
        }    
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) obj;   // делаем явное преобразование объекта к классу Cat
        if (this.name.equals(cat.name) && color.equals(cat.color) && dateOfBirth.equals(cat.dateOfBirth)) {
            return true;
        } else {
            return false;
        }
    }    

    //@Override    
    public int hashCode() {                 // после этого в множестве set будет уже не 3 объекта, а один
        return name.hashCode() + 7 * color.hashCode() + 13 * dateOfBirth.hashCode(); // доьножают на простые числа
                                                                                   // во избежание коллизий
    }
                          
    
}
