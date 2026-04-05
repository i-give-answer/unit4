//Exploration: Split Method

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordCount
{
    public static void main(String[] args)
    {
        try
        {
            // File and Scanner setup
            File file = new File("ShakeItOff.txt");
            Scanner input = new Scanner(file);

            // Initialize counters for both words
            int numShakes = 0;
            int numYou = 0;

            // Target words (lowercase for comparison)
            String targetShake = "shake";
            String targetYou = "you";

            // Process each line of the file
            while (input.hasNext())
            {
                String line = input.nextLine().toLowerCase(); // convert line to lowercase

                String[] arrayLine = line.split(" ");

                for (String word : arrayLine)
                {
                    if (word != null)
                    {
                        if (word.equals(targetShake))
                        {
                            numShakes++;
                        }
                        else if (word.equals(targetYou))
                        {
                            numYou++;
                        }
                    }
                }
            }

            // Clean up and output results
            input.close();
            System.out.println("Number of 'shake': " + numShakes);
            System.out.println("Number of 'you': " + numYou);
        }
        catch (IOException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
