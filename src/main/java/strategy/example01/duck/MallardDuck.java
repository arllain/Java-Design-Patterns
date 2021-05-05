package strategy.example01.duck;

import strategy.example01.behavior.fly.FlyWithWings;
import strategy.example01.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("looks like a mallard");
    }
}
