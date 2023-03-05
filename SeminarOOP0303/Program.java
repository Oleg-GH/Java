/* реализовать следующий набор классов, при этом должна быть выделена их иерархия:
	2.1.Транспортное средство    2.2.Автомобиль      	2.3.Мотоцикл     	2.4.Грузовик
	2.5.Велосипед
Во всех классах должны быть написаны: цвет, модель, количество колёс, вес и скорость а так же метод ехать.
В классе Program реализовать метод который будет работать с любым наследником класса ровно так же как и 
с родителем, то есть показать значение всех его публичных свойств и вызвать метод ехать.
 */

package SeminarOOP0303;

public class Program {
    public static void main(String[] args) {
        // Viicle a = new Viicle();
        // a.go();
        Truck b = new Truck("green", "Ural", 6, 6000, 100);
        b.go();
        b.getProperties();
        Car c = new Car("green", "Moskvich", 5, 1300, 420);
        c.go();
        c.getProperties();
        Moto d = new Moto("black", "Yamaha", 2, 200, 300);
        d.go();
        d.getProperties();
        Bike e = new Bike("red", "Kama", 2, 20, 30);
        e.go();
        e.getProperties();

    }

    
}
