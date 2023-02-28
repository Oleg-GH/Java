// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
// что 1 человек может иметь несколько телефонов.

package Seminar2402_HW;

public class task1 {
    public static void main(String[] args) {
        Dbphone dbphone = new Dbphone();
        
        dbphone.phoneBook();                                // Телефонная книга пуста.
        dbphone.newContact("Иван", 9998877);
        dbphone.newContact("Василий", 9998866);
        dbphone.newContact("Сергей", 9998855);
        dbphone.newContact("Иван", 9998876);
        dbphone.newContact("Петр", 9998844);
        dbphone.phoneBook();                                // Выдаются все существующие контакты
        dbphone.findContact("Иван");                  // Все номера Ивана
        dbphone.findContact("Алина");                 // Отсутствует в тел.книге

    }    
}
