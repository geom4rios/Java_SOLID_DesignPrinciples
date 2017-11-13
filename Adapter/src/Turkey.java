public interface Turkey {
    public void gobble();
    public void fly();
}

class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Wild Turkey is gobbling!");
    }

    public void fly() {
        System.out.println("Wild Turkey is flying");
    }
}
