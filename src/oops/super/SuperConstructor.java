package oops;

// USE OF SUPER KEYWORD TO CALL THE PARENT CLASS CONSTRUCTOR
class First {
    int id;

    // CONSTRUCTOR (parent)
    public First(int id) {
        this.id = id;
    }
}

class Second extends First {
    String name;
    String color;

    // CONSTRUCTOR (child)
    public Second(int id, String name, String color) {
        super(id);
        this.name = name;
        this.color = color;
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        Second second = new Second(1, "xyz", "purple");
        System.out.println("Id : " + second.id);
        System.out.println("Name : " + second.name);
        System.out.println("Color : " + second.color);
    }
}
