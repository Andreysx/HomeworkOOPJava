package tree.human.comparators;

import tree.human.Human;

import java.util.Comparator;

public class HumanComparatorSortByFirstname implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2){
        return o1.getFirstname().compareTo(o2.getFirstname());
    }
}
