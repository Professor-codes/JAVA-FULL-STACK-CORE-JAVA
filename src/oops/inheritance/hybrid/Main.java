package oops.inheritance.hybrid;

import java.sql.SQLOutput;

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

        // OBJECT CAT
        Cat cat = new Cat();

        System.out.println("Animal::eat()");
        cat.eat();
        System.out.println("Dog::bark()");
        cat.bark();
        System.out.println("Cat::drink()");
        cat.drink();
    }
}
