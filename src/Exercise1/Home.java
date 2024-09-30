package Exercise1;

public class Home {
    Human[] homeOwners;
    Integer income;

    public Home(Human human) {
        this.homeOwners = new Human[]{};
        this.add(human);
    }

    public void add(Human human) {
        Human[] newHomeOwners = new Human[this.homeOwners.length + 1];
        for (int i = 0; i < this.homeOwners.length; i++) {
            newHomeOwners[i] = this.homeOwners[i];
        }
        newHomeOwners[this.homeOwners.length] = human;
        this.homeOwners = newHomeOwners;
    }
}
