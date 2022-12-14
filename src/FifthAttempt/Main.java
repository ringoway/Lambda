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
        personList.add(new Person("Kirill", 180,31));
        personList.add(new Person("Anna", 149, 78));
        personList.add(new Person("Kirill", 205,120));

        Collections.sort(personList);

        printGrowth(personList, Person::checkGrowth);
    }
    private static void printGrowth (List<Person> personList, CheckGrowth check){

        System.out.println(" Sort people by height: ");
        for (Person person : personList) {
            if (check.checkGrowth(person)) {
                System.out.println(person);
            }
        }
        System.out.println(" Sort ended ");
    }
}
