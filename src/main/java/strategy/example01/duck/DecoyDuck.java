package strategy.example01.duck;

import strategy.example01.behavior.fly.FlyNoWay;
import strategy.example01.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("looks like a decoyduck");
    }
}
