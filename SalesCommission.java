import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double totalSales = 0;
		
        boolean valid = false;

        System.out.println("=== Sales Commission Calculator ===");
        System.out.println("Enter item values one at a time (0 to finish):");

        
        while (valid == false) {

            System.out.print("Item value: $");
            double item = input.nextDouble();

            
            if (item == 0) {
                valid = true; 
            } else {
                
                totalSales += item;
            }

        } 

        double earnings = 200 + (0.09 * totalSales);
        System.out.printf("%nTotal Sales: $%.2f%n", totalSales);
        System.out.printf("Weekly Earnings: $%.2f%n", earnings);

        input.close();

    } 
} 