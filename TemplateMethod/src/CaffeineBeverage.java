public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
          addContiments();
        }
    }

    private void boilWater() {
        System.out.println("Water is boiled");
    }

    abstract void brew();

    private void pourInCup() {
        System.out.println("Pour in cup");
    }

    abstract void addContiments();

    boolean customerWantsCondiments() {
        return true;
    }

}
