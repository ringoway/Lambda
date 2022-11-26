package FirstAttempt;
public class Animal implements Comparable<Animal>{
    private final String species;
    private boolean canFastRun;
    private final boolean canSwim;
    private final int maxSpeed;

    public Animal(String species, int maxSpeed, boolean canSwim){
        this.species = species;
        this.maxSpeed = maxSpeed;
        this.canSwim = canSwim;
    }

    public boolean canSwim() {
        return canSwim;
    }
    public boolean canFastRun() {
        int x = 10; //значение минимальной скорости животного
        return maxSpeed > x;
    }
    public String toString() {
        return species+" and his speed: "+maxSpeed+" km/h";
    }
    public String toString1() {
        return species+", can swim: "+canSwim;
    }
    public int compareTo(Animal a) {
        return this.maxSpeed - a.maxSpeed;
    }
}
