package oops.polymorphism;

public class PolymorphismDemoMain {
    public static void main(String[] args) {
        // POLYMORPHISM USING METHOD OVERLOADING
//        PolymorphismUsingMethodOverloading obj = new PolymorphismUsingMethodOverloading();
//        obj.read();
//        obj.read("second");

        // POLYMORPHISM USING METHOD OVERRIDING
        PolymorphismUsingMethodOverriding obj1 = new PolymorphismUsingMethodOverriding();    // OUTPUT : drink water.
        obj1.drink();

        PolymorphismUsingMethodOverriding obj2 = new PolymorphismUsingMethodOverridingChild();    // OUTPUT : drink red bull.
        obj2.drink();
    }
}
