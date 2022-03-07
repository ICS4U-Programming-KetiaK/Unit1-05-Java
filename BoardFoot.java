import java.util.Scanner;

/**
 * The BoardFoot program asks the user for the height
 * and width of the board and then accepts them as
 * parameters and calculates the length of the board that
 * can give a total volume of 144 inches^3.
 *
 *
 * @author  Ketia Gaelle Kaze
 * @version 1.0
 * @since   2022-03-01
 */

class BoardFoot {
    /**
     * Declaring constant for a board foot.
     */
    private static final double ONE_BOARD_FOOT = 144;

    /**
     * Display length of board to the console.
     *
     * @param height passed in
     * @param width passed in
     * @return length
     */
    public static double calculateBoardFoot(double height, double width) {
        final double length = ONE_BOARD_FOOT / (height * width);
        return length;
    }

    /**
     * Main entry into the board foot program.
     *
     * @param args nothing passed in
     */

    public static void main(String[] args) {
        // declaring variables
        Scanner sc = new Scanner(System.in);
        double userHeightDouble = 0;
        double userWidthDouble = 0;
        double length = 0;
        String userWidthString = "";
        String userHeightString = "";

        // get width from user
        System.out.print("Enter the width (inches): ");
        userWidthString = sc.nextLine();
        try {
            // converts width to a double
            userWidthDouble = Double.parseDouble(userWidthString);
            if (userWidthDouble > 0) {

                // get height from user
                System.out.print("Enter the height (inches): ");
                userHeightString = sc.nextLine();
                try {
                    // convert height to double
                    userHeightDouble = Double.parseDouble(userHeightString);
                    if (userHeightDouble > 0) {
                        length = calculateBoardFoot(userWidthDouble,
                                                             userHeightDouble);

                        // display length to the user
                        System.out.println();
                        System.out.println("The length has to be "
                                           + length
                                           + " inch(es).");

                    } else {
                        // displays error for negative height
                        System.out.println("Enter a positive number!");
                    }
                } catch (IllegalArgumentException exception) {
                    // displays error for invalid string
                    System.out.println("Enter a number!");
                }

            } else {
                // displays error for negative width
                System.out.println("Please enter a positive number!");
            }
        } catch (IllegalArgumentException exception) {
            // displays error for invalid string
            System.out.println("Please enter a number!");
        }
    }
}
