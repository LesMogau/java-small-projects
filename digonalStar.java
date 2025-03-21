public class SquareStarPattern {

    public static void printSquareStar(int number) {
        // Check if the number is valid
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        // Nested loops for rows and columns
        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                // Check the four conditions for placing a star
                if (row == 0 || row == number - 1 || col == 0 || col == number - 1 || row == col || col == number - row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after completing a row
            System.out.println();
        }
    }
}
