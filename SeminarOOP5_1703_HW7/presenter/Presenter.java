package presenter;

import model.Model;
import ui.View;

public class Presenter {

    private Model model;
    private View view;

    public Presenter(Model model, View view) {
        this.view = view;
        this.model = model;
        view.setPresenter(this);
        model.setPresenter(this);
    }

    public void showAllNotes(){
        String answer = model.showAllNotes();
        view.showOutput(answer);
    }

    public void addNote() {
        System.out.println("\nВведите текст заметки:");
        String sentence = view.readInput();
        //view.readInput();
        model.addNote(sentence);
    }

}
