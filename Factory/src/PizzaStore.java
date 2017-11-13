public abstract class PizzaStore {
    public void orderPizza(String type) {
        Pizza aPizza = createPizza(type);

        aPizza.prepare();
        aPizza.baked();
        aPizza.cooked();
        aPizza.packaged();
        aPizza.delivered();

    }

    public abstract Pizza createPizza(String type);
}


class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type == "cheese") {
            pizza = new NYStyleCheesePizza();
        }

        return pizza;
    }
}

class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type == "cheese") {
            pizza = new ChicagoStyleCheesePizza();
        }

        return pizza;
    }
}
