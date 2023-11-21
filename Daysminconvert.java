package dardenpractice;

public class Daysminconvert {

	public static int convertHoursToMinutes(int hours) {
		// Your task: complete this method

		if (hours < 0) {

			return -1;

		}

		int NoOfminutes = hours * 60;
		return NoOfminutes;
	}

	public static int convertDaysToMinutes(int days) {
		// Your task: complete this method
		if (days < 0) {
			return -1;

		}
		int noOfdays = days * 24 * 60;

		return noOfdays;

	}

}

