import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class SleepDataAnalysis
{
    public static void main(String[] args)
    {
        // Array to store hours slept each night
        double[] amountSleep = new double[21]; // adjust size if different
        int index = 0; // keeps track of the current position in array

        try
        {
            File file = new File("ParticipantASleep.txt");
            Scanner input = new Scanner(file);

            while (input.hasNext())
            {
                String date = input.next();          // read MM/DD
                double minutesAsleep = input.nextDouble();
                double minutesInBed = input.nextDouble(); // not used yet

                double hoursAsleep = minutesAsleep / 60.0;

                // Store in array
                amountSleep[index] = hoursAsleep;
                index++;

                System.out.println(date + ": slept " + hoursAsleep + " hours");
            }

            input.close();
        }
        catch (IOException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }

        // Calculate average sleep
        double averageSleep = findAverageSleep(amountSleep, index);
        System.out.println("\nAverage sleep: " + averageSleep + " hours");

        // Check if enough sleep
        if (isEnoughSleep(averageSleep))
        {
            System.out.println("Participant A is getting the recommended amount of sleep.");
        }
        else
        {
            System.out.println("Participant A is NOT getting the recommended amount of sleep.");
        }
    }

    // Method to calculate average of values in array
    public static double findAverageSleep(double[] arr, int size)
    {
        double sum = 0;
        for (int i = 0; i < size; i++)
        {
            sum += arr[i];
        }
        return sum / size;
    }

    // Method to check if average sleep is at least 7 hours
    public static boolean isEnoughSleep(double average)
    {
        return average >= 7.0;
    }
}
