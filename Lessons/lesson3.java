// public class lesson3 {
//     static int[] AddItemInArray(int[] array, int item) {
//         int length = array.length;
//
//         int[] temp = new int[length + 1];
//         System.arraycopy(array, 0, temp, 0, length);
//         temp[length] = item;
//         return temp;
//     }
//
//     public static void main(String[] args) {
//         int[] a = new int[] { 0, 9 };
//         for (int i : a) {
//             System.out.printf("%d ", i);    // 0 9
//         }
//         a = AddItemInArray(a, 11);      // 0 9 11
//         a = AddItemInArray(a, 111);     // 0 9 11 111
//         a = AddItemInArray(a, 1111);    /// 0 9 11 111 1111
//         System.out.println();
//         for (int j : a) {
//             System.out.printf("%d ", j);
//         }
//         System.out.println();
//     }
// }
//
//             O B J E C T
//
// Тип данных Object – «всему голова»
// Упаковка – любой тип можно положить в переменную типа Object
// Распаковка – преобразование Object-переменной в нужный тип
// Иерархия типов – любой тип «ниже» Object’а
// В примере создается один метод GetType для получения типа для разных типов,
// просто помещая их в методе в Object
//
// public class lesson3 {
//     public static void main(String[] args) {
//     Object o = 1; GetType(o);       // java.lang.Integer
//     o = 1.2; GetType(o);            // java.lang.Double
//     }
//     static void GetType(Object obj) {
//     System.out.println(obj.getClass().getName());
//     }
// }
//
// Нижнйй пример иллюстрирует возможностьь обработки разных видов данных путем
// проверки, относятся ли они к такому-то типу (instanceof())
//
// public class Ex01_object {
//     public static void main(String[] args) {
//         System.out.println(Sum(1, 2));
//         System.out.println(Sum(1.0, 2));
//         System.out.println(Sum(1, 2.0));
//         // System.out.println(Sum("каша", "маша"));  // тут выйдет ошибка - этот тип не обрабатывается в Sum
//     }                                                // т.е. не проверяется.
//
//     static Object Sum(Object a, Object b) {
//         if (a instanceof Double && b instanceof Double) {
//             return (Object) ((Double) a + (Double) b);
//         } else if (a instanceof Integer && b instanceof Integer) {
//             return (Object) ((Integer) a + (Integer) b);
//         } else
//             return 0;
//     }
// }
//
//
// =========================================================================
//
//               М А С С И В Ы
//
// Как увеличить размер массива? Например, есть массив из двух элементов:
//
// public class lesson3 {
// public static void main(String[] args) {
// int[] a = new int[] { 1, 9 };
// int[] b = new int[3]; // надо добавить третий алемент
// System.arraycopy(a, 0, b, 0, a.length); // из а в b с нулевого элемента всю
// длину
// for (int i : a) { System.out.printf("%d ", i);} // 1 9
// System.out.println();
// for (int j : b) { System.out.printf("%d ", j);} // 1 9 0
// }
// }

// или через отдельный метод AddItem:

// public class lesson3 {
// static int[] AddItem(int[] array, int item) {
// int length = array.length;
// int[] temp = new int[length + 1];
// System.arraycopy(array, 0, temp, 0, length);
// temp[length] = item;
// return temp;
// }
// public static void main(String[] args) {
// int[] a = new int[] { 0, 9 };
// for (int i : a) { System.out.printf("%d ", i); } // 0 9
// System.out.println();
// a = AddItem(a, 2);
// a = AddItem(a, 3);
// for (int j : a) { System.out.printf("%d ", j); } // 0 9 2 3
// }
// }
// По одному элементу добавлять невыгодно (память, производительность)
// ====================================================================

//                  К О Л Л Е К Ц И И
// Иерархия коллекции
//
//                             Collection
//          Set                  List                   Queue
// HashSet SortedSet      ArrayList Vector   LinkedList      PriorityQueue
// LinkedHashset (устар.)
//        NavigableSet
//           TreeSet

// MAP

// LIST

// ArrayList list = new ArrayList();
//
// ронумерованный набор элементов.
// Пользователь этого интерфейса имеет точный контроль над тем,
// где в списке вставляется каждый элемент.
// Пользователь может обращаться к элементам по их целочисленному
// индексу (позиции в списке) и искать элементы в списке.
//
// Разные способы создания
// ArrayList<Integer> list1 = new ArrayList<Integer>();
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>(10);
// ArrayList<Integer> list4 = new ArrayList<>(list3);
//
// import java.util.ArrayList;
// import java.util.List;

// public class Ex002_ArrayList {
// public static void main(String[] args) {
// // ArrayList<Integer> list = new ArrayList<Integer>();
// List list = new ArrayList();
// list.add(2809);
// list.add("string line");
// for (Object o : list) {
// System.out.println(o); // 2809
// // string line
// // при условии, что мы не задавали list как <Integer>
// }
// }
// }

// add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
// get(pos) – возвращает элемент из списка по указанной позиции
// indexOf(item) – первое вхождение или -1
// lastIndexOf(item) – последнее вхождение или -1
// remove(pos) – удаление элемента на указанной позиции и его возвращение
// set(int pos, T item) – gjvtoftn значение item элементу, который находится
// на позиции pos
// void sort(Comparator) – сортирует набор данных по правилу
// subList(int start, int end)

// clear() – очистка списка
// toString() – «конвертация» списка в строку
// Arrays.asList – преобразует массив в список
// containsAll(col) – проверяет включение всех элементов из col
// removeAll(col) – удаляет элементы, имеющиеся в col
// retainAll(col) – оставляет элементы, имеющиеся в col
// toArray() – конвертация списка в массив Object’ов
// toArray(type array) – конвертация списка в массив type
// List.copyOf(col) – возвращает копию списка на основе имеющегося
// List.of(item1, item2,...) – возвращает неизмен
//
// Пример с Integer
//
// import java.util.Arrays;
// import java.util.List;

// public class lesson3 {
// public static void main(String[] args) {
// int day = 29;
// int month = 9;
// int year = 1990;
// Integer[] date = { day, month, year };
// List<Integer> d = Arrays.asList(date);
// System.out.println(d); // [29, 9, 1990]
// }
// }
//
// Пример со строковым StringBuilder (фишка с заменой данных в исходном
// массиве date и автоматически меняется месяц и в коллекии d)
//
// import java.util.Arrays;
// import java.util.List;

// public class Ex005_ArraysMethod {
// public static void main(String[] args) {
// StringBuilder day = new StringBuilder("29");
// StringBuilder month = new StringBuilder("9");
// StringBuilder year = new StringBuilder("1990");
// StringBuilder[] date = { day, month, year };
// List<StringBuilder> d = Arrays.asList(date);
// System.out.println(d); // [29, 9, 1990]
// date[1] = new StringBuilder("09"); // в массиве поменяли месяц
// System.out.println(d); // [29, 09, 1990] // заменилось и в коллекции
// }
// }
//
// В коллекциях, созданных с помощью ListOf(), нельзя просто так удалить
// (remove) элементы.
//
// import java.util.List;

// public class lesson3 {
// public static void main(String[] args) {
// Character value = null;
// List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
// System.out.println(list1); // [S, e, r, g, e, y]
// // list1.remove(1); // java.lang.UnsupportedOperationException
// List<Character> list2 = List.copyOf(list1);
// }
// }
// Можно так:
//
// import java.util.*;

// public class lesson3 {
// public static void main(String[] args) {
// Character value = null;
// List<Character> list1 = new ArrayList<Character>();
// list1.add('S');
// list1.add('e');
// list1.add('r');
// System.out.println(list1); // [S, e, r]
// list1.remove(1); // java.lang.UnsupportedOperationException
// System.out.println(list1); // [S, r] 'е' удалилось
// List<Character> list2 = List.copyOf(list1);

// }
// }
//
//               И Т Е Р А Т О Р Ы
// ====================================================================
// Получение итератора с целью более гибкой работы с данными.
// Интерфейс Iterator<E>. Итератор коллекцией. Iterator занимает место
// Enumeration в Java Collections Framework. Итераторы отличаются от
// перечислений двумя способами:
// Итераторы позволяют вызывающей стороне удалять элементы из
// базовой коллекции во время итерации с четко определенной
// семантикой.
// hasNext(), next(), remove()
// ListIterator<E> 
// hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)
//
// import java.util.*;

// public class lesson3 {
// public static void main(String[] args) {
// List<Integer> list = List.of(1, 12, 123, 1234, 12345);
// for (int item : list) {
// System.out.println(item);
// }
// Iterator<Integer> col = list.iterator();
// while (col.hasNext()) {
// System.out.println(col.next());
// // col.next(); // нельзя дважды вызывать next
// // col.remove(); // нельзя удалять из массива, созданного методом ListOf
// }
// }
// }
//
