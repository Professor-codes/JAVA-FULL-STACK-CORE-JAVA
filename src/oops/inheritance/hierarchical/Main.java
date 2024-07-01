package oops.inheritance.hierarchical;

public class Main {
    public static void main(String[] args) {

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
        System.out.println("Cat::meow()");
        cat.meow();
    }
}
