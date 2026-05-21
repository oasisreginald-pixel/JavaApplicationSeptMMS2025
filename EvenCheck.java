import java.util.Scanner;

public class EvenCheck{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
        int num1 = input.nextInt();
		
		boolean isEven = num1 % 2 == 0;
		
		System.out.printf("is %d an even number: %b",num1,isEven);
		
		
	}
}
	