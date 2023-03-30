package model;

import java.io.FileWriter;
import java.io.IOException;

public class Recording implements Rec{
    String filePath = "notebook.txt";

    @Override
    public boolean recording(String sb) {
        try{
            FileWriter fw = new FileWriter(filePath, true );
            fw.write(sb + "\n");
            fw.close();
            return true;
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    
}
