public class BabyThermometerRunner
{
    public static void main(String[] args)
    {
        BabyThermometer monitor = new BabyThermometer();
        
        // Add valid temperatures
        monitor.addTemperature(100.6);
        monitor.addTemperature(102.3);
        
        // Try to add an invalid temperature
        monitor.addTemperature(107.0);

        // Try replacing last temperature with an invalid value
        monitor.replaceLastTemperature(10.0);

        // Print all temperatures
        System.out.println(monitor);

        // Print most recent temp and total number of temps
        System.out.println("Last Temperature Added: " + monitor.getMostRecentTemperature() + "°F");
        System.out.println("Total Temperatures Recorded: " + monitor.getTemperatureCount());
        
        // Remove last temperature
        monitor.removeLastTemperature();

        // Print final recorded temperatures
        System.out.println(monitor);
    }
}

//___________________________________________________________________________________________________________
import java.util.ArrayList;

public class BabyThermometer
{
    // Instance variable: stores a list of recorded temperature readings (in Fahrenheit)
    private ArrayList<Double> temperatures;

    // Constructor: initializes the temperatures list
    public BabyThermometer()
    {
        temperatures = new ArrayList<Double>();
    }

    // Adds a temperature to the list only if it is within a realistic human range.
    public void addTemperature(Double temp)
    {
        // Write your code here
        if (temp >= 95.0 && temp <= 105.0)
        {
            temperatures.add(temp);
            System.out.println("Adding temperature: " + temp + "°F");
        }
        else
        {
            System.out.println("°F is outside valid range and was not added.");
        }
        
    }

    // Removes the most recent temperature from the list and prints what was removed.
    public void removeLastTemperature()
    {
        // Write your code here
        if (temperatures.size() > 0)
        {
            double removed = temperatures.remove(temperatures.size() - 1);
            System.out.println("Removed temperature: " + removed + "°F");
        }
        else
        {
            System.out.println("No temperatures recorded.");
        }
        
    }

    // Replaces the most recent temperature with a new one if the new temperature is valid.
    public void replaceLastTemperature(Double newTemp)
    {
        // Write your code here
        if (temperatures.size() == 0)
        {
            System.out.println("No temperatures recorded.");
            return;
        }

        if (newTemp >= 95.0 && newTemp <= 105.0)
        {
            temperatures.set(temperatures.size() - 1, newTemp);
            System.out.println("Replaced last temperature with: " + newTemp + "°F");
        }
        else
        {
            System.out.println(newTemp + "°F is outside valid range and was not used.");
        }
        
    }

    // Returns the most recent temperature from the list.
    public Double getMostRecentTemperature()
    {
        // Write your code here
        if (temperatures.size() > 0)
        {
            return temperatures.get(temperatures.size() - 1);
        }
        else
        {
            System.out.println("No temperatures recorded.");
            return 0.0;
        }
        
    }

    // Returns the total number of temperatures recorded in the list.
    public int getTemperatureCount()
    {
        // Write your code here
        return temperatures.size();
    }
    
    // Returns a string with all temperatures to be printed
    public String toString()
    {
        String temps = "";
        for (Double t : temperatures)
        {
            temps += t + "°F\n";
        }
        return "\nRecorded Temperatures:\n" + temps;
    }
}
