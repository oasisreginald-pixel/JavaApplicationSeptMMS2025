import java.util.Scanner;

public class Decrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 4-digit encrypted integer to decrypt: ");
        int number = input.nextInt();

        int d1 = number / 1000;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;

        
        int temp = d1; d1 = d3; d3 = temp;
        temp = d2;    d2 = d4; d4 = temp;

        
        d1 = (d1 + 3) % 10;
        d2 = (d2 + 3) % 10;
        d3 = (d3 + 3) % 10;
        d4 = (d4 + 3) % 10;

        int decrypted = d1 * 1000 + d2 * 100 + d3 * 10 + d4;
        System.out.println("Decrypted number: " + decrypted);
        input.close();
    }
}