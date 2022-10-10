package FabricMethod;

public class Porsche implements Car{
    @Override
    public void drive() {
        System.out.println("Порш поехал");
    }

    @Override
    public void stop() {
        System.out.println("Порш остановился");
    }
}
