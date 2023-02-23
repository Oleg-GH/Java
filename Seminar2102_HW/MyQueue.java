package Seminar2102_HW;

import java.util.LinkedList;

// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class MyQueue {
    LinkedList<Integer> myLinkedList = new LinkedList<>();

    void enqueue(int item){
        myLinkedList.addLast(item);        
    }

    Integer dequeue(){
        if (myLinkedList.size() > 0){
            return myLinkedList.pollFirst();
        } 
        return null;
    }    

    Integer first() {
        if (myLinkedList.size() > 0) {
            return myLinkedList.peekFirst();
        }
        return null;
    }    
}
