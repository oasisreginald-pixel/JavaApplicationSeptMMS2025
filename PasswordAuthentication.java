import java.util.Random;

public class PasswordAuthentication{
	public static void main(String[] args){
		Random random = new Random();
		
		String allChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+<>?";

        String password = "";

        for (int i = 0; i < 15; i++) {
            password += allChars.charAt(random.nextInt(allChars.length()));
        }

        System.out.printf("Generated Password: %s%n", password);
		
	}
}