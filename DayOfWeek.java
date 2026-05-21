import java.util.Scanner;

public class DayOfWeek{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter day from 1-7");
		int day = scan.nextInt();
		
		

		switch(day){
			case 1:
				System.out.println("The day you entered is Sunday");
			break;
			case 2:
				System.out.println("The day you entered is Monday");
			break;
			case 3:
				System.out.println("The day you entered is Tuesday");
			break;
			case 4:
				System.out.println("The day you entered is Wednesday");
			break;
			case 5:
				System.out.println("The day you entered is Thursday");
			break;
			case 6:
				System.out.println("The day you entered is Friday");
			break;
			case 7:
				System.out.println("The day you entered is Saturday");
			break;
			default:
				System.out.print("Invalid day");
			break;
		}


		
		
		
	}
}