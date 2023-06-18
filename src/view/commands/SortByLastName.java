package view.commands;

import view.ConsoleUI;

import java.io.IOException;

public class SortByLastName implements Command{
    private ConsoleUI consoleUI;
    public SortByLastName(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }


    @Override
    public String getDescription() {
        return "Сортировка по фамилии";
    }

    @Override
    public void execute() throws IOException, ClassNotFoundException {
        consoleUI.sortByLastName();
    }
}
