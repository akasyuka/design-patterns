package Structural.Facade;

public class Client {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.run();
    }
}
