package model;

import java.io.IOException;

import presenter.Presenter;
import view.commands.Finish;

public class Model {
    private Presenter presenter;
    private Recording recording;
    private Reading reading;
    private RemoveLine removeLine;
    private ChangeLine changeLine;
    private Finish finish;

    public Model(){
        recording = new Recording();
        reading = new Reading();
        removeLine = new RemoveLine();
        changeLine = new ChangeLine();
        finish = new Finish(null);
    }

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    public boolean recording(String sb) {
       return recording.recording(sb);
    }

    public StringBuilder read() throws IOException{
        return reading.read();
    }

    public boolean removeLine(String filePath, int indexToRemove) throws IOException {       
        return removeLine.removeLine(filePath, indexToRemove);
    }

    public boolean changeLine(String filePath, int indexToChange, String newLine) throws IOException {
        return changeLine.changeLine(filePath, indexToChange, newLine);
    }

    public boolean finish(){
        return false;
    }

}