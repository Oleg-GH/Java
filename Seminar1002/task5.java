package Seminar1002;
// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.


public class task5 {
    public static void main(String[] args) {
        String my_str = "Добро пожаловать на курс по Java";
        String[] arr = my_str.split(" ");
        String temp = "";
        for(int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - i - 1] = temp;
        }
        my_str = String.join(" ", arr);
        System.out.println(my_str);
    }
}

// public class seminar01 {
//     public static void main(String[] args) {
//         String my_str = "Добро пожаловать на курс по Java";
//         String[] arr = my_str.split(" ");
//         String temp = "";
//         for (int i = 0; i < arr.length/2; i++) {
//             temp = arr[i];
//             arr[i] = arr[arr.length - 1];
//             arr[arr.length - 1 - i] = temp;
//         }
//         my_str = String.join(" ", arr);
//         System.out.println(my_str); 
//      }
//  }