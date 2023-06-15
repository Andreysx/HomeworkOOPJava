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
        Human three  = new Human("Константин","Ромашин", one,two, 20, Gender.Male);
        Human four  = new Human("Джамиль","Альбертович", null,null, 38, Gender.Male);
        Human five  = new Human("Евтия","Альбертовна", null,null, 45, Gender.Female);
        Human six  = new Human("Георгий","Альбертович", four,five, 18, Gender.Male);
        Human seven  = new Human("Просковья","Ромашина", one,two, 16, Gender.Female);

        FamilyTree<Human> famTree = new FamilyTree<>();
        Service service = new Service();
        service.addHuman(one);
        service.addHuman(two);
        service.addHuman(three);
        service.addHuman(four);
        service.addHuman(five);
        service.addHuman(six);
        service.addHuman(seven);




        System.out.println("**");
        System.out.println("Семейное дерево");
        service.sortByFirstName();
        System.out.println(service.printHumanList());
        System.out.println("**");
        service.sortByLastName();
        System.out.println(service.printHumanList());

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





    }


}
