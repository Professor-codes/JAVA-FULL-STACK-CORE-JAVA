package fundamentals;

public class Controlflow {
    public static void main(String[] args) {

        // BREAK
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // Exit the loop when i = 5
                break;
            }
            System.out.println(i);
        }

        // CONTINUE
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // Skip the rest of the loop when i = 5
                // System.out.println("skip (5)");
                continue;
            }
            System.out.println(i);
        }

    }
}
