import java.util.Scanner;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {

        // Find sum of digits of a number

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int total = 0, digits;

        while (number > 0) {
            digits = number % 10;
            number /= 10;
            total += digits;
            System.out.print(digits + "+");

        }
        System.out.println("\b = " + total);
    }
}