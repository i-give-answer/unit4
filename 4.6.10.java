//FitBit: Read in Sleep Data

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class SleepDataAnalysis
{
    public static void main(String[] args)
    {
        try
        {
            // Open the file
            File file = new File("ParticipantASleep.txt");
            Scanner input = new Scanner(file);

            // Read each line
            while (input.hasNext())
            {
                String date = input.next();          // MM/DD
                double minutesAsleep = input.nextDouble();
                double minutesInBed = input.nextDouble(); // not used yet

                double hoursAsleep = minutesAsleep / 60.0;

                System.out.println(date + ": slept " + hoursAsleep + " hours");
            }

            input.close();
        }
        catch (IOException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
