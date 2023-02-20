// Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
// String s1 = "hello";
// String s2 = "hello";
// String s3 = s1;
// String s4 = "h" + "e" + "l" + "l" + "o";
// String s5 = new String("hello");
// String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

//   Вывод:  метод equals сравнивает именно содержимое переменно.
//   В то время как == сравнивает ссылки

package Seminar1702;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class task1 {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'}); 

        // if (s1 == s2) System.out.println("1.2. s1 равен s2");
        // else System.out.println("1.2. s1 не равен s2");

        // if (s1 == s3) System.out.println("1.3. s1 равен s3"); 
        // else System.out.println("1.3. s1 не равен s3");    
        
        // if (s1 == s4) System.out.println("1.4. s1 равен s4"); 
        // else System.out.println("1.4. s1 не равен s4"); 

        // if (s1 == s5) System.out.println("1.5. s1 равен s5"); 
        // else System.out.println("1.5. s1 не равен s5");

        // if (s1 == s6) System.out.println("1.6. s1 равен s6"); 
        // else System.out.println("1.6. s1 не равен s6"); 

        // if (s1.equals(s2)) {System.out.println("2.2. s1 равен s2");} 
        // else {System.out.println("2.2. s1 не равен s2");}   

        // if (s1.equals(s3)) {System.out.println("2.3. s1 равен s3");} 
        // else {System.out.println("2.3. s1 не равен s3");} 
        
        // if (s1.equals(s4)) {System.out.println("2.4. s1 равен s4");} 
        // else {System.out.println("2.4. s1 не равен s4");} 
        
        // if (s1.equals(s5)) {System.out.println("2.5. s1 равен s5");} 
        // else {System.out.println("2.5. s1 не равен s5");}  

        // if (s1.equals(s6)) {System.out.println("2.6. s1 равен s6");} 
        // else {System.out.println("2.6. s1 не равен s6");} 
        
        // от Yoda

        ArrayList<String> arr = new ArrayList<>(List.of(s1, s2, s3, s4, s5, s6));

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                System.out.printf("[i:%d, j:%d] (%s == %s) -> %s\n", i, j, arr.get(i), arr.get(j), arr.get(i) == arr.get(j));
                System.out.printf("[i:%d, j:%d] (%s.equals(%s)) -> %s\n", i, j, arr.get(i), arr.get(j), Objects.equals(arr.get(i), arr.get(j)));
                System.out.println("----------------");
            }
            System.out.println("==================");
        }  
    }
} 



// от Yoda

