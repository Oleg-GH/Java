// 3. Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".

package Seminar1002;

public class task3 {
    public static void main(String[] args){
        String[] arr = new String[]{"abc", "abcde", "abcdefg", "acvbderury", "dftryurtyabcurtrtryu"};
        String long_arr = "";
        String pref_x = "abc";
        for (int i = 0; i < arr.length; i++){
            if (arr[i].contains(pref_x)){
                if (long_arr.length() < arr[i].length()){
                    long_arr = arr[i];
                }
            }
        }
        System.out.println("Самая длинная строка с 'abc' - " + long_arr);
    }
}
