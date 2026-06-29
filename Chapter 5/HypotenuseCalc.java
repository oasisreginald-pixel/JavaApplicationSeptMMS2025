import java.util.Scanner;

public class HypotenuseCalc {
	static double hypotenuse(double side1, double side2) {
		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter side1: ");
		double s1 = input.nextDouble();
		System.out.print("Enter side2: ");
		double s2 = input.nextDouble();

		System.out.printf("Hypotenuse: %.2f%n", hypotenuse(s1, s2));
		input.close();
	}
}