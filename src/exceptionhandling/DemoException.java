// package exceptionhandling;

class DemoException {

    public static void main(String[] args) {

        System.out.println("Start...");

        try {
            int number_1 = Integer.parseInt(args[0]);
            int number_2 = Integer.parseInt(args[1]);

            System.out.printf("Input : %d / %d \n", number_1, number_2);
            int result = number_1 / number_2;

            System.out.println("Result : " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException >");
            System.out.println("Numbers can not be zero");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException >");
            System.out.println("Numbers must be an integer");
        } catch (Exception e) {
            System.out.println("Exception >");
            System.out.println(e);
        } finally {
            // always gets executed
        }

        System.out.println("Terminate...");


    }
}