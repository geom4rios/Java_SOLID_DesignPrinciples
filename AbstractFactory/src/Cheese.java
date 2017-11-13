public class Cheese {
    public void getCheese() {
        System.out.println("Simple Cheese");
    }
}

class NYCheese extends Cheese {
    @Override
    public void getCheese() {
        System.out.println("Simple New York Cheese");
    }
}

class ChicagoCheese extends Cheese {
    @Override
    public void getCheese() {
        System.out.println("Simple Chicago Cheese");
    }
}

