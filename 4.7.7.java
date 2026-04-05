public class WeatherStationApp
{
    public static void main(String[] args)
    {
        // An array of sample weather records for June, with some missing 
        // temperature or humidity values
        WeatherRecord[] records = {
            new WeatherRecord("2024-06-01", "75", "60"),
            new WeatherRecord("2024-06-02", "", "55"),   // Temp is missing
            new WeatherRecord("2024-06-03", "70", ""),   // Humidity is missing
            new WeatherRecord("2024-06-04", "82", "53"),
            new WeatherRecord("2024-06-05", "", "65")   // Temp is missing
        };

        // Print daily records and averages
        printWeatherData(records);
    }

    // This method processes the weather data, prints daily data, and
    // calculates and prints the temperature and humidity averages
    public static void printWeatherData(WeatherRecord[] list)
    {
        // Variables to store totals and counts for averaging
        int tempTotal = 0;
        int tempCount = 0;
        double humTotal = 0;
        int humCount = 0;

        // Loop through each record and print out the data
        for (WeatherRecord record : list)
        {
            System.out.print("Date: " + record.getDate());

            // Only include temperature if it's not null
            if (record.getTemperature() != null)
            {
                System.out.print(", Temp: " + record.getTemperature() + "°F");
                
                // Update variables for average
                tempTotal += record.getTemperature();
                tempCount++;
            }
            else
            {
                System.out.print(", Temp: No Data");
            }

            // Only include humidity if it's not null
            if (record.getHumidity() != null)
            {
                System.out.println(", Humidity: " + record.getHumidity() + "%");
                
                // Update variables for average
                humTotal += record.getHumidity();
                humCount++;
            }
            else
            {
                System.out.println(", Humidity: No Data");
            }
        }

        System.out.println();

        // Calculate and display average temperature
        if (tempCount > 0)
        {
            System.out.println("Average Temp: " + (tempTotal / tempCount) + "°F");
        }
        else
        {
            System.out.println("Average Temp: No Data");
        }

        // Calculate and display average humidity
        if (humCount > 0)
        {
            System.out.println("Average Humidity: " + (humTotal / humCount) + "%");
        }
        else
        {
            System.out.println("Average Humidity: No Data");
        }
    }
}

//_________________________________________________________________________________________________________
public class WeatherRecord
{
    // Each record stores the date, temperature, and humidity for one day
    private String date;
    private Integer temperature;
    private Double humidity;

    // Constructor accepts Strings from data and tries to convert them
    public WeatherRecord(String d, String temp, String hum)
    {
        date = d;

        // If there's a temperature value, convert it to Integer
        if (temp.length() > 0)
        {
            temperature = Integer.parseInt(temp);
        }

        // If there's a humidity value, convert it to Double
        if (hum.length() > 0)
        {
            humidity = Double.parseDouble(hum);
        }
    }

    // Getters to access data from other classes
    public String getDate()
    {
        return date;
    }

    public Integer getTemperature()
    {
        return temperature;
    }

    public Double getHumidity()
    {
        return humidity;
    }
}
