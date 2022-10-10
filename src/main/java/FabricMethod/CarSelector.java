package FabricMethod;

/**
 * Фабрика по созданию автомобилей,
 * Можно применить синглтон паттерн, так как фабрика одна для всех
 */
public class CarSelector {

    /**
     * Фабричный метод
     */
    public Car getCat(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
            case GAZON:
                car = new Lada();
                break;
        }
        return car;

    }
}
