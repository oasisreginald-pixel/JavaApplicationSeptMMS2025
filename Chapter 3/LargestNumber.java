import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number;
        int largest = Integer.MIN_VALUE;

        System.out.println("=== Find the Largest of 10 Integers ===");

        while (counter <= 10) {
            System.out.printf("Enter integer %d: ", counter);
            number = input.nextInt();
            if (number > largest)
                largest = number;
            counter++;
        }

        System.out.println("Largest number: " + largest);
        input.close();
    }
}