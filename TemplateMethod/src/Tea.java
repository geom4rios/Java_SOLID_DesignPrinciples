public class Tea {

    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void boilWater() {
        System.out.println("Coffee water is boiled");
    }

    private void steepTeaBag() {
        System.out.println("Tea bags steeped!");
    }

    private void pourInCup() {
        System.out.println("Pour coffe water in cup");
    }

    private void addLemon() {
        System.out.println("Added Lemon to tea");
    }
}
