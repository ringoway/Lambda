package FirstAttempt;

import java.util.ArrayList;
import java.util.List;

public class WithOutLambda {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("dog", 20, true));
        animals.add(new Animal("leopard", 58, true));
        animals.add(new Animal("panther", 88, true));
        animals.add(new Animal("horse", 89, true));
        animals.add(new Animal("turtle", 5, true));
        animals.add(new Animal("monkey", 15, false));
        animals.add(new Animal("cheetah", 130, true));

        print(animals, new CheckIfFastRun());
    }
    private static void print(List<Animal> animals, CheckTrait checker){
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.println(animal + " ");
        }
        System.out.println(" ");
    }

}

