package tree;

import tree.famtree.FamilyTreeItem;
import tree.famtree.FamilyTree;
import tree.human.Human;

public class Service {

    private FamilyTree<Human> familyTree;


    public Service() {

        familyTree = new FamilyTree<>();
    }

//    public String printHumanList() {
//        StringBuilder sb = new StringBuilder();
//        for (Human human : familyTree) {
//            for (FamilyTreeItem human : familyTree) {
//                sb.append(human.getInfo());
//                sb.append("\n");
//            }
//            return sb.toString();
//        }

    public void sortByFirstName() {
        familyTree.sortByFirstName();
    }

    public void sortByLastName() {
        familyTree.sortByLastName();
    }

//    public void addHuman(Human human) {
//        familyTree.addHuman(human);
//    }

}
