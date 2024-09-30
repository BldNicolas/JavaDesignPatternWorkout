package Exercise1;

public class FamilyRelationship {
    Human human;
    String relationshipType;
    public FamilyRelationship(Human human, String relationshipType) {
        this.human = human;
        this.relationshipType = relationshipType;
    }

    public static Boolean haveGrandParent(Human human) {
    for (FamilyRelationship familyRelationship : human.familyRelationShips){
        if (familyRelationship.relationshipType.equals("Child")){
            for (FamilyRelationship familyRelationshipParent : familyRelationship.human.familyRelationShips){
                if (familyRelationshipParent.relationshipType.equals("Child")){
                return Boolean.TRUE;
                }
            }
        }
    }
    return Boolean.FALSE;
    }
}
