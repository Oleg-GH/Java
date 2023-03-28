package view;

import java.io.IOException;

import presenter.Presenter;

public class View {
    private Presenter presenter;
    private Console console;

    public View(){
        console = new Console();
        console.setView(this);
    }

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    public void start() throws IOException{
        console.scan();
    }

    public void startPresenter(StringBuilder str){
        presenter.writeFile(str);
    }

    public StringBuilder readFile() throws IOException{
        StringBuilder str2 = presenter.readFile();
        return str2;
    }

    public boolean removeLine(String filePath, int indexToRemove) throws IOException{
        return presenter.removeNote(filePath, indexToRemove);
    }

    public boolean changeLine(String filePath, int indexToChange, String newLine) throws IOException{
        return presenter.changeLine(filePath, indexToChange, newLine);
    }

}
