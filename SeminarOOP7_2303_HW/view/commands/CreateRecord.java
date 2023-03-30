package view.commands;

import view.Console;

public class CreateRecord implements Command{
    private Console console;

    public CreateRecord(Console console){
        this.console = console;
    }

    @Override
    public void execute(){
        console.createRecord();
    }
    
    public String description(){
        return "Добавить новую запись";
    }
    
}
