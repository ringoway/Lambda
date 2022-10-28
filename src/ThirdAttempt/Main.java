package ThirdAttempt;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> houseList = new ArrayList<>();
        houseList.add(new House(25, 1500000, "Moscow", true));
        System.out.println(houseList);
    }
}
