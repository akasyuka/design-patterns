package Creational.Builder;

public class Start {
    public static void main(String[] args) {
        Person person = new PersonBuilderImpl().setName("Стефа").setWeight(13.0F).build();
        person.print();
    }


}
