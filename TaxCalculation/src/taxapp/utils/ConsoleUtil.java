package taxapp.utils;

import java.util.Scanner;

public class ConsoleUtil {

	private static final Scanner scanner = new Scanner(System.in);

	// Print a simple horizontal line
	public static void printLine(char ch, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}

	// Print a formatted header/title centered in a line of specified width
	public static void printCentered(String text, int width) {
		int padding = (width - text.length()) / 2;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < padding; i++)
			sb.append(" ");
		sb.append(text);
		System.out.println(sb.toString());
	}

	// Print formatted table headers or rows with fixed-width columns
	public static void printRow(String[] columns, int[] widths) {
		if (columns.length != widths.length) {
			throw new IllegalArgumentException("Columns and widths length mismatch");
		}
		StringBuilder row = new StringBuilder("|");
		for (int i = 0; i < columns.length; i++) {
			String cell = columns[i];
			row.append(" ");
			if (cell.length() > widths[i]) {
				// truncate if too long
				row.append(cell.substring(0, widths[i] - 3)).append("...");
			} else {
				row.append(cell);
				// pad right
				for (int j = 0; j < widths[i] - cell.length(); j++) {
					row.append(" ");
				}
			}
			row.append(" |");
		}
		System.out.println(row.toString());
	}

	// Read line from console with prompt
	public static String readLine(String prompt) {
		System.out.print(prompt);
		return scanner.nextLine();
	}

	// Pause console and wait for enter key
	public static void waitForEnter(String message) {
		System.out.print(message);
		scanner.nextLine();
	}

	// Print a blank line for spacing
	public static void printBlankLine() {
		System.out.println();
	}

	public static void printLine(int length) {
		for (int i = 0; i < length; i++) {
			System.out.print("=");
		}
		System.out.println();
	}

	public static void printPropertyHeader() {
		printLine(62);
		System.out.printf("%-8s %-15s %-12s %-12s %-8s %-12s%n", "ID", "BUILT-UP AREA", "BASE PRICE", "AGE(YEARS)",
				"IN CITY", "PROPERTY TAX");
		printLine(62);
	}

	public static void printPropertyHeaderWithTax() {
		printLine(66);
		System.out.printf("%-8s %-15s %-12s %-12s %-8s %-12s%n", "ID", "BUILT-UP AREA", "BASE PRICE", "AGE(YEARS)",
				"IN CITY", "PROPERTY TAX");
		printLine(66);
	}

	public static void printVehicleHeader() {
		printLine(95);
		System.out.printf("%-15s %-10s %-15s %-15s %-15s %-15s %-15s%n", "REGISTRATION NO", "BRAND", "MAX. VELOCITY",
				"NO. OF SEATS", "VEHICLE TYPE", "PURCHASE COST", "VEHICLE TAX");
		printLine(95);
	}
}
