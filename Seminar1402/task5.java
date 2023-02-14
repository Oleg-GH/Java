// Напишите метод, который вернет содержимое текущей папки в виде массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим методом, в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
// оно должно записаться в лог-файл.

package Seminar1402;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class task5 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task5.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);

        String startDir = System.getProperty("user.dir");
        String[] data = getDirArr(startDir);
        writeToFile(data);        
    }

    public static String[] getDirArr(String dirPath) {
        try {
            File dir = new File(dirPath);
            return dir.list();
        } catch (Exception e) {
            System.out.println("Исключение при получении пути.");
            return new String[0];
        }
    }
    public static void writeToFile(String[] data) {
        String result = String.join(", ", data);
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file2.txt");
            File file = new File(pathFile);

            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(result);
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            System.err.println("Исключени при записи файла");
            e.printStackTrace();
        }
    }
}

