package FifthAttempt;

import java.util.Random;

public class Person implements Comparable<Person>{
    private String name;
    private int growth;
    private double weight;
    private int id;

    public Person(String name, int growth, double weight) {
        this.name = name;
        this.growth = growth;
        this.weight = weight;
        this.id = new Random().nextInt(1000);
    }

    @Override
    public int compareTo(Person person) {
        return this.growth - person.growth;
    }
    public String toString(){
        return name + " her growth: "+growth;
    }
    public Integer getId() {
        return id;
    }

    public boolean checkGrowth() {
        int x = 162;
        return growth > x;
    }
}
