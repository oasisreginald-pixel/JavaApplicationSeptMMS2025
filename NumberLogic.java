import java.util.Scanner;

public class NumberLogic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3= input.nextInt();
        int sum = num1+ num2+ num3;
        System.out.println("Sum: " + sum);

        
        if (sum % 2 == 0 && sum % 10 == 0) {
            System.out.println("Condition met! Enter three more numbers:");
           
            num1= input.nextInt();
            num2 = input.nextInt();
            num3= input.nextInt();
            
            if ((num1* num2 * num3) > 200) {
                System.out.println("Hurray!!!!!");
            } else {
                System.out.println("Ongoing......");
            }
        } else {
            System.out.println("I must solve this program on my own");
        }
    }
}