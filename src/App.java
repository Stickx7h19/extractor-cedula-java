/**
 * IdentificationCardYearExtractor.java
 * 
 * This program extracts the birth year from a Colombian identification card number.
 * Colombian ID cards (cédulas) have 11 digits, where the first two digits represent
 * the year of birth (e.g., 86 for 1986, 05 for 2005).
 * 
 * @author [Tu Nombre]
 * @version 1.0
 * @since 2024
 */
public class App {
    
    /**
     * Main method - entry point of the program
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Example 1: Regular case (year 1986)
        long idNumber1 = 86021912345L;
        System.out.println("=== IDENTIFICATION CARD YEAR EXTRACTOR ===");
        System.out.println("Example 1:");
        System.out.println("Input ID: " + idNumber1);
        System.out.println("Extracted year: " + extractYearFromId(idNumber1));
        System.out.println("Expected output: 86\n");
        
        // Example 2: ID starting with 0 (representing year 2005)
        String idNumber2 = "05123456789";
        System.out.println("Example 2:");
        System.out.println("Input ID: " + idNumber2);
        System.out.println("Extracted year: " + extractYearFromId(idNumber2));
        System.out.println("Expected output: 05\n");
        
        // Example 3: Using Scanner for user input
        demonstrateInteractiveVersion();
    }
    
    /**
     * Extracts the birth year from an 11-digit ID number using mathematical operations.
     * This method works with numeric values but cannot preserve leading zeros.
     * 
     * @param idNumber The 11-digit identification card number as a long
     * @return The first two digits as an integer (e.g., 86, 5 for "05")
     */
    public static int extractYearFromId(long idNumber) {
        // Divide by 1,000,000,000 to get the first two digits
        // For 86021912345: 86021912345 / 1000000000 = 86
        return (int)(idNumber / 1000000000L);
    }
    
    /**
     * Extracts the birth year from an 11-digit ID number using String manipulation.
     * This method preserves leading zeros.
     * 
     * @param idNumber The 11-digit identification card number as a String
     * @return The first two digits as a String (e.g., "86", "05")
     */
    public static String extractYearFromId(String idNumber) {
        // Validate input
        if (idNumber == null || idNumber.length() != 11) {
            return "Invalid ID number";
        }
        
        // Extract first two characters (the year)
        return idNumber.substring(0, 2);
    }
    
    /**
     * Demonstrates an interactive version using Scanner to get user input.
     */
    public static void demonstrateInteractiveVersion() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("=== INTERACTIVE VERSION ===");
        System.out.print("Please enter your 11-digit ID number: ");
        String userInput = scanner.nextLine();
        
        // Remove any spaces or special characters
        userInput = userInput.trim();
        
        // Validate input
        if (userInput.length() != 11) {
            System.out.println("Error: ID number must have exactly 11 digits.");
        } else if (!userInput.matches("\\d+")) {
            System.out.println("Error: ID number must contain only digits.");
        } else {
            String year = extractYearFromId(userInput);
            System.out.println("Your birth year (first two digits): " + year);
            
            // Interpret the year
            int yearNum = Integer.parseInt(year);
            if (yearNum <= 23) { // Assuming current year is 2023
                System.out.println("This corresponds to 20" + year + " (2000s)");
            } else {
                System.out.println("This corresponds to 19" + year + " (1900s)");
            }
        }
        
        scanner.close();
    }
}
