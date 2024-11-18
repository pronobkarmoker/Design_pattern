package BSSE1431_Lab06.Builder;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Sandwich> sandwiches = new ArrayList<>();

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void showMenu() {
        System.out.println("Menu:");
        for (Sandwich sandwich : sandwiches) {
            System.out.println(sandwich);
        }
    }
}
