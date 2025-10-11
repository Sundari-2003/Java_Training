package taxapp.utils;

import java.util.Scanner;

public class InputValidator {

    /**
     * Validates if the vehicle registration number is exactly 4 digits.
     * You can customize this pattern as per your needs.
     */
    public static boolean isValidRegistrationNumber(String regNo) {
        if (regNo == null) return false;
        return regNo.matches("\\d{4}");
    }

    /**
     * Reads an integer input from the scanner within the specified range (inclusive).
     * Keeps prompting until a valid input is entered.
     */
    public static int readIntInRange(Scanner scanner, String prompt, int min, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                value = Integer.parseInt(input);
                if (value < min || value > max) {
                    System.out.printf("Input must be between %d and %d. Please try again.%n", min, max);
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid integer.");
            }
        }
    }

    /**
     * Reads a double input from the scanner within the specified range (inclusive).
     * Keeps prompting until a valid input is entered.
     */
    public static double readDoubleInRange(Scanner scanner, String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                value = Double.parseDouble(input);
                if (value < min || value > max) {
                    System.out.printf("Input must be between %.2f and %.2f. Please try again.%n", min, max);
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid decimal number.");
            }
        }
    }

    /**
     * Validates if a string is non-null, non-empty, and contains only letters and spaces (for names/brands).
     * Modify as needed.
     */
    public static boolean isValidName(String input) {
        if (input == null) return false;
        return input.matches("[a-zA-Z ]+");
    }

    /**
     * Reads a non-empty string from the scanner.
     * Keeps prompting until a valid non-empty string is entered.
     */
    public static String readNonEmptyString(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.out.println("Input cannot be empty. Please try again.");
            }
        }
    }
    
    public static double readPositiveDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                value = Double.parseDouble(input);
                if (value <= 0) {
                    System.out.println("Please enter a positive number.");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid decimal number.");
            }
        }
    }

    public static int readPositiveInt(Scanner scanner, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                value = Integer.parseInt(input);
                if (value <= 0) {
                    System.out.println("Please enter a positive integer.");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static boolean readYesNo(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("Y") || input.equals("YES")) {
                return true;
            } else if (input.equals("N") || input.equals("NO")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

}



//package taxapp.utils;
//
//import taxapp.exceptions.InvalidInputException;
//
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class InputValidator {
//
//	// For vehicle registration uniqueness check - can be reset or synced with
//	// storage
//	private static Set<String> registeredNumbers = new HashSet<>();
//
//	// Validates that a number is a positive, non-zero double
//	public static double validatePositiveDouble(String input, String fieldName) throws InvalidInputException {
//		try {
//			double value = Double.parseDouble(input);
//			if (value <= 0) {
//				throw new InvalidInputException(fieldName + " must be a positive non-zero number.");
//			}
//			return value;
//		} catch (NumberFormatException e) {
//			throw new InvalidInputException(fieldName + " must be a valid number.");
//		}
//	}
//
//	// Validates that a number is a positive, non-zero integer
//	public static int validatePositiveInt(String input, String fieldName) throws InvalidInputException {
//		try {
//			int value = Integer.parseInt(input);
//			if (value <= 0) {
//				throw new InvalidInputException(fieldName + " must be a positive non-zero integer.");
//			}
//			return value;
//		} catch (NumberFormatException e) {
//			throw new InvalidInputException(fieldName + " must be a valid integer.");
//		}
//	}
//
//	// Validates Y/N input for city location
//	public static boolean validateCityLocation(String input) throws InvalidInputException {
//		if (input == null || input.isEmpty()) {
//			throw new InvalidInputException("City location input cannot be empty.");
//		}
//		char ch = Character.toUpperCase(input.charAt(0));
//		if (ch == 'Y') {
//			return true;
//		} else if (ch == 'N') {
//			return false;
//		} else {
//			throw new InvalidInputException("City location must be 'Y' or 'N'.");
//		}
//	}
//
//	// Validates property base value in positive double form
//	public static double validateBaseValue(String input) throws InvalidInputException {
//		double value = validatePositiveDouble(input, "Base value of land");
//		if (value == 0) {
//			throw new InvalidInputException("Base value of land cannot be zero.");
//		}
//		return value;
//	}
//
//	// Validates built-up area (positive double)
//	public static double validateBuiltUpArea(String input) throws InvalidInputException {
//		return validatePositiveDouble(input, "Built-up area");
//	}
//
//	// Validates age of construction (positive integer)
//	public static int validateAge(String input) throws InvalidInputException {
//		return validatePositiveInt(input, "Age of construction");
//	}
//
//	// Validates vehicle registration number: 4-digit, non-zero positive numeric,
//	// leading zeros allowed except all zeros
//	public static String validateRegistrationNumber(String input) throws InvalidInputException {
//		if (input == null || input.length() != 4) {
//			throw new InvalidInputException("Registration number must be exactly 4 digits.");
//		}
//		if (!input.matches("\\d{4}")) {
//			throw new InvalidInputException("Registration number must contain only digits.");
//		}
//		if (input.equals("0000")) {
//			throw new InvalidInputException("Registration number '0000' is invalid.");
//		}
//		if (registeredNumbers.contains(input)) {
//			throw new InvalidInputException("Registration number already exists.");
//		}
//		return input;
//	}
//
//	public static void registerNumber(String regNo) {
//		registeredNumbers.add(regNo);
//	}
//
//	// Validates brand (non-empty text)
//	public static String validateBrand(String input) throws InvalidInputException {
//		if (input == null || input.trim().isEmpty()) {
//			throw new InvalidInputException("Brand cannot be empty.");
//		}
//		return input.trim();
//	}
//
//	// Validates purchase cost between INR 50000 and 1000000
//	public static double validatePurchaseCost(String input) throws InvalidInputException {
//		double value = validatePositiveDouble(input, "Purchase cost");
//		if (value < 50000 || value > 1000000) {
//			throw new InvalidInputException("Purchase cost must be between 50000 and 1000000.");
//		}
//		return value;
//	}
//
//	// Validates max velocity between 120 and 300 kmph
//	public static double validateMaxVelocity(String input) throws InvalidInputException {
//		double value = validatePositiveDouble(input, "Maximum velocity");
//		if (value < 120 || value > 300) {
//			throw new InvalidInputException("Maximum velocity must be between 120 and 300 kmph.");
//		}
//		return value;
//	}
//
//	// Validates capacity (number of seats) between 2 and 50
//	public static int validateCapacity(String input) throws InvalidInputException {
//		int value = validatePositiveInt(input, "Capacity (number of seats)");
//		if (value < 2 || value > 50) {
//			throw new InvalidInputException("Capacity must be between 2 and 50.");
//		}
//		return value;
//	}
//
//	// Validates vehicle type choice: 1, 2, or 3
//	public static int validateVehicleType(String input) throws InvalidInputException {
//		int choice = validatePositiveInt(input, "Vehicle type");
//		if (choice < 1 || choice > 3) {
//			throw new InvalidInputException("Vehicle type must be 1 (Petrol), 2 (Diesel), or 3 (CNG/LPG).");
//		}
//		return choice;
//	}
//
//	// Clear registered numbers (for resetting if needed)
//	public static void clearRegisteredNumbers() {
//		registeredNumbers.clear();
//	}
//
//	public static double readPositiveDouble(Scanner scanner, String prompt) throws InvalidInputException {
//		double value;
//		while (true) {
//			System.out.print(prompt);
//			String input = scanner.nextLine();
//			try {
//				value = Double.parseDouble(input);
//				if (value <= 0) {
//					throw new InvalidInputException("Value must be a positive number.");
//				}
//				break;
//			} catch (NumberFormatException e) {
//				System.out.println("Invalid input! Please enter a numeric value.");
//			}
//		}
//		return value;
//	}
//
//	public static int readPositiveInt(Scanner scanner, String prompt) throws InvalidInputException {
//		int value;
//		while (true) {
//			System.out.print(prompt);
//			String input = scanner.nextLine();
//			try {
//				value = Integer.parseInt(input);
//				if (value <= 0) {
//					throw new InvalidInputException("Value must be a positive integer.");
//				}
//				break;
//			} catch (NumberFormatException e) {
//				System.out.println("Invalid input! Please enter a whole number.");
//			}
//		}
//		return value;
//	}
//
//	public static boolean readYesNo(Scanner scanner, String prompt) throws InvalidInputException {
//		while (true) {
//			System.out.print(prompt);
//			String input = scanner.nextLine().trim().toUpperCase();
//			if (input.equals("Y")) {
//				return true;
//			} else if (input.equals("N")) {
//				return false;
//			} else {
//				System.out.println("Invalid input! Please enter 'Y' for Yes or 'N' for No.");
//			}
//		}
//	}
//
//}
