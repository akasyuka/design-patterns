package FabricMethod;

public class Lada implements Car{
    @Override
    public void drive() {
        System.out.println("Лада поехала");
    }

    @Override
    public void stop() {
        System.out.println("Лада остановилась");
    }
}
