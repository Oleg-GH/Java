import model.Model;
import ui.View;
import ui.ConsoleView;
import presenter.Presenter;;

public class Program {
    public static void main(String[] args) {

        View view = new ConsoleView();
        Model model = new Model();
        Presenter presenter = new Presenter(model, view);
        view.start();

    }
}
