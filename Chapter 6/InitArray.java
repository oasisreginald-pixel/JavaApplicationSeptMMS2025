public class InitArray {
	public static void main(String[] args) {
		int arraySize = 10; // default size

		if (args.length > 0)
			arraySize = Integer.parseInt(args[0]);

		int[] array = new int[arraySize];

		for (int counter = 0; counter < array.length; counter++)
			array[counter] = counter;

		System.out.printf("%s%8s%n", "Index", "Value");

		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n", counter, array[counter]);
	}
}