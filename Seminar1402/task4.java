//4) Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.
// java.util.logging.FileHandler.encoding=UTF-8

package Seminar1402;

import java.io.FileWriter;
import java.io.IOException;

public class task4 {
    public static void main(String[] args) {
        String new_str = make_str("TEST", 10);
        System.out.println(new_str);
        System.out.println(new_str.length());  
        file_rec(new_str);      

    }
    public static String make_str(String c, int n) {
       
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        String new_str = "";

        for (int i = 0; i < n; i++) {
            new_str += sb;
        }
        return new_str;
    }
    public static void file_rec(String my_str) {
        //File test = new File("text.txt");
        try (FileWriter test = new FileWriter("text.txt", true)) {
                        test.write(my_str);
        } catch (IOException ex) {
            System.out.println("Не получилось");
        }
    }
}



// import java.io.File;
// import java.io.FileWriter;


// public class Main {
// private static Object our_writer;

// public static void main(String[] args) {
// StringBuilder s = create_str();
// create_file(s);
// }
// public static StringBuilder create_str(){
// StringBuilder s = new StringBuilder();
// for(int i = 0; i < 100; i++){
// s.append("TE-ST");
// }
// System.out.println(s);
// return s;
// }
// public static void create_file(StringBuilder s){
// try(FileWriter our_writer = new FileWriter("f1")) {
// our_writer.write(String.valueOf(s));
// } catch (Exception error){
// System.out.println("Ошибка!");
// }
// finall
