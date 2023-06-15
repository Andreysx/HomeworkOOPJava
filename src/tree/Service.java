package tree;

import tree.famtree.FamilyTreeItem;
import tree.famtree.FamilyTree;
import tree.human.Human;

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

    public String printHumanList() {
        StringBuilder sb = new StringBuilder();
        for (FamilyTreeItem human : familyTree) {
            sb.append(human.getInfo());
        }
        return sb.toString();
    }

}
