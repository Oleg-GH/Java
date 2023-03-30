package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RemoveLine {
    
    public boolean removeLine(String filePath, int indexToRemove) throws IOException {
        List<String> lines = new ArrayList<>();
        boolean done = false;
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = br.readLine()) != null) {
                lines.add(line);
            }
        }

        if (indexToRemove <= lines.size()) {
            lines.remove(indexToRemove - 1); // чтобы номер строки совпал с индексом
            done = true;
        } 

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for(String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } 
        return done;
    }
}
