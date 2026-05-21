import java.util.Scanner;

public class Calof5Numbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter num1:");
		double num1 = input.nextDouble();
		
		System.out.println("Enter num2:");
		double num2 = input.nextDouble();
		
		System.out.println("Enter num3:");
		double num3 = input.nextDouble();
		
		System.out.println("Enter num4:");
		double num4 = input.nextDouble();
		
		System.out.println("Enter num5:");
		double num5 = input.nextDouble();
		
		double addition = num1 + num2 + num3 + num4 + num5;
		double avgerage = addition/5;
		double product = num1*num2*num3*num4*num5;
		
		
		System.out.printf("The sum of all numbers is %.2f%n",addition);
		System.out.printf("The sum of all numbers is %.2f%n",product);
		System.out.printf("The sum of all numbers is %.2f%n",avgerage);
		
	}
}