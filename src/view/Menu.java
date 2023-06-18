package view;

import view.commands.*;
import view.ConsoleUI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Command> commandList;

    public Menu(ConsoleUI consoleUI) {
        commandList = new ArrayList<>();
        commandList.add(new GetHumanList(consoleUI));
        commandList.add(new AddHuman(consoleUI));
        commandList.add(new SortByFirstName(consoleUI));
        commandList.add(new SortByLastName(consoleUI));
    }

    public String printMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commandList.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(commandList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(int choice) throws IOException, ClassNotFoundException {
        Command command = commandList.get(choice - 1);
        command.execute();
    }

    public int size() {
        return commandList.size();
    }
}