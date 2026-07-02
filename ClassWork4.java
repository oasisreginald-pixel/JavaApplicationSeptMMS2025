import java.util.Set;
import java.util.HashSet;

public class ClassWork4{
	public static void main(String[] args){
		Set<String> userEmails = new HashSet<>();
		
		userEmails.add("fingerlord@gmail.com");
		userEmails.add("fingerlord5k@gmail.com");
		userEmails.add("fingerlord@gmail.com");
		userEmails.add("fingerlord@yahoo.com");
		userEmails.add("fingerdaddy@gmail.com");
		userEmails.add("lordoffingers@gmail.com");
		userEmails.add("fingerlord5@gmail.com");
		userEmails.add("fingerd@gmail.com");
		userEmails.add("fingerlord@gmail.com");
		userEmails.add("fingerlord5f@gmail.com");
		
		
		for(String userEmail : userEmails){
			System.out.println(userEmail);
		}
	}
}