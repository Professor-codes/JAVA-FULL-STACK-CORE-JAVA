package oops.abstraction;

public class AbstractClassDemoMain {
    public static void main(String[] args) {

        // this will throw an error
        // AbstractClassDemo obj = new AbstractClassDemo();

        AbstractClassChild obj = new AbstractClassChild();
        obj.completeMethod();
        obj.abstractMethod();
    }
}
