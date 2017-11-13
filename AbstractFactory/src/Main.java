public class Main {
    public static void main(String[] args) {
        ChicagoPizzaStore chStore = new ChicagoPizzaStore();
        NYPizzaStore nyStore = new NYPizzaStore();

        Pizza chCheesePizza = chStore.createPizza("cheese");

        Pizza nyClamPizza = nyStore.createPizza("clam");

    }
}
