public class HeartRates {
	private String firstName;
	private String lastName;
	private int birthMonth;
	private int birthDay;
	private int birthYear;

	public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.birthYear = birthYear;
	}

	// set and get methods
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getBirthYear() {
		return birthYear;
	}

	// calculates age in years based on current date
	public int getAge(int currentMonth, int currentDay, int currentYear) {
		int age = currentYear - birthYear;

		// if birthday hasn't happened yet this year, subtract one
		if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay))
			age--;

		return age;
	}

	public int getMaximumHeartRate(int currentMonth, int currentDay, int currentYear) {
		return 220 - getAge(currentMonth, currentDay, currentYear);
	}

	public int getTargetHeartRateLow(int currentMonth, int currentDay, int currentYear) {
		return (int)(getMaximumHeartRate(currentMonth, currentDay, currentYear) * 0.50);
	}

	public int getTargetHeartRateHigh(int currentMonth, int currentDay, int currentYear) {
		return (int)(getMaximumHeartRate(currentMonth, currentDay, currentYear) * 0.85);
	}
}