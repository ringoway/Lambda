package ThirdAttempt;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<House> houseList = new TreeSet<>();
        houseList.add(new House(40, 2500000, "Moscow", true));
        houseList.add(new House(25, 1500000, "Ufa", false));
        houseList.add(new House(110, 6500000, "Yekaterinburg", true));
        houseList.add(new House(67, 3400000, "Novgorod", true));
        for (House h: houseList) {
            System.out.println(h);
        }
    }
}
