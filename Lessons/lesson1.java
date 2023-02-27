package Lessons;
// public class lesson1 {

//     public static void main(String[] args) {
// System.out.println("Hello, World!");    // comments
// short age = 10;
// System.out.println(age);                // 10
// float x = 321.54f;                      // для float пишем суффикс f в конце
// System.out.println(x);                  // 321.54
// double f = 123.45;                      // для double есть необязательный суффикс D
// System.out.println(f);                  // 123.45
// char ch = '(';                          // только 1 символ в кавычках
// System.out.println(ch);                 // (
// boolean flag1 = 123 <= 234;
// System.out.println(flag1);              // true
// boolean flag2 = 123 >= 234 || flag1;
// System.out.println(flag2);              // true
// boolean flag3 = flag1 ^ flag2;          // разделительная дизъюнкция, дает True, когда только одно значение истинно
// System.out.println(flag3);              // false    
// boolean ff = true || false;                //  || - ИЛИ,   && - И
// System.out.println(ff);
//     }
// }

// Типы данных.  Символ
// ---------------------
// public class lesson1 {
//     public static void main(String[] args) {
//     char ch = '1';
//     System.out.println(Character.isDigit(ch)); // true
//     ch = 'a';
//     System.out.println(Character.isDigit(ch)); // false
//     }
// }    

// Типы данных. Boolean
// --------------------
// public class lesson1 {
//     public static void main(String[] args) {
//     boolean flag1 = 123 <= 234;
//     System.out.println(flag1);              // true
//     boolean flag2 = 123 >= 234 || flag1;
//     System.out.println(flag2);              // true
//     boolean flag3 = flag1 ^ flag2;
//     System.out.println(flag3);              // false
//     }
// }

// Н Е Я В Н А Я    Т И П И З А Ц И Я
// -----------------------------------
// public class lesson1 {
//     public static void main(String[] args) {
//         var a = 123;
//         System.out.println(a);                  // 123
//         var d = 123.456;
//         System.out.println(d);                  // 123.456
//         System.out.println(getType(a));         // Integer
//         System.out.println(getType(d));         // Double
//         d = 1022;
//         System.out.println(d);                  // 1022
//         //d = "mistake";
//         //error: incompatible types:
//         //String cannot be converted to double
//     }
//     static String getType(Object o){
//         return o.getClass().getSimpleName();
//     }
// }

// К Л А С С Ы - О Б Ё Р Т К И
// ----------------------------
// Примитив  ||   Обертка
// -----------------------
// int       ||   Integer
// short     ||   Short
// long      ||   Long
// byte      ||   Byte
// float     ||   Float
// double    ||   Double
// char      ||   Character
// boolean   ||   Boolean

// Типы данных. Integer
// --------------------
// class lesson1 {
//     public static void main(String[] args) {
//     System.out.println(Integer.MAX_VALUE);      //  2147483647
//     System.out.println(Integer.MIN_VALUE);      // -2147483648
//     }
// }

//  С Т Р О К А
//  ------------
// public class lesson1 {
//     public static void main(String[] args) {
//         String s = "qwer";
//         s.charAt(1);
//         System.out.println(s.charAt(1));        // w
//     }
// }        

// М А С С И В Ы
// -------------
// Одномерные массивы
// ------------------
// public class lesson1 {
//     public static void main(String[] args) {
//     int[] arr = new int[10];
//     System.out.println(arr.length);         // 10
//     arr = new int[] { 1, 2, 3, 4, 5 };
//     System.out.println(arr.length);         // 5
//     }
// }

// Многомерные мвссивы. Построчный вывод
// --------------------------------------
// public class lesson1 {
//     public static void main(String[] args) {
//         int[] arr[] = new int[3][5];
//         for (int[] line : arr) {
//             for (int item : line) {
//             System.out.printf("%d ", item);     // 0 0 0 0 0
//             }                                   // 0 0 0 0 0 
//         System.out.println();                   // 0 0 0 0 0     и переход строки
//         }
//     }
// }

// Многомерные массивы - поэлементный вывод
// -----------------------------------------
// public class lesson1 {
//     public static void main(String[] args) {
//         int[][] arr = new int[3][5];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//             System.out.printf("%d ", arr[i][j]);
//             }
//         System.out.println();
//         }
//     }
// }

//  П Р Е О Б Р А З О В А Н И Я
//  -----------------------------
//  Можно:
//  ------
// public class lesson1 {
//     public static void main(String[] args) {
//         int i = 123; double d = i;      // неявное преобразование
//         System.out.println(i);          // 123
//         System.out.println(d);          // 123.0
//         d = 3.1415; i = (int)d;
//         System.out.println(d);          // 3.1415
//         System.out.println(i);          // 3
//         d = 3.9415; i = (int)d;
//         System.out.println(d);          // 3.9415
//         System.out.println(i);          // 3
//         byte b = Byte.parseByte("123"); // явное преобразование
//         System.out.println(b);          // 123
//         b = Byte.parseByte("1234");     // byte может хранить значения до 255
//         System.out.println(b);          // NumberFormatException: Value out of range
//     }
// }

//  Hо:
//  -------
// class lesson1 {
//     public static void main(String[] args) {
//     int[] a = new int[10];
//     double[] d = a;         // нельзя положить в double какой-то int       
//     }                       // ИЗУЧАЕМ ковариантность и контравариантность                   
// }

//  П О Л У Ч Е Н И Е     Д А Н Н Ы Х  И З   Т Е Р М И Н А Л А
//  ----------------------------------------------------------
//  С Т Р О К И
//  -----------
// import java.util.Scanner;
// public class lesson1 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");                // вводим имя
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!\n", name);
//         iScanner.close();
//     }
// }

// Получение примитивов
// --------------------
// import java.util.Scanner;
//     public class lesson1 {
//         public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");               // вводим int
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");            // вводим double
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);  // получим double
//         System.out.println();
//         iScanner.close();
//     }
// }

// Проверка на соответствие получаемого типа
// ------------------------------------------
// import java.util.Scanner;
// public class lesson1 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt();
//         System.out.println(flag);
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     } 
// }


        // boolean flag = true;
        // while (flag) {
        //     Scanner iScanner = new Scanner(System.in);
        //     System.out.printf("Введите первое число a: ");
        //     if (iScanner.hasNextFloat()) {
        //         a = iScanner.nextFloat();
        //         flag = false;
        //     } else {
        //         System.out.println("Вы ввели некорректное значение. Попробуйте снова. ");
        //     }
        // }


//  Ф О Р М А Т И Р О В А Н Н Ы Й    В Ы В О Д
//  -------------------------------------------
// public class lesson1 {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);                // 1 + 2 = 3
//     }
// }

// public class lesson1 {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);       // 1 + 2 = 3
//         System.out.println(res);                             // 1 + 2 = 3
//     }
// }

//   С П Е Ц И Ф И К А Т О Р Ы
//   --------------------------
// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
// %c: для вывода одиночного символа
// %s: для вывода строковых значений

// public class lesson1 {
//     public static void main(String[] args) {
//         float pi = 3.1415f;
//         System.out.printf("%f\n", pi);      // 3,141500
//         System.out.printf("%.2f\n", pi);    // 3,14
//         System.out.printf("%.3f\n", pi);    // 3,141
//         System.out.printf("%e\n", pi);      // 3,141500e+00
//         System.out.printf("%.2e\n", pi);    // 3,14e+00
//         System.out.printf("%.3e\n", pi);    // 3,141e+00
//     }
// }

//  Область видимости переменных
//  ----------------------------
// Если переменную объявили внутри некоторого блока фигурных скобок { },
// то снаружи этого блока переменная будет недоступна.

// public class lesson1 {
//     public static void main(String[] args) {
//         {
//         int i = 123;
//         System.out.println(i);      // здесь i видна
//         }
//         System.out.println(i);      // error: cannot find symbol   -  а тут не видна
//     }
// }

//    Ф У Н К Ц И И    И    М Е Т О Д Ы
//    ----------------------------------
// public class lesson1 {
//     static void sayHi() {
//         System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//         return a + b;
//     }
//     static double factor(int n) {
//         if (n == 1)
//             return 1;
//         return n * factor(n - 1);
//     }
//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }
// }

//  У С Л О В Н Ы Й    О П Е Р А Т О Р 
//  -----------------------------------
// public class lesson1 {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } 
//         else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }

// public class lesson1 {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c = 0;
//         if (a > b)
//             c = a;
//         if (b > a)
//             c = b;
//         System.out.println(c);
//     }
// }

//  Т Е Р Н А Р Н Ы Й   О П Е Р А Т О Р 
//  ------------------------------------
// public class lesson1 {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b;
//         System.out.println(min);
//     }
// }

//   Оператор выбора
//   ----------------
// import java.util.Scanner;
// public class lesson1 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int season: ");               // вводим int
//         int season = iScanner.nextInt();
//         String text = "";
//         switch (season) {
//             case 1:
//                 text = "Autumn";
//                 break;
//             case 2:
//                 text = "Winter";
//                 break;
//             case 3:
//                 text = "Spring";
//                 break;
//             case 4:
//                 text = "Summer";
//                 break;
//             default:
//                 text = "mistake";
//                 break;
//         }
//         System.out.println(text);
//         iScanner.close();
//     }
// }

//   Ц И К Л Ы
//   -----------------
//   Бывают три вида циклов:
//  * цикл  while;
//  * цикл  do while;
//  * цикл  for;  и его модификация for in.

//  W H I L E
//  ----------
// public class lesson1 {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count);      // 3
//     }
// }

//  D O   W H I L E
//  ----------------
// public class lesson1 {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         do {
//             value /= 10;
//             count++;
//         } while (value != 0);
//         System.out.println(count);      // 3
//     }
// }

//   C O N T I N U E,  B R E A K
//   ---------------------------
// Выполнение следующей итерации цикла — continue.
// Прерывание текущей итерации цикла — break.

//    F O R
//  ------------
// public class lesson1 {
//     public static void main(String[] args) {
//         int s = 0;
//         for (int i = 1; i <= 10; i++) {
//             s += i;
//         }
//         System.out.println(s);                  //  55
//     }
// }

// Вложенные циклы
// -----------------
// public class lesson1 {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         // * * * * *                // результат работы циклов
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//     }
// }

//  Работает только для коллекций
//  -----------------------------
// public class lesson1 {
//     public static void main(String[] args) {
//         int arr[] = new int[10];
//         for (int item : arr) {
//             System.out.printf("%d ", item);
//         }
//         System.out.println();
//     }
// }

//    Р А Б О Т А    С   Ф А Й Л А М И
//  ----------------------------------------
//    Создание и запись / дозапись
// import java.io.FileWriter;
// import java.io.IOException;
// public class lesson1 {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", true)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.append('\n');
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     }
// }

// Чтение, Вариант посимвольно
// ---------------------------
// import java.io.*;
// public class lesson1 {
//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n') {
//                 System.out.print(ch);
//             } else {
//                 System.out.print(ch);
//             }
//         }
//     }
// }

// Вариант построчно
// ------------------
// import java.io.*;
// public class lesson1 {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//         String str;
//         while ((str = br.readLine()) != null) {
//             System.out.printf("== %s ==\n", str);
//         }
//         br.close();
//     }
// }

// Задачи для самоконтроля
// 1. Задана натуральная степень k. Сформировать случайным
// образом список коэффициентов (значения от 0 до 100)
// многочлена многочлен степени k.
// *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
// 2. Даны два файла, в каждом из которых находится запись
// многочлена. Сформировать файл содержащий сумму
// многочленов.