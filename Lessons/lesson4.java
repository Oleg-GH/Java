package Lessons;

//       П Р И О Р И Т Е Т Н Ы Е    К О Л Л Е К Ц И И 
//
// Иерархия коллекции
//
//                             Collection
//          Set                  List                   Queue
// HashSet SortedSet      ArrayList Vector   LinkedList      PriorityQueue
// LinkedHashset (устар.)           Stack
//        NavigableSet
//           TreeSet
//
// LinkedList
//
// Это двусвязный список.
// Список – гибкая структура данных, позволяющая легко менять свой
// размер. Элементы доступны для вставки или удаления в любой позиции.
// КАЖДЫЙ ЭЛЕМЕНТ ИМЕЕТ ИНФОРМАЦИЮ О СЛЕДУЮЩЕМ ЭЛЕМЕНТЕ. Чтобы посмотреть
// 10-й элемент, надо обратиться к 9-му, а о нем знает 8-й, и т.д.
// При удалении 2го эл-та мы паровозиком тянем остальные, меняем ссылку...
// Требуются ресурсы, если работать с массивом в 1 млн эл-тов.
// Список выгоднее использовать, когда приходится часто добавлять или удалять 
// данные.  Массив выгоднее использовать, когда приходится часто считывать данные.
// Если у последнего эл-та есть ссылка на первый, это однонаправленный циклический
// список.  Если у эл-тов есть ссылки на последующий и предыдущий эл-ты, это 
// двунаправленный список. Он тоже может быть циключеским (конец и начало имеют
// ссылки друг на друга).
// LinkedList нужен для небольшого количества элементов, в которых операции 
// добавления\удаления встречаются чаще операций чтения.
//
//          Q U E U E
//
// Queue<Integer> queue = new LinkedList<Integer>();
// Иерархия:
//                      Queue
//          Deque                    AbstractQueue
// LinkedList   ArrayDeque           PriorityQueue
//
//   PriorityQueue
// 
// Наивысший приоритет имеет наименьший элемент.
//

// import java.util.PriorityQueue;

// public class lesson4 {
//         public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//         pq.add(123);
//         pq.add(3);
//         pq.add(13);
//         pq.add(1);
//         System.out.println(pq);             // [1, 3, 13, 123]
//         System.out.println(pq.poll());      // 1
//         System.out.println(pq.poll());      // 3
//         System.out.println(pq.poll());      // 13
//         System.out.println(pq.poll());      // 123
//         System.out.println(pq.poll());      // null
//     }
// }
//
// import java.util.LinkedList;
// import java.util.Queue;
//
// public class lesson4 {
//     public static void main(String[] args) {
//         Queue<Integer> queue = new LinkedList<Integer>();
//         queue.add(1);
//         queue.add(2);
//         queue.add(3);
//         queue.add(4);
//         System.out.println(queue);      // [1, 2, 3, 4]
//         int item = queue.remove();
//         System.out.println(queue);      // [2, 3, 4]
//         queue.offer(2809);
//         item = queue.remove();
//         System.out.println(queue);      // [3, 4, 2809]
//         item = queue.remove();
//         System.out.println(queue);      // [4, 2809]
//         item = queue.remove();
//         System.out.println(queue);      // [2809]
//         System.out.println(queue.peek());
//     }
// }
// 
// 
//          D E Q U E
// 
// Линейная коллекция, которая поддерживает вставку и удаление
// элементов на обоих концах.
//
// import java.util.*;

// public class lesson4 {
//     public static void main(String[] args) {
//         Deque<Integer> deque = new ArrayDeque<>();
//         deque.addFirst(1); deque.addLast(2);
//         System.out.println(deque);              // [1, 2]
//         deque.removeLast(); 
//         System.out.println(deque);              // [1]
//         deque.removeLast();
//         System.out.println(deque);              // []
//         deque.offerFirst(3); deque.offerLast(4);
//         System.out.println(deque);              // [3, 4]
//         deque.pollFirst(); deque.pollLast();
//         System.out.println(deque);              // []
//         deque.offerFirst(5); deque.offerLast(6);            
//         deque.getFirst(); deque.getLast();      
//         deque.peekFirst(); deque.peekLast();
//         System.out.println(deque.getFirst());   // 5
//         System.out.println(deque.peekFirst());  // 5
//     }
// }
//          S T A C K   (LIFO)
//
// Stack представляет собой обработку данных по принципу LIFO.
// Расширяет Vector пятью операциями, которые позволяют рассматривать
// вектор как стек.
//
// import java.util.*;

// public class lesson4 {
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(1);
//         stack.push(12);
//         stack.push(123);
//         System.out.println(stack.pop()); // 123
//         System.out.println(stack.pop()); // 12
//         System.out.println(stack.pop()); // 1
//     }
// }
//
// import java.util.Stack;

// public class lesson4 {

//     private static boolean isDigit(String s) throws NumberFormatException {
//         try {
//             Integer.parseInt(s);
//             return true;
//         } catch (NumberFormatException e) {
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         // (1+2*3*4)*(10/5) - 20
//         // 1 2 3 * 4 * + 10 5 / * 20 -
        
//         //var exp = "20 30 - 10 *".split(" "); // (20-30)*10
//         var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3
        
//         //var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
//         int res = 0;
//         System.out.println(exp);
        
//         Stack<Integer> st = new Stack<>();
//         for (int i = 0; i < exp.length; i++) {

//             if (isDigit(exp[i])) {
//                 st.push(Integer.parseInt(exp[i]));
//             } else {
//                 switch (exp[i]) {
//                     case "+":
//                         res = st.pop() + st.pop();
//                         st.push(res);
//                         break;
//                     case "-":
//                         res = -st.pop() + st.pop();
//                         st.push(res);
//                         break;
//                     case "*":
//                         res = st.pop() * st.pop();
//                         st.push(res);
//                         break;
//                     case "/":
//                         res =  st.pop()/ st.pop();
//                         st.push(res);
//                         break;
//                     default:
//                         break;
//                 }
//             }
//         }
//         System.out.printf("%d\n", st.pop());
//     }
// }


