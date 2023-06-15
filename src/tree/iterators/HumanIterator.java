package tree.iterators;

import tree.human.Human;

import java.util.Iterator;
import java.util.List;
//import human.Human

public class HumanIterator<T> implements Iterator<T> {
    private int index = 0;
    private List<T> humanlist;

    public HumanIterator(List<T> humanlist) {
        this.humanlist = humanlist;
    }

    @Override
    public boolean hasNext() {
        return index < humanlist.size();
    }

    @Override
    public T next() {
        return humanlist.get(index++);
    }

}
