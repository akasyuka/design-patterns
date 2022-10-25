package Parse;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FromProperties {
    public static void main(String[] args) {
        FileInputStream fis;
        Properties property = new Properties();

        try {
            fis = new FileInputStream("src/main/resources/all.properties");
            property.load(fis);

            System.out.println(property.getProperty("hello"));

        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
    }
}
