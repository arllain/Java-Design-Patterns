package strategy.example01;

import strategy.example01.behavior.fly.FlyRocketPowered;
import strategy.example01.duck.*;

public class StrategyPatternExample {
    public static void main(String[] args) {
        System.out.println("*** Strategy Pattern ***");
        System.out.println("-------------------------");

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        System.out.println("-------------------------");

        Duck readHeadDuck = new ReadHeadDuck();
        readHeadDuck.display();
        readHeadDuck.performQuack();
        readHeadDuck.performFly();
        System.out.println("-------------------------");


        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        System.out.println("-------------------------");

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performQuack();
        decoyDuck.performFly();
        System.out.println("-------------------------");

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
