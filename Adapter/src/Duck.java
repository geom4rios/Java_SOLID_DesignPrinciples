public interface Duck {
    public void quack();
    public void fly();
}

class MallardDuck implements Duck {
    public void quack() {
        System.out.println("MallardDuck is quacking");
    }

    public void fly() {
        System.out.println("Mallard Duck is flying");
    }
}
