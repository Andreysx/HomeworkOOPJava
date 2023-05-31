package tree;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human one  = new Human("Андрей","Ромашин", null,null, 45);
        Human two  = new Human("Валерия","Ромашина", null,null, 40);
        Human three  = new Human("Дмитрий","Ромашин", one,two, 20);
        Human four  = new Human("Шухраджон","Рафитович", null,null, 38);
        Human five  = new Human("Зухра","Рафитовна", null,null, 45);
        Human six  = new Human("Святополк","Рафитович", four,five, 18);
        Human seven  = new Human("Медвия","Ромашина", one,two, 16);


        FamilyTree famTree = new FamilyTree();
        famTree.addHumans(one);
        famTree.addHumans(two);
        famTree.addHumans(three);
        famTree.addHumans(four);
        famTree.addHumans(five);
        famTree.addHumans(six);
        famTree.addHumans(seven);

        System.out.println("******************************************");
        System.out.println("Семейное дерево");
        System.out.println(famTree.getHumanList());


        String name = "Дмитрий";
        System.out.println("******************************************");
        System.out.println("Поиск по имени");
        Human tofindhuman = famTree.toFindHumanByName(name);
        System.out.println(name);
        System.out.println(tofindhuman);

        System.out.println("******************************************");
        System.out.println("Ищем родителей");
        List<Human> parents = famTree.getParents(three);
        System.out.println(three);
        System.out.println(parents);

        System.out.println("********************************************");
        System.out.println("Ищем детей");
        List<Human> childrens = famTree.getChildrens(one);
        System.out.println(one);
        System.out.println(childrens);
    }
}
