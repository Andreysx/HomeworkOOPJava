package view.commands;

import view.ConsoleUI;

import java.io.IOException;

public class SortByFirstName implements Command{

    private ConsoleUI consoleUI;
    public SortByFirstName(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }

    @Override
    public String getDescription() {
        return "Сортировка по имени";
    }

    @Override
    public void execute() throws IOException, ClassNotFoundException {
        consoleUI.sortByFirstName();
    }
}
