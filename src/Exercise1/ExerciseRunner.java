package Exercise1;

public class ExerciseRunner {
    public static void main(String[] args) {
//        2 Parents 2 Enfants
        Human jon = new Human("Jon", 45, "Electrician");
        Human karen = new Human("Karen", 46, "Electrician");
        Human mike = new Human("Mike", 16, "Student");
        Human elizabeth = new Human("Elizabeth", 17, "Student");

        jon.dad(mike);
        jon.dad(elizabeth);
        karen.mom(mike);
        karen.mom(elizabeth);
        mike.sibling(elizabeth);

        Home familyTwoParentsTwoChildren = new Home(jon);
        familyTwoParentsTwoChildren.add(karen);
        familyTwoParentsTwoChildren.add(mike);
        familyTwoParentsTwoChildren.add(elizabeth);

//        4 Colocataires
        Human alice = new Human("Alice", 25, "Designer");
        Human bob = new Human("Bob", 26, "Developer");
        Human charlie = new Human("Charlie", 27, "Teacher");
        Human diana = new Human("Diana", 28, "Nurse");

        alice.sibling(bob);
        alice.sibling(charlie);
        alice.sibling(diana);

        Home fourColocataires = new Home(alice);
        fourColocataires.add(bob);
        fourColocataires.add(charlie);
        fourColocataires.add(diana);

//          1 Enfant
        Human sarah = new Human("Sarah", 5, "Child");

        Home oneChild = new Home(sarah);

//        2 parents, 2 enfants, 2 grands-parents
        Human grandpaTom = new Human("Tom", 75, "Retired");
        Human grandmaAnn = new Human("Ann", 72, "Retired");
        Human paul = new Human("Paul", 50, "Engineer");
        Human lisa = new Human("Lisa", 48, "Doctor");
        Human lucas = new Human("Lucas", 12, "Student");
        Human sophia = new Human("Sophia", 10, "Student");

        grandpaTom.dad(paul);
        grandmaAnn.mom(paul);
        paul.dad(lucas);
        paul.dad(sophia);
        lisa.mom(lucas);
        lisa.mom(sophia);
        lucas.sibling(sophia);

        Home twoGrandParentsTwoParentsTwoChildren = new Home(grandpaTom);
        twoGrandParentsTwoParentsTwoChildren.add(grandmaAnn);
        twoGrandParentsTwoParentsTwoChildren.add(paul);
        twoGrandParentsTwoParentsTwoChildren.add(lisa);
        twoGrandParentsTwoParentsTwoChildren.add(lucas);
        twoGrandParentsTwoParentsTwoChildren.add(sophia);

        System.out.println(FamilyRelationship.haveGrandParent(paul));
        System.out.println(FamilyRelationship.haveGrandParent(lucas));
    }
}
