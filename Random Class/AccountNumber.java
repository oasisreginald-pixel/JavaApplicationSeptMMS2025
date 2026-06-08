import java.util.Random;

public class AccountNumber{
	public static void main(String[] args){
		Random random = new Random();
		
		int sevenDigits = 1000000 + random.nextInt(9000000);
		
		String accountNumber = "000" + sevenDigits;
		
		System.out.printf("Account Number: %s%n",accountNumber);
	}
}