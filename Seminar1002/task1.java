// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.

package Seminar1002;

public class task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1,0,1,1};
        int max_count = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
                count++;
            }
            else {
                if(count > max_count){
                    max_count = count;
                    count = 0;
                }
            }
        }
    System.out.println("максимальное количество подряд идущих 1 - " + max_count);    
}
}
