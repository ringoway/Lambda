package FifthAttempt;

import java.util.Random;

public class Person implements Comparable<Person>{
    private String name;
    private int height;
    private double weight;
    private int id;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.id = new Random().nextInt(1000);
    }

    @Override
    public int compareTo(Person person) {
        return this.height - person.height;
    }
    public String toString(){
        return name + " his height: "+height+" cm"+" and his weight: "+ weight+" kg";
    }
    public Integer getId() {
        return id;
    }

    public boolean checkGrowth() {
        int x = 162;
        return height > x;
    }
}
