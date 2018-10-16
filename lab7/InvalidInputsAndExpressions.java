package lab7;

import java.util.Date;
import java.util.Scanner;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class InvalidInputsAndExpressions {

	public static void main(String[] args) {
		// Project Goals: Write a method that will validate names
		// Names can only have alphabets, start with cap-letter
		// Max length of 30 char.
		// Write a second method to validate email's
		// Must be a combo of alpha-num chars, length 5-30, no special chars
		// Write a third method to validate phone numbers
		// Write a fourth method for date
		// No printout in methods but the main. No loops.

		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter a valid name: ");
		String name = scnr.next();
		if (isValidName(name)) {
			System.out.println("The name is valid");
		} else {
			System.out.println("The name is invalid.");

		}

		System.out.println("Please enter a valid email: ");
		String email = scnr.next();

		if (isValidEmail(email)) {
			System.out.println("The email is valid");
		} else {
			System.out.println("The email is invalid.");

		}

		System.out.println("Please enter a valid phone number: ");
		String phone = scnr.next();
		if (isValidPhone(phone)) {
			System.out.println("The phone is valid");
		} else {
			System.out.println("The phone is invalid.");

		}

		System.out.println("Please enter a valid date (dd/mm/yyyy): ");
		String date = scnr.next();
		if (isValidDate(date)) {
			System.out.println("The date is valid");
		} else {
			System.out.println("The date is invalid.");

		}

	}

	// passing information to methods then using methods in the
	// main to get user to input information.
	private static boolean isValidName(String input) {
		if (input.matches("[A-Z][a-z]{0,30}$")) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isValidEmail(String input) {
		if (input.matches("([a-zA-Z0-9_\\.\\-\\+]{5,30})+\\@(([a-zA-Z0-9\\-]{5,10})+\\.)+([a-zA-Z0-9]{2,4})+$")) {
			System.out.println("The email address is valid. Thank you!");
			return true;
		} else {
			return false;
		}
	}

	private static boolean isValidPhone(String input) {
		// Don't forget to double the backslashes when inputing them into java!
		if (input.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) {
			System.out.println("The phone number is valid. Thank you!");
			return true;
		} else {
			// System.out.println("Phone number is invalid.");
			return false;
		}
	}

	private static boolean isValidDate(String input) {
		boolean isValid = true;

		if (input.matches("^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$")) {

			return isValid;

		} else {

			return false;
		}
	}
}
