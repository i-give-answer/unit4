//WaterSamples

public class WaterSampleRunner
{
    public static void main(String[] args)
    {
        WaterSample sample = new WaterSample();
        
        // Assigning pH values manually
        sample.setPHLevel(0, 6.8);  // Morning
        sample.setPHLevel(1, 7.2);  // Noon
        sample.setPHLevel(2, 7.0);  // Evening
        sample.setPHLevel(3, 6.9);  // Night

        // Retrieving and printing single pH value
        System.out.println("Morning pH: " + sample.getPHLevel(0));
        
        // Printing out all of the pHs in the sample
        System.out.println("\n" + sample + "\n");

        // Try setting a value with an invalid index
        sample.setPHLevel(4, 6.8);
    }
}


//___________________________________________________________________________________________
public class WaterSample
{
    // Instance variable
    private double [] pHLevels;

    // Constructor initializes an array for 4 pH readings 
    // (morning, noon, evening, night)
    public WaterSample()
    {
        // Allocate memory for your array, initializing
        // its default double values
        pHLevels  = new double[4];
    }

    // Set a pH value at a specific time slot
    public void setPHLevel(int index, double value)
    {
        // Complete this method
        if (index >= 0 && index < pHLevels.length)
        {
            pHLevels[index] = value;
        }
        else
        {
            System.out.println("Invalid Index");
        }
    }

    // Get a pH value from a specific time slot
    public double getPHLevel(int index)
    {
        // Complete this method
        if(index >= 0 && index < pHLevels.length)
        {
            return pHLevels[index];
        }
        else
        {
            return -1;
        }
    }
    
    // Print all pH values in array
    public String toString()
    {
        return "Morning pH: " + pHLevels[0]
            + "\nNoon pH: " + pHLevels[1]
            + "\nEvening pH: " + pHLevels[2]
            + "\nNight pH: " + pHLevels[3];
    }
}
