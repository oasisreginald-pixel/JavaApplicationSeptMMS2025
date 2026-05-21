import java.util.Scanner;

public class Information{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
		
		System.out.print("Enter your age:");
		byte age = input.nextByte();
		input.nextLine();
		
		System.out.print("Enter your address:");
		String address = input.nextLine();
		
		System.out.printf("");
		System.out.printf("Information about %s%n name",name);
		System.out.printf("=====================%n");
		
		
		System.out.printf("Hello %s, You are %d years old and You live at %s",name,age,address);
	}
}