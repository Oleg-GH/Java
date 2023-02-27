// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) -       истина      Пример 2: [a+(1*3) -        ложь
// Пример 3: [6+(3*3)] -     истина      Пример 4: {a}[+]{(d*3)} -   истина
// Пример 5: <{a}+{(d*3)}> - истина      Пример 6: {a+]}{(d*3)} -    ложь

package Seminar_2402;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {

        System.out.println(isCorrect("a+(d*3)"));
    } 

    static boolean isCorrect(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('<', '>');
        map.put('{', '}');
        
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(chars[i]);
            }
            if (chars[i] == ')') {                              // 
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


// Map<Character, Character> map = new HashMap<>();
//         map.put('(', ')');
//         map.put('[', ']');
//         map.put('<', '>');
//         map.put('{', '}');
//         char[] chars = s.toCharArray();
//         Stack<Character> stack = new Stack<>();   // LinkedList<Character> stack = new HashMap<>();
//         for (int i = 0; i < chars.length; i++) {
//             if (map.containsKey(chars[i])){
//                 stack.push(chars[i]);
//             }
//             if (map.containsValue(chars[i])){
//                 if (stack.isEmpty() || chars[i] != map.get(stack.pop())){
//                     return false;
//                 }
//             }
//         }
//         return stack.isEmpty();