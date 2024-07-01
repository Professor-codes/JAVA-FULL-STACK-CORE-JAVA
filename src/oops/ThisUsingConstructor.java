package oops;

public class ThisUsingConstructor {

    int number1;
    int number2;

    public ThisUsingConstructor(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public static void main(String[] args) {

        ThisUsingConstructor obj = new ThisUsingConstructor(100, 300);

        System.out.println(obj.number1);
        System.out.println(obj.number2);
    }
}
