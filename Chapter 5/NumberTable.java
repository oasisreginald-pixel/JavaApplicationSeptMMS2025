public class NumberTable {
	public static void main(String[] args) {
		System.out.printf("%-10s %-20s %-10s %-10s%n", "Decimal", "Binary", "Octal", "Hex");
		System.out.println("=".repeat(55));
		for (int i = 1; i <= 256; i++) {
			System.out.printf("%-10d %-20s %-10s %-10s%n",
				i,
				Integer.toBinaryString(i),
				Integer.toOctalString(i),
				Integer.toHexString(i).toUpperCase());
		}
	}
}