package oops.methodoverride;

class A{
    // OVERRIDDEN METHOD
    public void print(){
        System.out.println("A::print() -> This is first method.");
    }
}

class B extends A{
    // OVERRIDE METHOD
    @Override
    public void print(){
        System.out.println("B::print() -> This is second method.");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}
