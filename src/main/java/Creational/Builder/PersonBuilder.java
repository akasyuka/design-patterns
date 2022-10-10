package Creational.Builder;

public interface PersonBuilder {
    PersonBuilder setName(String name);
    PersonBuilder setAge(int age);
    PersonBuilder setWeight(float weight);
    Person build();
}
