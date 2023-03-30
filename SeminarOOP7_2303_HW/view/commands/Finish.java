package view.commands;

import view.Console;

public class Finish implements Command{
    private Console console;
   
    public Finish(Console console){
    this.console = console;
    }

    @Override
    public void execute(){
        console.finish();
    }

    public String description(){
        return "Завершить работу с блокнотом";
    }
   
}
