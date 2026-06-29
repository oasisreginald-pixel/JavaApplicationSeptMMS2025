import java.util.Scanner;

public class CircleArea {
	static double circleArea(double radius) {
		return Math.PI * radius * radius;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		System.out.printf("Area = %.2f%n", circleArea(radius));
		input.close();
	}
}