// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.

package Seminar1402;

public class task2 {
    public static void main(String[] args){
        String compress = compress_str("aaaabbbcdd");
        System.out.println(compress);
    }
    public static String compress_str(String my_str) {
        StringBuilder compress = new StringBuilder();
        char simbol = my_str.charAt(0);
        int count = 1;
        for( int i = 1; i < my_str.length(); i++) {
            if (simbol == my_str.charAt(i)) {
                count++;
            } else {
                compress.append(simbol).append(String.valueOf(count));
                simbol = my_str.charAt(i);
                count = 1;
            }
        }
        compress.append(simbol).append(String.valueOf(count));
        return compress.toString();
    }
}
