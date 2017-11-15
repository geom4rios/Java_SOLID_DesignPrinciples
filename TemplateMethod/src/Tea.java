public class Tea extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Tea bags steeped!");
    }

    @Override
    public void addContiments() {
        System.out.println("Added Lemon to tea");
    }
}
