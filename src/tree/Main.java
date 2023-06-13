package tree;

import tree.famtree.FamilyTree;
import tree.human.Gender;
import tree.human.Human;

public class Main {
    public static void main(String[] args) {


//        String path = "src/tree/tree.txt";
//        Write write = new FileHandler();
//        FamilyTree famTree = (FamilyTree) write.loadSomething(path);

        Human one  = new Human("Андрей","Ромашин", null,null, 45, Gender.Male);
        Human two  = new Human("Валерия","Ромашина", null,null, 40, Gender.Female);
        Human three  = new Human("Дмитрий","Ромашин", one,two, 20, Gender.Male);
        Human four  = new Human("Шухраджон","Альбертович", null,null, 38, Gender.Male);
        Human five  = new Human("Зухра","Альбертовна", null,null, 45, Gender.Female);
        Human six  = new Human("Святополк","Альбертович", four,five, 18, Gender.Male);
        Human seven  = new Human("Медвия","Ромашина", one,two, 16, Gender.Female);


        FamilyTree famTree = new FamilyTree();
        famTree.addHuman(one);
        famTree.addHuman(two);
        famTree.addHuman(three);
        famTree.addHuman(four);
        famTree.addHuman(five);
        famTree.addHuman(six);
        famTree.addHuman(seven);

//        System.out.println("******************************************");
//        System.out.println("Семейное дерево");
//        System.out.println(famTree.getHumanList());
//
//
//        String name = "Дмитрий";
//        System.out.println("******************************************");
//        System.out.println("Поиск по имени");
//        Human tofindhuman = famTree.toFindHumanByName(name);
//        System.out.println(name);
//        System.out.println(tofindhuman);
//
//        System.out.println("******************************************");
//        System.out.println("Ищем родителей");
//        List<Human> parents = famTree.getParents(three);
//        System.out.println(three);
//        System.out.println(parents);
//
//        System.out.println("********************************************");
//        System.out.println("Ищем детей");
//        List<Human> childrens = famTree.getChildren(one);
//        System.out.println(one);
//        System.out.println(childrens);

//        write.writeSomething(famTree, path);


        famTree.sortByFirstName();
        System.out.println(famTree.getHumanList());

        famTree.sortByLastName();
        System.out.println(famTree.getHumanList());


    }


}
