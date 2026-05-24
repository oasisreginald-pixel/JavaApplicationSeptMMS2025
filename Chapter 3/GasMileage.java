import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalMiles = 0;
        double totalGallons = 0;
        int miles, gallons;
		
		System.out.println("");
		System.out.println("=============");

        System.out.println("Gas Mileage Calculator");
        System.out.println("Enter miles driven:");

        while (true) {
            System.out.print("Miles driven: ");
            miles = input.nextInt();
            if (miles == -1) break;

            System.out.print("Gallons used: ");
            gallons = input.nextInt();

            double mpg = (double) miles / gallons;
            totalMiles += miles;
            totalGallons += gallons;

            System.out.printf("Miles per gallon this trip: %.2f%n", mpg);
            System.out.printf("Combined MPG so far: %.2f%n%n", totalMiles / totalGallons);
        }

        System.out.println("Program ended.");
        input.close();
    }
}