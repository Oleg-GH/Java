package model;

import java.io.IOException;

import presenter.Presenter;

public class Model {
    private Presenter presenter;
    private Recording recording;
    private Reading reading;
    private RemoveLine removeLine;
    private ChangeLine changeLine;

    public Model(){
        recording = new Recording();
        reading = new Reading();
        removeLine = new RemoveLine();
        changeLine = new ChangeLine();
    }

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    public void recording(StringBuilder sb) {
       recording.recording(sb);
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

}