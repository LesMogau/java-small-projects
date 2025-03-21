public class NumberToWords {

    // Method to count the digits in the number
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1; // Invalid value for negative numbers
        }

        // Special case for zero
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10; // Remove the last digit
        }
        return count;
    }

    // Method to reverse the digits of the number
    public static int reverse(int number) {
        int reversed = 0;
        int sign = (number < 0) ? -1 : 1; // Capture the sign of the number
        number = Math.abs(number);

        while (number != 0) {
            reversed = reversed * 10 + (number % 10); // Add the last digit to the reversed number
            number /= 10; // Remove the last digit
        }

        return sign * reversed; // Apply the original sign
    }

    // Method to convert the number to words
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // Special case for number 0
        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int reversedNumber = reverse(number);
        int digitCount = getDigitCount(number);

        // Loop through each digit of the reversed number
        while (reversedNumber != 0) {
            int digit = reversedNumber % 10; // Extract the last digit
            switch (digit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            reversedNumber /= 10; // Remove the last digit
        }

        // Handle leading zeros by printing "Zero" for missing digits
        int reversedDigitCount = getDigitCount(reverse(number));  // Reversed digit count
        for (int i = reversedDigitCount; i < digitCount; i++) {
            System.out.print("Zero "); // Print "Zero" for each missing digit
        }

        System.out.println(); // Print a newline after the output
    }
}
