package fundamentals;

public class TypeCasting {
    public static void main(String[] args) {

        // IMPLICIT TYPE CASTING
        int num1 = 10;
        double num2 = num1;
        System.out.println(num1 + " (int)");
        System.out.println(num2 + " (double)");

        // EXPLICIT TYPE CASTING
        double num3 = 20;
        int num4 = (int) num3;
        System.out.println(num3 + " (double)");
        System.out.println(num4 + " (int)");
    }
}
