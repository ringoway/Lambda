package FifthAttempt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Egor", 168, 65));
        personList.add(new Person("Gleb", 190, 80));

        Collections.sort(personList);
        personList.forEach(Person::showGrowth);
    }
}
