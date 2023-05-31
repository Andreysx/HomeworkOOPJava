package tree;
import java.util.List;
import java.util.ArrayList;
public class FamilyTree {

    private List<Human> humanlist;


    public FamilyTree(){

        humanlist = new ArrayList<>();
    }

    public void addHumans(Human human){
        boolean flag = false;
        for (Human addHuman : humanlist){
            if(human.getFirstname().equals(addHuman.getFirstname())){
                if(human.getLastname().equals(addHuman.getLastname())){
                    if(human.getAge() != addHuman.getAge()){
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
            if (human.getAge() == age){
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

    public List<Human> getChildrens(Human parent){
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


}
