package view;

import java.util.ArrayList;
import java.util.List;

import view.commands.ChangeLine;
import view.commands.Command;
import view.commands.CreateRecord;
import view.commands.Finish;
import view.commands.ReadFile;
import view.commands.RemoveLine;

public class Menu {
    private List<Command> commands;
    //private Console console;

    public Menu(Console console){
        commands = new ArrayList<>();
        commands.add(new CreateRecord(console));
        commands.add(new ReadFile(console));
        commands.add(new RemoveLine(console));
        commands.add(new ChangeLine(console));
        commands.add(new Finish(console));
    }

    public String print(){
        System.out.println("\nВыберите пункт меню из указанных ниже: ");
        String menu = "";
        for (int index = 0; index < commands.size(); index++) {
            menu += (index + 1) + ". " + commands.get(index).description() + "\n";
        }
        return menu;
    }

    public void execute(int index) {
        commands.get(index - 1).execute();
    }
}
