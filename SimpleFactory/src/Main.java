public class Main {
    public static void main (String[] args) {
        SimplePizzaFactory myFactory = new SimplePizzaFactory();

        PizzaStore myStore = new PizzaStore(myFactory);

        myStore.orderPizza("Chicago");
        myStore.orderPizza("New York");
    }
}
