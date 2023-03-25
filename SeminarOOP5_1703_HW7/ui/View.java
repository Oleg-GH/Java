package ui;

import presenter.Presenter;

public interface View {
    void setPresenter(Presenter presenter);

    void start();

    String readInput();

    void showOutput(String output);

    //void addNote();
}
