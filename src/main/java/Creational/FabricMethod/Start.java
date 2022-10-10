package Creational.FabricMethod;

public class Start {
    public static void main(String[] args) {
        CarSelector carSelector = new CarSelector();
        Car car = carSelector.getCat(RoadType.GAZON);
        car.drive();
    }
}
