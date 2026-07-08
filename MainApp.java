public class MainApp{
	public static void main(String[] args){
		Student student1 = new Student(1, "John","Willy",'M');
		Student student2 = new Student(1, "clinton","Williams",'M');
		Student student3 = new Student(1, "Emily","Willy",'F');
		Student student4 = new Student(1, "Peter","Parker",'M');
		Student student5 = new Student(1, "Gwen","Stacy",'F');
		
		
		
		student1.displayStudentInfo();
		student1.sing();
		System.out.println("====================\n");
		
		student2.displayStudentInfo();
		student2.sleep();
		System.out.println("====================\n");
		
		student3.displayStudentInfo();
		student3.eat();
		System.out.println("====================\n");
		
		student4.displayStudentInfo();
		System.out.println("====================\n");
		
		student5.displayStudentInfo();
		System.out.println("====================\n");
		
	}
}