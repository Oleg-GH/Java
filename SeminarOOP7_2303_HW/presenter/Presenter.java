package presenter;

import model.Model;
import view.IView;

public class Presenter {
    private IView view;
    private Model model;

    public Presenter(IView view, Model model){
        this.view = view;
        this.model = model;
        view.setPresenter(this);
        model.setPresenter(this);
    }
    
    public boolean createRecord(String text){
        return model.recording(text);
    }

    public String readFile() {
        try{
            StringBuilder str = model.read();
            return str.toString();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return "Чтение файла не удалось.";
    }

    public boolean removeNote(String filePath, int indexToRemove) {
        try{
            return model.removeLine(filePath, indexToRemove);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean changeLine(String filePath, int indexToChange, String newLine) {
        try{
            return model.changeLine(filePath, indexToChange, newLine);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }   

    public void finish(){
        model.finish();
    }

}
