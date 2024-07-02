package oops;

class Animal {
    public void eat() {
        System.out.println("Animal::eat() -> This animal eats.");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        // SUPER - TO CALL PARENT CLASS eat() METHOD
        super.eat();
        System.out.println("Dog::eat() -> This animal eats.");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
