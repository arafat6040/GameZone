import javax.swing.JOptionPane;

public class RandomGuess {
    public static void main(String[] args) {
        // Ask user to enter a number between 1 and 10
        String input = JOptionPane.showInputDialog("Guess a number between 1 and 10:");

        // Convert the input to a number
        int userGuess = Integer.parseInt(input);

        // Generate a random number from 1 to 10
        int randomNumber = 1 + (int)(Math.random() * 10);

        // Create message
        String message;
        if (userGuess == randomNumber) {
            message = "Correct! The number was " + randomNumber;
        } else {
            message = "Oops! The number was " + randomNumber;
        }

        // Show the result
        JOptionPane.showMessageDialog(null, message);
    }
}
