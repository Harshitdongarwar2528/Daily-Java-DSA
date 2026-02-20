public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        // Declare two double values
        double num1 = 1.123;
        double num2 = 1.124;

        // Compare the two numbers using if-else
        if (num1 < num2) {
            // num2 is greater
            System.out.println("The greatest of the two numbers is " + num2);
        } else {
            // num1 is greater or equal
            System.out.println("The greatest of the two numbers is " + num1);
        }
    }
}
