// 2. Реализуйте очередь с помощью LinkedList со следующими методами: 
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package Seminar2102_HW;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.enqueue(10);
        myQueue.enqueue(15);
        myQueue.enqueue(20);
        myQueue.enqueue(25);  // создадим очередь, добавим несколько элементов в конец очереди

        //System.out.println(myQueue);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.first());

                
    }
}

