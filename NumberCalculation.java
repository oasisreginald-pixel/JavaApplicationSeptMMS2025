import java.util.Scanner;

public class NumberCalculation{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[10];
		
        System.out.printf("Enter 10 numbers:%n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Number %d: ", (i + 1));
            numbers[i] = scan.nextInt();
        }

        int sumA = numbers[0] + numbers[4] + numbers[9];

        int sumB = numbers[2] + numbers[7] + numbers[1];

        int sumC = numbers[3] + numbers[6] + numbers[5] + numbers[8];

        int result = (sumA * sumB) - sumC;

        System.out.println("");
		System.out.println("================");
		
		
        System.out.printf("Calculation Breakdown %n");
        System.out.printf("Sum A (1st + 5th + 10th): %d%n", sumA);
        System.out.printf("Sum B (3rd + 8th + 2nd):  %d%n", sumB);
        System.out.printf("Sum C (4th + 7th + 6th + 9th): %d%n", sumC);
        System.out.printf("Result = (SumA x SumB) - SumC = (%d x %d) - %d = %d%n", sumA, sumB, sumC, result);

        
        if (result >= 100) {
            System.out.printf("%nResult is >= 100: %d%n", result);
        } else {
            System.out.printf("%nResult is less than 100. Not displayed.%n");
        }

        scan.close();
	}
}