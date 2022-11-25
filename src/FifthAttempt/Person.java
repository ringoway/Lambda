package FifthAttempt;

public class Person implements Comparable<Person>{
    private String name;
    private int growth;
    private double weight;

    public Person(String name, int growth, double weight) {
        this.name = name;
        this.growth = growth;
        this.weight = weight;
    }
    public void showGrowth(){
        System.out.println(name+growth);
    }

    @Override
    public int compareTo(Person person) {
        return this.growth = person.growth;
    }
    public String toString(){
        return name + " her growth: "+growth;
    }
}
