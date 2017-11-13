public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza aPizza = null;

        if (type == "Chicago") {
            aPizza = new ChicagoPizza();
        } else if (type == "New York") {
            aPizza = new NewYorkPizza();
        }

        return aPizza;

    }
}
