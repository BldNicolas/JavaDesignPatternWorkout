package Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Human {
    String name;
    Integer age;
    String job;
    List<FamilyRelationship> familyRelationShips;

    public Human(String name, Integer age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.familyRelationShips = new ArrayList<>();
    }

    public void dad(Human child) {
        this.familyRelationShips.add(new FamilyRelationship(child, "Dad"));
        child.familyRelationShips.add(new FamilyRelationship(this, "Child"));
    }

    public void mom(Human child) {
        this.familyRelationShips.add(new FamilyRelationship(child, "Mom"));
        child.familyRelationShips.add(new FamilyRelationship(this, "Child"));
    }

    public void sibling(Human sibling) {
        this.familyRelationShips.add(new FamilyRelationship(sibling, "Sibling"));
        sibling.familyRelationShips.add(new FamilyRelationship(this, "Sibling"));
    }
}
