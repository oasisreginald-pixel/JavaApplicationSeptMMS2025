public class WorldPopulation {
    public static void main(String[] args) {
        double population = 8_100_000_000.0; 
        double growthRate = 0.009;            
        double doubleTarget = population * 2;
        int doubleYear = -1;

        System.out.printf("%-10s%-25s%-25s%n", "Year", "Population", "Annual Increase");
        System.out.println("-".repeat(60));

        for (int year = 1; year <= 75; year++) {
            double increase = population * growthRate;
            population += increase;

            System.out.printf("%-10d%-25.0f%-25.0f%n", year, population, increase);

            if (doubleYear == -1 && population >= doubleTarget)
                doubleYear = year;
        }

        System.out.println("\nPopulation doubles in year: " + doubleYear);
    }
}