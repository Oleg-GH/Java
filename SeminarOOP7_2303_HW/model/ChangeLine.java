package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ChangeLine {
    public boolean changeLine(String filePath, int indexToChange, String newLine) throws IOException {
        List<String> lines = new ArrayList<>();
        boolean fulfilled = false;
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
        }
        
        if (indexToChange <= lines.size()) {
            lines.set(indexToChange - 1, newLine); // чтобы номер строки совпал с индексом
            fulfilled = true;
        }
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for(String line : lines) {
                bw.write(line);
                bw.newLine();
            }
            bw.close();
        }
        
        return fulfilled;
    } 
}
