import java.util.ArrayList;

public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    void prepare () {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... ");
        System.out.println("Adding sauce...");

        for (String topping: toppings) {
            System.out.println("Adding " + topping);
        }
    }

    void baked () {
        System.out.println("Baking");
    }

    void cooked () {
        System.out.println("Cooking");
    }

    void packaged () {
        System.out.println("Packaging");
    }

    void delivered() {
        System.out.println("Delivering");
    }
}

class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza () {
        name = "New York Style cheese Pizza";
        dough = "New York Dough";
        sauce = "New York Sauce";

        toppings.add("Grated regianno cheese");
    }
}

class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza () {
        name = "Chicago Style cheese Pizza";
        dough = "Chicago Dough";
        sauce = "Chicago Sauce";

        toppings.add("Grated regianno chicago cheese");
    }
}

