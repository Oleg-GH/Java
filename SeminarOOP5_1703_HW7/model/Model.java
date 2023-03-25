package model;
import java.util.ArrayList;
import presenter.Presenter;

public class Model {
    private Presenter presenter;
    private ArrayList<Record> notes;

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    public Model(){
        notes = new ArrayList<>();
    }

    public void addNote(String sentence) {
        Record note = new Record(sentence);
        notes.add(note);
        System.out.println("Заметка добавлена.\n");
    }

    public String showAllNotes() {
        if (notes.size() == 0) {
            return "Блокнот пуст.";
        } else {
            System.out.println("\nБлокнот заметок:");
            String result = "";
            for (Record note : notes) {
                result += note + "\n";
            }
            return result;
        }
    }
}
