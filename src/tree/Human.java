package tree;
import java.util.List;
public class Human {
    private String firstname;
    private String lastname;
    private Integer age;
    private Human father;
    private Human mother;
//    private List<Human> children;
//    Gender gender;

    public Human(String firstname, String lastname, Human father, Human mother, Integer age) {

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


    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        if (mother != null && father != null) {
            return firstname + " " + lastname + age + "лет" + " (мать: " + mother + ", отец: " + father + ")";
        } else if (mother != null && father == null) {
            return firstname + " " + lastname + " " +  age + " " + "лет" + " (мать: " + mother + ")";
        } else if (mother == null && father != null) {
            return firstname + " " + lastname + " " +  age + " " + " лет" + " (отец: " + father + ")";
        } else {
            return firstname + " " + lastname + " " + age;
        }
    }
}
