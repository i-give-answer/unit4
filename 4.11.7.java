public class TideRunner
{
    public static void main(String[] args)
    {
        // Create tide table for 5 locations based on text file
        TideTable table = new TideTable("tide_data.txt", 5);

        // Print the tide table
        table.printTideData();

        // Calculate and print the average tide height for desired location
        table.printAverageTideHeight(4);
    }
}

//_______________________________________________________________________________________
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TideTable
{
    // 2D array storing tide heights
    private Double[][] tideHeights; 

    public TideTable(String filename, int locations)
    {
        // Initialize 2D array, where null is the default empty value
        tideHeights = new Double[locations][4]; 
        // Fill data table with data from file
        readTideData(filename); 
    }

    // Reads data from file and fills the 2D array
    private void readTideData(String filename)
    {
        try
        {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            int row = 0;

            while (input.hasNext() && row < tideHeights.length)
            {
                // Complete this algorithm
                String line = input.nextLine();
                String [] values = line.split(" ");
                
                for (int col = 0; col < values.length; col++)
                {
                    if (values[col].equals("null"))
                    {
                        tideHeights[row][col] = null;
                    }
                    else
                    {
                        tideHeights[row][col] = Double.parseDouble (values [col]);
                    }
                }
                row++;
                
                
            }

            input.close();
        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Calculates and prints the average tide height for the given
    // the location. The incoming location values start at 1.
    public void printAverageTideHeight(int location)
    {
        // Complete this method
        if(location < 1 || location > tideHeights.length)
        {
            System.out.println("Invalid location number.");
            return;
        }
        
        Double [] row = tideHeights[location - 1];
        
        double sum = 0;
        int count = 0;
        
        for (Double value : row)
        {
            if (value != null)
            {
                sum += value;
                count++;
            }
        }
        double avarage = sum / count;
        System.out.println("Location's avarage tide is" + avarage + "m.");
        
        
    }

    // Prints the entire tide data array
    public void printTideData()
    {
        System.out.println("~~ Tide Heights Data ~~");
        for (int row = 0; row < tideHeights.length; row++)
        {
            System.out.print("Location " + (row + 1) + ": | ");
            for (int col = 0; col < tideHeights[row].length; col++)
            {
                if (tideHeights[row][col] != null)
                {
                    System.out.print(tideHeights[row][col] + "m | ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
