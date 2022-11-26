package FifthAttempt;

import FirstAttempt.Animal;
import FirstAttempt.CheckSwim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Egor", 168, 65));
        personList.add(new Person("Gleb", 190, 80));
        personList.add(new Person("Sofia", 160, 54));

        Collections.sort(personList);
        printGrowth(personList, x -> x.getGrowth()); //<- нигде не используется интерфейс, в след. раз зафикси, // а также почини рост у людей
    }
    private static void printGrowth (List<Person> personList, CheckGrowth check){

        System.out.println("List persons");
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
