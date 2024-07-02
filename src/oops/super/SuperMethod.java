package oops;

class X {
    public X() {
        System.out.println("X::constructorX()");
    }

    public X(int x) {
        System.out.println("X::constructorX() -> " + x);
    }
}

class Y extends X {
    public Y() {
        System.out.println("Y::constructorY()");
    }

    public Y(int y) {
        // use super to call parameterized of X
        super(100);
        System.out.println("Y::constructorY() -> " + y);
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        // to call default constructor
        // Y y = new Y();

        // to call parameterized constructor
        Y y = new Y(200);
    }
}
