public class Main {
    public static void main(String[] args) {
        PanckakeHouse panckakeHouse = new PanckakeHouse();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(panckakeHouse, dinerMenu);

        waitress.printMenu();
    }
}
