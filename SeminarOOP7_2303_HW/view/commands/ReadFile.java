package view.commands;

import view.Console;

public class ReadFile implements Command{
    private Console console;

    public ReadFile(Console console){
        this.console = console;
    }

    @Override
    public void execute(){
        console.readFile();
    }
    
    public String description(){
        return "Показать все записи блокнота";
    }
    
}


