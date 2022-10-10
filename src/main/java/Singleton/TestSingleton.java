package Singleton;

public class TestSingleton {
    /**
     * Объект однопоточный,
     * Объект создает через метод и переменную,
     * Private конструктор не дает создать экземпляр
     */
    public static TestSingleton instance;

    public static TestSingleton getInstance(){
        if (instance == null) {
            instance = new TestSingleton();
        }
        return instance;
    }

    private TestSingleton() {
    }
    public void print() {
        System.out.println(this);
    }
}
