package Structural.Facade;

public class CarFacade {
    public void run() {
        Door door = new Door();
        door.open();

        Ignition ignition = new Ignition();
        ignition.ignite();

        Wheel wheel = new Wheel();
        wheel.spin();
    }
}
