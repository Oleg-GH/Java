package model;

import java.io.FileWriter;
import java.io.IOException;

public class Recording implements Rec{
    String filePath = "notebook.txt";

    @Override
    public void recording(StringBuilder sb) {
        try{
            FileWriter fw = new FileWriter(filePath, true );
            fw.write(sb + "\n");
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
