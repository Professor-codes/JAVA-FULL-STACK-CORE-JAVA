// PACKAGE
package oops;

// CLASS
public class Users {

    // PROPERTIES
    // DATA MEMBERS
    // INSTANCE VARIABLE
    int userId;
    String userName;
    String userEmail;
    String userAddress;

    // BEHAVIOUR
    // MEMBER METHODS
    // METHODS
    public void userData() {
        System.out.println("userId");
        System.out.println("userName");
        System.out.println("userEmail");
        System.out.println("userAddress");
    }

    // MAIN METHOD
    public static void main(String[] args) {
        // OBJECT

        // Declaration
        Users user;

        // Initialization
        user = new Users();

        // USING THE OBJECT
        // Access the data members
        int id = user.userId;
        String name = user.userName;
        String email = user.userEmail;
        String address = user.userAddress;

        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(address);

        // Access the member methods
        user.userData();

    }
}
