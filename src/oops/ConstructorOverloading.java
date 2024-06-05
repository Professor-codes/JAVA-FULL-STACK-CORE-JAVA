package oops;

public class ConstructorOverloading {

    // CONSTRUCTOR
    public ConstructorOverloading() {
        System.out.println("non parameterized constructor.");
    }

    // CONSTRUCTOR
    public ConstructorOverloading(int id, String name, String email, String password) {
        System.out.println("parameterized constructor.");
    }

    // MAIN METHOD
    public static void main(String[] args) {

        // this object calls non parameterized constructor
        ConstructorOverloading obj1 = new ConstructorOverloading();

        // this object calls parameterized constructor
        ConstructorOverloading obj2 = new ConstructorOverloading(1, "Max", "max@gmail.com", "$n4de8145alc");

    }
}
