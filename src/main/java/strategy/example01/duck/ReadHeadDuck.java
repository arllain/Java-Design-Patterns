package strategy.example01.duck;

import strategy.example01.behavior.fly.FlyWithWings;
import strategy.example01.behavior.quack.Quack;

public class ReadHeadDuck extends Duck {

    public ReadHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("looks like a redhead");
    }
}
