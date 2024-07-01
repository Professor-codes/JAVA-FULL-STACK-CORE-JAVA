package oops.inheritance.multilevel;

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

        // OBJECT PUPPY
        Puppy puppy = new Puppy();

        System.out.println("Animal::eat()");
        puppy.eat();
        System.out.println("Dog::bark()");
        puppy.bark();
        System.out.println("Puppy::play()");
        puppy.play();

    }
}
