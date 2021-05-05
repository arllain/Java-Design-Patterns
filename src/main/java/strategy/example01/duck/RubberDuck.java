package strategy.example01.duck;

import strategy.example01.behavior.fly.FlyNoWay;
import strategy.example01.behavior.quack.Quack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("looks like a rubberduck");
    }
}
