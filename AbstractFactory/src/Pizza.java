import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Cheese cheese;
    Sauce sauce;


    abstract void prepare();

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void cooked() {
        System.out.println("Pizza Cooked");
    }

    public void baked() {
        System.out.println("Pizza Baked");
    }

    public void packaged() {
        System.out.println("Pizza packaged");
    }

    public void delivered() {
        System.out.println("Pizza delivered");
    }
}

class CheesePizza extends Pizza {

    PizzaIngredient ingredientFactory;

    public CheesePizza(PizzaIngredient pizzaIngredientFactory) {
        this.ingredientFactory = pizzaIngredientFactory;
    }
    void prepare () {
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
    }

}

class ClamPizza extends Pizza {
    PizzaIngredient ingredientFactory;

    public ClamPizza(PizzaIngredient pizzaIngredientFactory) {
        this.ingredientFactory = pizzaIngredientFactory;
    }
    void prepare () {
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
    }

}