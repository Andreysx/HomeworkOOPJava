package tree;

import tree.famtree.FamilyTreeItem;
import tree.famtree.FamilyTree;
import tree.filehandler.FileHandler;
import tree.human.Human;
import tree.filehandler.Write;
import view.commands.GetHumanList;

public class Service {


    private FamilyTree<Human> familyTree;


    public Service() {

        familyTree = new FamilyTree<>();
    }

    public void addHuman(Human human) {
        familyTree.addHuman(human);
    }

    public void sortByFirstName() {
        familyTree.sortByFirstName();
    }

    public void sortByLastName() {
        familyTree.sortByLastName();
    }

    public String getHumanList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (FamilyTreeItem human: familyTree) {
            stringBuilder.append(human.getInfo());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public String printHumanList() {
        StringBuilder sb = new StringBuilder();
        for (FamilyTreeItem human : familyTree) {
            sb.append(human.getInfo());
        }
        return sb.toString();
    }
    public void writeSomething(){
        String path = "src\\tree.txt";
        Write write = new FileHandler();
        String family = getHumanList();
        write.writeSomething(family,path);


    }

}
