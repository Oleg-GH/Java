package view.commands;

import view.Console;

public class RemoveLine implements Command{
    private Console console;

    public RemoveLine(Console console){
        this.console = console;
    }

    @Override
    public void execute(){
        console.removeLine();
    }
    
    public String description(){
        return "Удалить строку по номеру";
    }
}
