package oops.inheritance.single;

public class Animal {
    public void eat() {
        System.out.println("This animal eats.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}