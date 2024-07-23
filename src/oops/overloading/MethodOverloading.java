package oops;

public class MethodOverloading {

    // METHOD FOR CHAR
    // first method
    public void print(int i) {
        System.out.println("Integer : " + i);
    }

    // METHOD FOR CHAR
    // second method overload woth Integer i
    public void print(int i, char ch) {
        System.out.println("Integer : " + i);
        System.out.println("Character : " + ch);
    }

    // METHOD FOR STRING
    // third method overload with Integer i and char ch
    public void print(int i, char ch, String str) {
        System.out.println("Integer : " + i);
        System.out.println("Character : " + ch);
        System.out.println("String : " + str);
    }

    public static void main(String[] args) {
        int i = 10;
        char ch = 'z';
        String str = "simple text";

        // OBJECT
        MethodOverloading obj = new MethodOverloading();
        obj.print(i);
        obj.print(i, ch);
        obj.print(i, ch, str);

    }
}
