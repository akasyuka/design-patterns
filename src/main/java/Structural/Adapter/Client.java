package Structural.Adapter;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        PrintAdapter printAdapter = new PrintAdapter();
        printAdapter.print(List.of("Привет","мир"));
    }
}
