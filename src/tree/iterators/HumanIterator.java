package tree.iterators;

import tree.human.Human;

import java.util.Iterator;
import java.util.List;
//import human.Human

public class HumanIterator implements Iterator<Human> {
    private int index = 0;
    private List<Human> humanlist;

    public HumanIterator(List<Human> humanlist) {
        this.humanlist = humanlist;
    }

    @Override
    public boolean hasNext() {
        return index < humanlist.size();
    }

    @Override
    public Human next() {
        return humanlist.get(index++);
    }

}
