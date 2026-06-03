public class DemoInstanceMethod{
	
	public int add(int num1, int num2, int num3){
		
		int sum = num1 + num2 + num3;
		return sum;
	}
	
	public void details(int age, String name){
		System.out.printf("%nYour name is %s%n", name);
		System.out.printf("You're %d years old", age);
		
	}
}