// Challenge 7 by Brianna Canales

import javax.swing.JOptionPane;
import java.util.Random;

public class PasswordGenerator
{
    public static void main(String[] args)
    {
        // Get user input for the number of digits
        String input = JOptionPane.showInputDialog("How many digits do you want to use for a numeric password?");
        int numDigits = Integer.parseInt(input);

        // Create a random number generator
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Generate the password
        for (int i = 0; i < numDigits; i++) {
            int digit = random.nextInt(10); // Generates a digit between 0 and 9
            password.append(digit).append(" ");
        }

        // Display the generated password
        JOptionPane.showMessageDialog(null, "Your password is:\n" + password.toString().trim());
    }
}

