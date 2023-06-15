package tree.famtree;

import tree.human.Human;

public interface FamilyTreeItem {
    String getFirstname();

    String getLastname();

    Human getFather();

    Human getMother();
    Integer getAge();

    String getInfo();




}
