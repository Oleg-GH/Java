package ui;

import java.util.Scanner;
import presenter.Presenter;

public class ConsoleView implements View {
    private Presenter presenter;
    private Scanner scanner;

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    public ConsoleView() {
        scanner = new Scanner(System.in);
    }

    public String readInput() {
        return scanner.nextLine();
    }

    public void showOutput(String output) {
        System.out.println(output);
    }
    
    public void start() {
      
        while (true) {
            
            showOutput("\nВыберите действие:\n1. Добавить заметку\n2. Показать все заметки\n3. Выход");
            String choice = readInput();

            switch (choice) {
                case "1":
                    //String text = readInput();
                    presenter.addNote();
                    break;
                case "2":
                    presenter.showAllNotes();
                    break;
                case "3":
                    System.out.println("Работа блокнота завершена.");
                    System.exit(0);
                    break;
                default:
                    showOutput("Недопустимый выбор.");
            }
        }

    }

}
