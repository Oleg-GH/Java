package view.commands;

import view.Console;

public class ChangeLine implements Command{
    private Console console;

    public ChangeLine(Console console){
        this.console = console;
    }

    @Override
    public void execute(){
        console.changeLine();
    }
    
    public String description(){
        return "Изменить строку по номеру";
    }
}
