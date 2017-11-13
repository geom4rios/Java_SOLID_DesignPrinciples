public interface PizzaIngredient {
    public Cheese createCheese();
    public Sauce createSauce();
}

class ChicagoPizzaIngredientFactory implements PizzaIngredient {

    @Override
    public Cheese createCheese() {
        Cheese chicagoCheese = new ChicagoCheese();
        return chicagoCheese;
    }

    @Override
    public Sauce createSauce() {
        Sauce chicagoSauce = new ChicagoSauce();
        return chicagoSauce;
    }

}

class NYPizzaIngredientFactory implements PizzaIngredient {

    @Override
    public Cheese createCheese() {
        Cheese NewYorkCheese = new NYCheese();
        return NewYorkCheese;
    }

    @Override
    public Sauce createSauce() {
        Sauce NewYorkSauce = new NYSauce();
        return NewYorkSauce;
    }

}
