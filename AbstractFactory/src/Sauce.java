public class Sauce {
    public void getSauce() {
        System.out.println("Simple Sauce");
    }
}

class NYSauce extends Sauce {
    @Override
    public void getSauce() {
        System.out.println("Simple New York Sauce");
    }
}


class ChicagoSauce extends Sauce {
    @Override
    public void getSauce() {
        System.out.println("Simple Chicago Sauce");
    }
}
