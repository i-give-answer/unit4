// Exploration: Number of Active Days

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FitbitAnalysis
{
    public static void main(String[] args)
    {
        int numActiveDays = 0;
        int numInactiveDays = 0; // new counter for inactive days

        try
        {
            File file = new File("ParticipantA.txt");
            Scanner input = new Scanner(file);
            
            while (input.hasNext())
            {
                String date = input.next();             // read date
                int lightlyActive = input.nextInt();    // read lightly active minutes
                int fairlyActive = input.nextInt();     // read fairly active minutes
                int veryActive = input.nextInt();       // read very active minutes
                
                int activeMinutes = fairlyActive + veryActive;
                
                System.out.println(date + ": " + activeMinutes + " total active minutes.");
            
                // Count active days
                if (activeMinutes >= 30) 
                {
                    numActiveDays++;
                }
                else // Count inactive days
                {
                    numInactiveDays++;
                }
            }
            input.close();
        }
        catch (IOException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }
        
        // Print Summary
        System.out.println("*********************");
        System.out.println("SUMMARY");
        System.out.println("Number of active days: " + numActiveDays);
        System.out.println("Number of inactive days: " + numInactiveDays); // new summary
    }
}
