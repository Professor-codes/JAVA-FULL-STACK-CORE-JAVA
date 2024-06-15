package oops;

public class ThisUsingMethod {
    // CLASS LEVEL VARIABLES
    int a = 5;
    int b = 10;

    // METHOD LEVEL VARIABLES
    public void add(int a, int b) {
        // take method level variables
        // 10 + 50
        int res1 = a + b;
        System.out.println(res1 + " (method level)");

        // take class level variables
        // 5 + 10
        int res2 = this.a + this.b;
        System.out.println(res2 + " (class level)");
    }

    public static void main(String[] args) {

        new ThisUsingMethod().add(10, 50);

    }

}
