package strategy.example02;

public class SpecialVehicle extends Vehicle{

    public SpecialVehicle() {
        transportMedium = new AirTransport();
    }

    @Override
    public void showMe() {
        System.out.println("I am a special vehicle who can transport both in air and water.");
    }
}
