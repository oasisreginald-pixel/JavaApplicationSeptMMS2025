// write a java program to collect all the even numbers from the array 
public class ClassWork {

    public static void getEvens(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                System.out.printf("%d%n", numbers[i]);
        }
        
    }

    public static void main(String[] args) {

        int[] arr = {7, 8, 4, 3, 2, 9, 0, 1, 6, 8};

        System.out.println("Even numbers: ");
		System.out.println("====================");
        getEvens(arr);
    }
}