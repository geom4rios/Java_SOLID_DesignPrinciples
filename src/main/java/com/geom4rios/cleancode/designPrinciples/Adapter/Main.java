import com.geom4rios.cleancode.designPrinciples.Adapter.duck.Duck;
import com.geom4rios.cleancode.designPrinciples.Adapter.duck.MallardDuck;
import com.geom4rios.cleancode.designPrinciples.Adapter.turkey.Turkey;
import com.geom4rios.cleancode.designPrinciples.Adapter.turkey.TurkeyAdapter;
import com.geom4rios.cleancode.designPrinciples.Adapter.turkey.WildTurkey;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("Thd duck says");
        testDuck(mallardDuck);

        System.out.println("Thd turkey adapter says");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
