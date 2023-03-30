package view;

import presenter.Presenter;

public interface IView {
    
    void start();

    void setPresenter(Presenter presenter);
}
