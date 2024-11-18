package BSSE1431_Lab06.Builder;

public class Main {
    public static void main(String[] args) {

        Sandwich chickenSandwich = new Sandwich.Builder()
                .setBread("Regular Bread")
                .setFilling("Grilled Chicken")
                .setSpread("Cheese")
                .build();

        Sandwich eggSandwich = new Sandwich.Builder()
                .setBread("Toasted Bread")
                .setFilling("Fried Egg")
                .setSpread("Sauce")
                .build();

        Menu menu = new Menu();
        menu.addSandwich(chickenSandwich);
        menu.addSandwich(eggSandwich);

        menu.showMenu();
    }
}
