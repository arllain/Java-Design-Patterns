package strategy.example02;

import strategy.example01.behavior.fly.FlyRocketPowered;
import strategy.example01.duck.*;

public class StrategyPatternExample {
    public static void main(String[] args) {
        System.out.println("*** Strategy Pattern ***");

        Vehicle vehicleContext = new Boat();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();
        System.out.println("-------------------------");

        vehicleContext = new Aeroplane();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();
        System.out.println("-------------------------");

        vehicleContext = new SpecialVehicle();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();
        System.out.println("-------------------------");
        vehicleContext.setTransportMedium(new WaterTransport());
        vehicleContext.showTransportMedium();
    }
}
