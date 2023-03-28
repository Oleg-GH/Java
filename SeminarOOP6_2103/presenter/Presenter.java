package presenter;

import java.io.IOException;

import model.Model;
import view.View;

public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view, Model model){
        this.view = view;
        this.model = model;
        view.setPresenter(this);
        model.setPresenter(this);
    }

    public void writeFile(StringBuilder sb) {
        model.recording(sb);
    }

    public StringBuilder readFile() throws IOException{
        StringBuilder str = model.read();
        return str;
    }

    public boolean removeNote(String filePath, int indexToRemove) throws IOException {
        return model.removeLine(filePath, indexToRemove);
    }

    public boolean changeLine(String filePath, int indexToChange, String newLine) throws IOException {
        return model.changeLine(filePath, indexToChange, newLine);
    }

}