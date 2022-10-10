package Creational.FabricMethod;

public class Geep implements Car{
    @Override
    public void drive() {
        System.out.println("Джип поехал");
    }

    @Override
    public void stop() {
        System.out.println("Джип остановился");
    }
}
