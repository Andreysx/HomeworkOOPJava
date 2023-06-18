package view;

import presenter.Presenter;
import tree.human.Gender;
import tree.human.Human;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleUI implements View {
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private Menu mainMenu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        work = true;
        mainMenu = new Menu(this);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public void run() throws IOException, ClassNotFoundException {
        print("-----Добро пожаловать в генеологическое дерево!-----");
        printMainMenu();
    }

    public void stop() {
        print("Ещё увидимся! Удачи!");
        work = false;
    }

    public String scan() {
        return scanner.nextLine();
    }

    public void printMainMenu() throws IOException, ClassNotFoundException {
        while (work) {
            print(mainMenu.printMenu());
            int choice = inputNumMenu();
            if (choice == -1) {
                print("Ошибка ввода");
                continue;
            }
            mainMenu.execute(choice);
        }
    }

    private int inputNumMenu() {
        String line = scan();
        if (!checkChoiceNumMenu(line)) {
            return -1;
        }
        return Integer.parseInt(line);
    }

    private boolean checkChoiceNumMenu(String line) {
        if (!line.matches("[0-9]+")) {
            return false;
        }
        int choice = Integer.parseInt(line);
        return choice > 0 && choice <= mainMenu.size();
    }

    public void addHuman() {
        print("Укажите имя");
        String firstName = inputName();;
        print("Укажите фамилию");
        String lastName = inputName();

        print("Укажите возраст");
        String age = inputAge();

        print("Укажите имя матери, если есть, или нажмите Enter");
        String firstMomName = inputName();
        print("Укажите фамилию матери, если есть, или нажмите Enter");
        String lastMomName = inputName();
        print("Укажите возраст матери");
        String momAge = inputAge();

        print("Укажите имя и фамилию отца, если есть, или нажмите Enter");
        String firstDadName = inputName();
        print("Укажите имя и фамилию отца, если есть, или нажмите Enter");
        String lastDadName = inputName();
        print("Укажите возраст отца");
        String fatherAge = inputAge();

//        String fatherName = firstDadName + lastDadName;
//        String motherName = firstMomName + lastMomName;

        Human fatherNew = new Human(firstDadName, lastDadName, null,null, fatherAge, Gender.Male);
        Human motherNew = new Human(firstMomName, lastMomName, null,null, momAge, Gender.Female);
        Human newHuman = new Human(firstName, lastName, fatherNew, motherNew, age, Gender.Male);

        presenter.addHuman(newHuman);
    }


    private boolean checkName(String name) {
        return name.matches("^[\\p{L}]+$");
    }

    private String inputName() {
        String name = scan();
        while (!checkName(name)) {
            print("Ошибка ввода имени или фимилии, повторите попытку");
            name = scan();
        }
        return name;
    }

    private String[] getFullName(String name) {
        if (name == null) {
            name = "Неизвестно";
        }
        return name.split(" ");
    }


    public void getHumanList() {
        print("-----Фамильное дерево-----");
        presenter.getHumanList();
    }

    public String inputAge() {
        String age = scan();
        while (age == null) {
            print("Ошибка ввода имени или фимилии, повторите попытку");
            age = scan();
        }
        return age;
    }

    public void sortByFirstName(){
        presenter.sortByFirstName();
    }
    public void sortByLastName(){
        presenter.sortByLastName();
    }
}