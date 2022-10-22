package FirstAttempt;

import java.util.ArrayList;
import java.util.List;

public class WithLambda {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("dog", 20, true));
        animals.add(new Animal("leopard", 58, true));
        animals.add(new Animal("panther", 88, true));
        animals.add(new Animal("horse", 89, true));
        animals.add(new Animal("turtle", 5, true));
        animals.add(new Animal("monkey", 15, false));
        animals.add(new Animal("cheetah", 130, true));

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

        for (Animal animal : animals) {
            if (checker.test(animal)){
                System.out.println(animal + " ");
            }
        }

    }
}
