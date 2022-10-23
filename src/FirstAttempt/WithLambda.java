package FirstAttempt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WithLambda {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Dog", 20, true));
        animals.add(new Animal("Leopard", 58, true));
        animals.add(new Animal("Panther", 88, true));
        animals.add(new Animal("Horse", 87, true));
        animals.add(new Animal("Turtle", 5, true));
        animals.add(new Animal("Monkey", 15, false));
        animals.add(new Animal("Cheetah", 130, true));

        Collections.sort(animals);
        print(animals, x -> x.canFastRun());
        // print(animals, Animal :: canFastRun); // - лучше это использовать
        // print (Animal x) -> {return x.canFastRun();}

        // print(animals, () -> true);
        // print(animals, x -> x.canSwim());
        // print(animals, (Animal x) -> x.canSwim);
        // print(animals, (x, y) -> true);
        // print(animals, (Animal x, Animal y) -> true);
    }
    private static void print(List<Animal> animals, CheckTrait checker){

        System.out.println("List of animals whose maximum running speed is more than 10 km/h:");
        for (Animal animal : animals) {
            if (checker.test(animal)){
                System.out.println(animal);
            }
        }
    }
}
