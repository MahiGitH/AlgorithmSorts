
import java.util.Arrays;

// Main class
public class CountSort {
    // Method 1
    // To sort a string alphabetically
    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }
    public static void main(String[] args)
    {
        // Custom string as input
        String inputString1 = "edsab";
        String outputString1 = sortString(inputString1);
        System.out.println( "Input String: "+ inputString1);
        System.out.println("Output String: " + outputString1);

        String inputString2 = "geeksforgeeks";
        String outputString2 = sortString(inputString2);

        // Print and display commands

        // Input string
        System.out.println("Input String : " + inputString2);
        // Output string
        System.out.println("Output String : "
                + outputString2);

    }
}