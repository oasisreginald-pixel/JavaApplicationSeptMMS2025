import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice = 0;
		
        boolean valid = false;

        System.out.println("=== Input Validator ===");

        
        while (valid == false) {

            System.out.print("Enter 1 or 2: ");
            choice = input.nextInt();

            if (choice == 1 || choice == 2) {
                System.out.println("Valid input! You entered: " + choice);
                valid = true; 
            } else {
                
                System.out.println("Invalid input. Please enter only 1 or 2.");
            }

        } 

        input.close();

    } 
} 