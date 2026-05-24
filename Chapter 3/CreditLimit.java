import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Credit Limit Calculator ===");
        System.out.println("Enter -1 as the account number to quit.");
        System.out.println();

        
        System.out.print("Enter account number: ");
        int account = input.nextInt();

   
        while (account != -1) {

            System.out.print("Beginning balance: ");
            int balance = input.nextInt();

            System.out.print("Total charges this month: ");
            int charges = input.nextInt();

            System.out.print("Total credits this month: ");
            int credits = input.nextInt();

            System.out.print("Credit limit: ");
            int limit = input.nextInt();

           
            int newBalance = balance + charges - credits;

            
            System.out.println();
            System.out.println("-------- Account Summary --------");
            System.out.println("Account Number : " + account);
            System.out.println("New Balance    : $" + newBalance);
            System.out.println("Credit Limit   : $" + limit);

            
            if (newBalance > limit) {
                System.out.println("Status: *** Credit limit exceeded! ***");
            } else {
                System.out.println("Status: OK - Within credit limit");
            }

            System.out.println("==============");
            System.out.println();

            
            System.out.print("Enter account number: ");
            account = input.nextInt();

        } 

        
        System.out.println("Program ended.");
        input.close();

    } 
} 