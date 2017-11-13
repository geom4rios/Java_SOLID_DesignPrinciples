public abstract class PizzaStore {

    public abstract Pizza createPizza(String type);

    public void prepare() {
        System.out.println("Pizza prepared");
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

class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredient factory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("New York Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(factory);
            pizza.setName("New York Clam Pizza");
        }
        return pizza;
    }
}

class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredient factory = new ChicagoPizzaIngredientFactory();

        if(item.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("Chicago Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(factory);
            pizza.setName("Chicago Clam Pizza");
        }
        return pizza;
    }
}
