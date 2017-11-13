public abstract class Pizza {
    public void prepare() {
        System.out.println("Pizza Prepared");
    }

    public void packaged() {
        System.out.println("Pizza packaged");
    }

    public void baked() {
        System.out.println("Pizza baked");
    }

    public void delivered () {
        System.out.println("Pizza Delivered");
    }
}

class NewYorkPizza extends Pizza {
    @Override
    public void baked() {
        System.out.println("New York Pizza Baked");
    }
}

class ChicagoPizza extends Pizza {
    @Override
    public void baked() {
        System.out.println("Chicago Pizza Baked");
    }
}