package FirstAttempt;

import static java.lang.Integer.parseInt;

public class Animal implements Comparable{
    private final String species;
    private boolean canFastRun;
    private final boolean canSwim;
    private final int maxSpeed;
    String pars;

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
        return species+" and his speed: "+maxSpeed+" km/h";
    }

    public String getSpecies() {
        return species;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int compareTo(Object o) {
        Animal a = (Animal) o;
        return this.maxSpeed - a.maxSpeed;
    }
}
