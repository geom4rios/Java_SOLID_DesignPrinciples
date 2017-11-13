public class Coffee {

    void prepareRecipe() {
        boilWater();
        brewCoffeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void boilWater() {
        System.out.println("Coffee water is boiled");
    }

    private void brewCoffeGrinds() {
        System.out.println("Brewed Coffee Grinds!");
    }

    private void pourInCup() {
        System.out.println("Pour coffe water in cup");
    }

    private void addSugarAndMilk() {
        System.out.println("Added sugar and milk into the coffee");
    }
}
