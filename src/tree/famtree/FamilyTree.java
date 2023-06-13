package tree.famtree;
import tree.human.Human;
import tree.human.comparators.HumanComparatorSortByFirstname;
import tree.human.comparators.HumanComparatorSortByLastname;
import tree.iterators.HumanIterator;

import java.io.Serializable;
import java.util.*;

public class FamilyTree implements Serializable, Iterable<Human> {

    private List<Human> humanlist;


    public FamilyTree(){

        humanlist = new ArrayList<>();
    }

    public void addHuman(Human human){
        boolean flag = false;
        for (Human addHuman : humanlist){
            if(human.getFirstname().equals(addHuman.getFirstname())){
                if(human.getLastname().equals(addHuman.getLastname())){
                    if(human.getAge().equals(addHuman.getAge())){
                        flag = true;
                    }
                }
            }
        }
        if (!flag){
            humanlist.add(human);
        }
    }
    public Human toFindHumanByName(String name){
        for(Human human : humanlist){
            if(human.getFirstname().equalsIgnoreCase(name)
                    || (human.getLastname().equalsIgnoreCase(name))){
                    return human;
                }
            }
        return null;
    }

    public Human toFindByAge(Integer age){
        for (Human human : humanlist){
            if (human.getAge().equals(age)){
                return human;
            }
        }
        return null;
    }

    public String getHumanList(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Human human : humanlist) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }


    public List<Human> getParents(Human children){
        List<Human> parents  = new ArrayList<>();
        if (children.getFather() != null){
            parents.add(children.getFather());
        }
        if (children.getMother() != null){
            parents.add(children.getMother());
        }
        return parents;
    }

    public List<Human> getChildren(Human parent){
        List<Human> children = new ArrayList<>();
        for(Human human : humanlist){
            if(human.getMother() == parent && human.getFather() != null){
                children.add(human);
            }
            if(human.getFather() == parent && human.getMother() != null){
                children.add(human);
            }
        }
        return children;
    }
    @Override
    public Iterator<Human> iterator() {
         return new HumanIterator(humanlist);//return new humanlist.iterator()
    }

    public void sortByFirstName(){
        humanlist.sort (new HumanComparatorSortByFirstname());
    }

    public void sortByLastName(){
        humanlist.sort (new HumanComparatorSortByLastname());
    }





}
