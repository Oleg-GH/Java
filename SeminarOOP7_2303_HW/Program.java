

import java.io.IOException;

import model.Model;
import presenter.Presenter;
import view.Console;
import view.IView;

public class Program {
    public static void main(String[] args) throws IOException {
        IView view = new Console();
        Model model = new Model();
        Presenter presenter = new Presenter(view, model);

        view.start();
    }
    
}