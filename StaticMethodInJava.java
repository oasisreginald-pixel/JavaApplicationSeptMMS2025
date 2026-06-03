public class StaticMethodInJava{
	// Mthod Here
	public static void main(String[] args){
		
		int sum = add(70,50,80);
		
		System.out.printf("The sum of all the numbers is %d%n", sum);
		
		sum = add(90,40,30);
		System.out.printf("The sum of all the numbers is %d%n", sum);
		
		details(30,"Kate Henry");
		
		details(17,"Diogo_Jota");
		
		details(21,"Finger Lord");
		
	}
	public static int add(int num1, int num2, int num3){
		
		int sum = num1 + num2 + num3;
		return sum;
	}
	
	public static void details(int age, String name){
		System.out.printf("Your name is %s%n", name);
		System.out.printf("You're %d years old %n", age);
		
	}
}