package Behavioural.Strategy;

import java.io.File;

public class FileAuth implements AuthStrategy{
    File file;

    public FileAuth(File file) {
        this.file = file;
    }

    @Override
    public boolean checkLogin(String name, String password) {
        System.out.println("Проверка началась");
        return checkFromFile();
    }

    private boolean checkFromFile() {
        if (file != null) {
            return true;
        }
        return false;
    }
}
