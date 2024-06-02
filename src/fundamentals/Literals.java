package fundamentals;

public class Literals {
    public static void main(String[] args) {

        // INTEGER LITERALS
        int decimal = 123; // Decimal literal
        int octal = 0173; // Octal literal (starts with 0)
        int hexadecimal = 0x7B; // Hexadecimal literal (starts with 0x)
        int binary = 0b1111011; // Binary literal (starts with 0b)

        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
        System.out.println("Binary: " + binary);

        // FLOATING POINT LITERALS
        double decimalDouble = 123.45; // Double literal
        double scientificDouble = 1.2345e2; // Double literal in scientific notation
        float floatLiteral = 123.45f; // Float literal (suffix with 'f')

        System.out.println("Double (decimal): " + decimalDouble);
        System.out.println("Double (scientific): " + scientificDouble);
        System.out.println("Float: " + floatLiteral);

        // CHARACTER LITERALS
        char character = 'A'; // Character literal
        char unicodeCharacter = '\u0041'; // Unicode character literal

        System.out.println("Character: " + character);
        System.out.println("Unicode Character: " + unicodeCharacter);

        // STRING LITERALS
        String greeting = "Hello, World!";  // String literal

        System.out.println("Greeting: " + greeting);

        // BOOLEAN LITERALS
        boolean trueValue = true; // Boolean literal
        boolean falseValue = false; // Boolean literal

        System.out.println("True: " + trueValue);
        System.out.println("False: " + falseValue);

        // NULL LITERALS
        String nullString = null; // Null literal

        if (nullString == null) {
            System.out.println("The string is null.");
        } else {
            System.out.println("The string is not null.");
        }
    }
}
