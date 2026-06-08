import java.util.Scanner;

public class MethodOverloading{
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("===========Calculate Permiter of Shape=========");
		System.out.println("Enetr 1. for Square");
		System.out.println("Enetr 2. for Rectangle");
		System.out.println("Enetr 3. for Triangle");
		System.out.println("Enetr 4. Exit program");
		System.out.println("==========================================%n");
		
		System.out.print("Enter your choice:");
		int choice = scan.nextInt();
		
		switch(choice){
			case 1:
			       System.out.print("Enter the length of the square");
				   int lenOfSquare = scan.nextInt();
				   
				   perimeter(lenOfSquare);
				   
			break;

			case 2:
			       System.out.print("Enter the length of the rectangle:");
				   int lenOfRect = scan.nextInt();
				   
				   
				   System.out.print("Enter the width of the rectangle:");
				   int widthOfRect = scan.nextInt();
				   
				   
				   perimeter(lenOfRect,widthOfRect);
				   
			break;
			
			case 3:
			       System.out.print("Enter sideA:");
				   int sideA = scan.nextInt();
				   
				   
				   System.out.print("Enter sideB:");
				   int sideB = scan.nextInt();
				   
				   System.out.print("Enter sideC:");
				   int sideC = scan.nextInt();
				   
				   perimeter(sideA,sideB,sideC);
				   
				   
			break;
			default:
			            System.out.println("Program Exited, Good BYE..........❌");
		}
	}
	
	
	public static void perimeter(int lenOfSquare){
		int perimeterOfSquare = 4 * lenOfSquare;
		
		
		System.out.printf("The perimeterof the square is %d%n",perimeterOfSquare);
	}
	
	
	public static void perimeter(int lenOfRect, int widthOfRect){
		int perimeterOfRect = 2 * (lenOfRect + widthOfRect);
		
		
		System.out.printf("The perimeterof the square is %d%n",perimeterOfRect);
	}
	
	
	public static void perimeter(int sideA, int sideB, int sideC){
		int perimeterOfTriangle = sideA + sideB + sideC;
		
		
		System.out.printf("The perimeterof the square is %d%n",perimeterOfTriangle);
	}
}