

import java.io.IOException;

import model.Model;
import presenter.Presenter;
import view.View;

public class Program {
    public static void main(String[] args) throws IOException {
        View view = new View();
        Model model = new Model();
        Presenter presenter = new Presenter(view, model);

        view.start();
    }
    
}