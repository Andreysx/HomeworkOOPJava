package tree.human.comparators;

import tree.famtree.FamilyTree;
import tree.famtree.FamilyTreeItem;
import tree.human.Human;

import java.util.Comparator;

public class HumanComparatorSortByFirstname<T extends FamilyTreeItem> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2){
        return o1.getFirstname().compareTo(o2.getFirstname());
    }
}
