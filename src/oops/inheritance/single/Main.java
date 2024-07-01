package oops.inheritance.single;

public class Main {
    public static void main(String[] args) {

        // OBJECT ANIMAL
        Animal animal = new Animal();

        System.out.println("Animal::eat()");
        animal.eat();

        // OBJECT DOG
        Dog dog = new Dog();

        System.out.println("Animal::eat()");
        dog.eat();
        System.out.println("Dog::bark()");
        dog.bark();
    }
}
