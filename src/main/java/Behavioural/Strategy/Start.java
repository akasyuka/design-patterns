package Behavioural.Strategy;

import java.io.File;

public class Start {
    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();
        userChecker.check(new DbAuth("jdbs"));
        userChecker.check(new FileAuth(new File("/.......")));
    }
}
