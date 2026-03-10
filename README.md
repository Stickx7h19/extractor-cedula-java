# 🆔 Identification Card Year Extractor

A Java program that extracts the birth year from a Colombian identification card number (cédula). The program takes an 11-digit ID number and returns the first two digits, which represent the person's birth year.

## 📋 Description

Colombian identification cards (cédulas) have exactly 11 digits, where the **first two digits** represent the birth year of the person. This program extracts those two digits using mathematical operations.

### Example
Input: 86021912345
Output: 86

*Explanation: The first two digits (86) indicate the person was born in 1986*

## ✨ Features

- Extracts birth year from 11-digit ID numbers
- Handles large numbers using `long` data type
- Input validation for exactly 11 digits
- Multiple extraction methods (mathematical and string-based)
- Interactive mode for user input
- Comprehensive test cases

## 🚀 Getting Started

### Prerequisites

- Java JDK 11 or higher
- Visual Studio Code (recommended) or any Java IDE

### Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/YOUR-USERNAME/identification-card-year-extractor.git

## Project Structure
identification-card-year-extractor/
├── src/
│   └── App.java                 # Main program file
├── lib/                          # Dependencies (if any)
├── bin/                          # Compiled output files
├── README.md                     # This file
└── .vscode/                      # VS Code settings
    └── settings.json

## Mathematical Method
public static int extractYearFromId(long idNumber) {
    // Divide by 1,000,000,000 to get the first two digits
    // Example: 86021912345 / 1000000000 = 86
    return (int)(idNumber / 1000000000L);
}

## String Method (preserves leading zeros)

public static String extractYearFromId(String idNumber) {
    // Extract first two characters
    return idNumber.substring(0, 2);
}

## Sample Output
=== IDENTIFICATION CARD YEAR EXTRACTOR ===
Example 1:
Input ID: 86021912345
Extracted year: 86
Expected output: 86

Example 2:
Input ID: 05123456789
Extracted year: 05
Expected output: 05

=== INTERACTIVE VERSION ===
Please enter your 11-digit ID number: 92033098765
Your birth year (first two digits): 92
This corresponds to 1992 (1900s)

Thanks
