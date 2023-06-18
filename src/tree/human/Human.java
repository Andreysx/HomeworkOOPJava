package tree.human;

import tree.famtree.FamilyTreeItem;

import java.io.Serializable;

public class Human implements Serializable, Comparable<Human>, FamilyTreeItem {
    private String firstname;
    private String lastname;
    private String age;
    private Human father;
    private Human mother;
    private Gender gender;
//    private List<Human> children;
//    Gender gender;

    public Human(String firstname, String lastname, Human father, Human mother, String age, Gender gender) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.father = father;
        this.mother = mother;

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }


    public String getAge() {
        return age;
    }

    public String getHumanInfo() {
        String humanInfo = toString();
        return humanInfo;
    }

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(getHumanInfo());
        return sb.toString();
    }

    @Override
    public int compareTo(Human o) {
        return 0;
    }

    @Override
    public String toString() {
        if (mother != null && father != null) {
            return firstname + " " + lastname +" "+ age + " лет" + " (мать: " + mother + ", отец: " + father + ")";
        } else if (mother != null && father == null) {
            return firstname + " " + lastname + " " + age + " " + "лет" + " (мать: " + mother + ")";
        } else if (mother == null && father != null) {
            return firstname + " " + lastname + " " + age + " " + " лет" + " (отец: " + father + ")";
        } else {
            return firstname + " " + lastname + " " + age;
        }
    }
}

