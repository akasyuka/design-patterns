package Behavioural.Strategy;

public class DbAuth implements AuthStrategy{

    String path;

    public DbAuth(String path) {
        this.path = path;
    }

    @Override
    public boolean checkLogin(String name, String password) {
        System.out.println("Начался запрос в бд для авторизации");
        return checkFromDB();
    }

    private boolean checkFromDB() {
        System.out.println("Запрос...");
        return true;
    }
}
