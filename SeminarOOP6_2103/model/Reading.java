package model;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reading implements Read{
    String filePath = "notebook.txt";

    @Override
    public StringBuilder read() throws IOException {
        StringBuilder sb = new StringBuilder();
        FileReader fr = new FileReader(filePath);
        Scanner scan = new Scanner(fr);
        
        while (scan.hasNextLine()){
            sb.append(scan.nextLine() +"\n");
        }
        
        fr.close();        
        return sb;
    }
    
}
