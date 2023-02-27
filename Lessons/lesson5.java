package Lessons;

//
//                             Collection
//          Set                  List                   Queue
// HashSet SortedSet      ArrayList Vector   LinkedList      PriorityQueue
// LinkedHashset (устар.)
//        NavigableSet
//           TreeSet                 MAP
//  -------------------------------------------------------------------------
//                           MAP
// HashMap              SortedMap               HashTable(устар.)
// LinkedHashMap        NavigableMap            
//                      TreeMap
// ==========================================================================
//   H A S H M A P
//   -------------
//  Map = это множество коллекций, работающих с данными по принципу <Ключ / Значение>.
// Ключевые особенности:
// ● ускоренная обработка данных;
// ● порядок добавления не запоминается.
// ● допускаются только уникальные ключи, значения могут повторяться;
// ● помните про null значения*;
// ● ускоренная обработка данных;
// ● порядок добавления не запоминается.
// В HashMap элементы располагаются как угодно и могут менять свое положение.
// import java.util.*;
// public class lesson5 {
//     public static void main(String[] args) {
//         Map<Integer, String> db = new HashMap<>();
//         db.put(1, "один"); System.out.println(db);  // {1=один}
//         db.put(2, "два"); System.out.println(db);   // {1=один, 2=два}
//         db.put(3, "три"); System.out.println(db);   // {1=один, 2=два, 3=три}
//         db.put(31, "три один"); System.out.println(db); // {1=один, 2=два, 3=три, 31=три один}
//         db.put(13, "один три"); System.out.println(db); // {1=один, 2=два, 3=три, 13=один три, 31=три один}
//         db.put(null, "!null"); System.out.println(db);  // {null=!null, 1=один, 2=два, 3=три, 13=один три, 31=три один}
//         db.put(null, null); System.out.println(db);     // {null=null, 1=один, 2=два, 3=три, 13=один три, 31=три один}
//         System.out.println(db.get(44));                 // null
//         db.remove(null); 
//         System.out.println(db); // {1=один, 2=два}      // {1=один, 2=два, 3=три, 13=один три, 31=три один}
//         System.out.println(db.containsValue("один"));   // true
//         System.out.println(db.containsValue(1));        // false
//         System.out.println(db.containsKey("один"));     // false
//         System.out.println(db.containsKey(1));          // true
//         System.out.println(db.keySet());                // [null, 1, 2, 3, 13, 31]
//         System.out.println(db.values());                // [null, один, два, три, один три, три один]
//     }
// }
//  HashMap
// put(K,V) – добавить пару если или изменить значение,если ключ имеется.
// putIfAbsent(K,V) – произвести добавление если ключ не найден.
// get(K) - получение значения по указанному ключу.
// remove(K) – удаляет пару по указанному ключу.
// containsValue(V) – проверка наличия значения.
// containsKey(V) – проверка наличия ключа.
// keySet() – возвращает множество ключей.
// values() – возвращает набор значений.
//
// Работа с парами:
// import java.util.*;
//
// public class lesson5 {
//     public static void main(String[] args) {
//         Map<Integer, String> db = new HashMap<>();
//         db.putIfAbsent(1, "один");  // c проверкой отсутствия ключа
//         db.put(2, "два");
//         db.put(3, "три");
//         System.out.println(db);             // {1=один, 2=два, 3=три}
//
//         for (var item : db.entrySet()) {
//             System.out.printf("[%d: %s]\n", item.getKey(), item.getValue()); // [1: один]
//         }                                                                    // [2: два]
//     }                                                                        // [3: три]
// }
// Как ускорить работу
// import java.util.*;

// public class lesson5 {
//     public static void main(String[] args) {
//         Map<Integer, String> map1 = new HashMap<>();
//         Map<Integer, String> map2 = new HashMap<>(9);
//         Map<Integer, String> map3 = new HashMap<>(9, 1.0f);
//     }
// }
// HashMap. Любознательным
// ● Хэш-функции и хэш-таблицы
// ● Прямое связывание (хэширование с цепочками)
// ● Хэширование с открытой адресацией
// ● Теория графов:
//   ● деревья построенные на списках
//   ● бинарные деревья
//   ● сбалансированные деревья
//   ● *алгоритм балансировки дерева
//   ● ** красно-черные деревья, деревья поиска
// ========================================================================
//   T r e e M a p
//   -------------
// В основе данной коллекции лежат красно-чёрные деревья.
// Позволяют быстрее искать, но могут возникнуть «заминки» при добавлении.
// import java.util.*;

// public class lesson5 {
//     public static void main(String[] args) {
//         TreeMap<Integer,String> tMap = new TreeMap<>();
//         tMap.put(1,"один"); System.out.println(tMap);       // {1=один}
//         tMap.put(6,"шесть"); System.out.println(tMap);      // {1=один, 6=шесть}
//         tMap.put(4,"четыре"); System.out.println(tMap);     // {1=один, 4=четыре, 6=шесть}
//         tMap.put(3,"три"); System.out.println(tMap);        // {1=один, 3=три, 4=четыре, 6=шесть}
//         tMap.put(2,"два"); System.out.println(tMap); // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}
//     }
// }
// Методы:
// put(K,V)
// get(K)
// remove(K)
// descendingKeySet(V)
// descendingMap()
// tailMap()
// headMap()
// lastEntry()
// firstEntry()
// =======================================================================================
//  L i n k e d H a s h M a p
//  -------------------------
// «Старший брат» коллекции HashMap, который все помнит…
// Помнит порядок добавления элементов ➜ более медлительный
// import java.util.*;

// public class lesson5 {
//     public static void main(String[] args) {
//         Map<Integer,String> linkmap = new LinkedHashMap<>();
//         linkmap.put(11, "один один");
//         linkmap.put(1, "два");          // используем, если важем порядок, но не скорость
//         linkmap.put(2, "один");         // первым пришел - первым и стоит
//         System.out.println(linkmap);    // {11=один один, 1=два, 2=один}
//         Map<Integer,String> map = new HashMap<>();
//         map.put(11, "один один");
//         map.put(2, "два");
//         map.put(1, "один");             // HashMap - порядка нет, но быстрее
//         System.out.println(map);        // {1=один, 2=два, 11=один один}
//     }
// }
// =======================================================================================
//     H a s h T a b l e
//     -----------------
// «Устаревший брат» коллекции HashMap, который не знает про null
// import java.util.*;

// public class lesson5 {
//     public static void main(String[] args) {
//         Map<Integer,String> table = new Hashtable<>();
//         table.put(1, "два");
//         table.put(11, "один один");
//         table.put(2, "один");
//         System.out.println(table); // {2=один, 1=два, 11=один один}
//         // table.put(null, "один"); //  java.lang.NullPointerException
//     }
// }
