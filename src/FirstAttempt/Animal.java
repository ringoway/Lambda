package FirstAttempt;

public class Animal {
    private String species;
    private boolean canFastRun;
    private boolean canSwim;
    int maxSpeed;

    public Animal(String species, int maxSpeed, boolean canSwim){
        this.species = species;
        this.maxSpeed = maxSpeed;
        this.canSwim = canSwim;
    }

    public boolean canSwim() {
        return canSwim;
    }
    public boolean canFastRun() {
        return maxSpeed > 40;
    }
    public String toString() {
        return species;
    }
}
