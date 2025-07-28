import java.util.Scanner;

public class RecursiveProduct {

    // Recursive method to calculate product
    public static int getProduct(int[] numbers, int index) {
        // Base case
        if (index == numbers.length - 1) {
            return numbers[index];
        }
        // Recursive case
        return numbers[index] * getProduct(numbers, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int product = getProduct(numbers, 0);
        System.out.println("The product of the five numbers is: " + product);

        scanner.close();
    }
}
