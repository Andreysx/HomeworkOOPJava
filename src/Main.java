import tree.Service;
import presenter.Presenter;
import tree.famtree.FamilyTree;
import tree.human.Gender;
import tree.human.Human;
import view.ConsoleUI;
import view.View;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        View view = new ConsoleUI();
        Service service = new Service();

        createTestFamilyTree(service);

        new Presenter(view, service);
        view.run();
    }

    public static void createTestFamilyTree(Service service) {
        Human one  = new Human("Андрей","Ромашин", null,null, "45", Gender.Male);
        Human two  = new Human("Валерия","Ромашина", null,null, "40", Gender.Female);
        Human three  = new Human("Константин","Ромашин", one,two, "20", Gender.Male);
        Human four  = new Human("Джамиль","Альбертович", null,null, "38", Gender.Male);
        Human five  = new Human("Евтия","Альбертовна", null,null, "45", Gender.Female);
        Human six  = new Human("Георгий","Альбертович", four,five, "18", Gender.Male);
        Human seven  = new Human("Просковья","Ромашина", one,two, "16", Gender.Female);

        service.addHuman(one);
        service.addHuman(two);
        service.addHuman(three);
        service.addHuman(four);
        service.addHuman(five);
        service.addHuman(six);
        service.addHuman(seven);
    }
}