package view.commands;

import view.ConsoleUI;

import java.io.IOException;

public class WriteSomething implements Command {

    private ConsoleUI consoleUI;

    public WriteSomething(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }

    @Override
    public String getDescription() {
        return "Запись в текстовый файл";
    }

    @Override
    public void execute() throws IOException, ClassNotFoundException {
        consoleUI.writeSomething();
    }
}
