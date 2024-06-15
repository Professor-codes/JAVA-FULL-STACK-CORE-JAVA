package oops;

public class MethodOverloading {

    // METHOD FOR CHAR
    public void print(int i) {
        System.out.println("Integer : " + i);
    }

    // METHOD FOR CHAR
    public void print(char ch) {
        System.out.println("Character : " + ch);
    }

    // METHOD FOR STRING
    public void print(String str) {
        System.out.println("String : " + str);
    }

    public static void main(String[] args) {
        int i = 10;
        char ch = 'z';
        String str = "simple text";

        // OBJECT
        MethodOverloading obj = new MethodOverloading();
        obj.print(i);
        obj.print(ch);
        obj.print(str);

    }
}
