public class InstanceMethodInJava{
	// Mthod Here
	public static void main(String[] args){
		InstanceMethodInJava instanceMethod = new InstanceMethodInJava();
		int sum = instanceMethod.add(70,50,80);
		
		System.out.printf("The sum of all the numbers is %d%n", sum);
		
		sum = instanceMethod.add(90,40,30);
		System.out.printf("The sum of all the numbers is %d%n", sum);
		
		instanceMethod.details(30,"Kate Henry");
		
		instanceMethod.details(17,"Diogo_Jota");
		
		instanceMethod.details(21,"Finger Lord");
		
	    sum = instanceMethod.add(60,50,100);
		System.out.printf("%nThe sum of all the numbers is %d%n", sum);
	}
	public int add(int num1, int num2, int num3){
		
		int sum = num1 + num2 + num3;
		return sum;
	}
	
	public void details(int age, String name){
		System.out.printf("%nYour name is %s%n", name);
		System.out.printf("You're %d years old", age);
		
	}
}