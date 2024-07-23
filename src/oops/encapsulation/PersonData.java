package oops.encapsulation;

public class PersonData {

    // Private variables wrap into class PersonData
    // encapsulation
    private String name;
    private int age;

    // Public constructor to initialize the object
    public PersonData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public method to get the name
    public String getName() {
        return name;
    }

    // Public method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Public method to get the age
    public int getAge() {
        return age;
    }

    // Public method to set the age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Method to display the details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Create an object of the Person class
        PersonData personData = new PersonData("John Doe", 30);

        // Access methods
        personData.setName("Max");
        personData.setAge(25);

        // Display
        personData.display(); // Output: Name: Max, Age: 25
    }
}
