public class RoadTripRunner
{
    public static void main(String[] args)
    {
        // Create a new road trip and add stops
        RoadTrip rt = new RoadTrip();
        rt.addStop("San Francisco", 37.7833, -122.4167);
        rt.addStop("Los Angeles", 34.052235, -118.243683);
        rt.addStop("Las Vegas", 36.114647, -115.172813);

        // Print the list of stops
        System.out.println(rt);

        // Print total number of stops
        System.out.println("Stops: " + rt.getNumberOfStops());

        // Print total distance of the trip
        System.out.println("Total Miles: " + rt.getTripLength());
    }
}

//______________________________________________________________________________
import java.util.ArrayList;

public class RoadTrip
{
    // Add instance variable to store the list of GeoLocations
    private ArrayList<GeoLocation> stops;

    // Constructor initializes the ArrayList
    public RoadTrip()
    {
        stops = new ArrayList<>();
    }

    // Creates a GeoLocation and adds it to the list
    public void addStop(String name, double latitude, double longitude)
    {
        // Your code goes here
        stops.add(new GeoLocation (name, latitude, longitude));
        
    }

    // Returns the number of locations in the trip
    public int getNumberOfStops()
    {
        // Your code goes here
        return stops.size();
        
    }

    // Returns the total distance of the trip
    public double getTripLength()
    {
        // Your code goes here
        double total = 0;
        
        for (int i = 0; i < stops.size() - 1; i++)
        {
            total += stops.get(i).distanceFrom(stops.get(i+1));
        }
        return total;
    }

    // Returns a numbered list of all stops
    public String toString()
    {
        // Your code goes here
        String result = "";
        for (int i = 0; i < stops.size(); i++)
        {
            result += (i + 1) + ". " + stops.get(i) + "\n";
        }
        return result;
    }
}

//____________________________________________________
/*
 * This class stores information about a location on Earth.  Locations are
 * specified using latitude and longitude.  The class includes a method for
 * computing the distance between two locations.
 *
 * This implementation is based off of the example from Stuart Reges at 
 * the University of Washington.
 */

public class GeoLocation
{
    // Earth radius in miles
    public static final double RADIUS = 3963.1676;

    // Instance variables for location
    private double latitude;
    private double longitude;
    private String name;
    
    // Constructor with name, latitude and longitude
    public GeoLocation(String locationName, double lat, double lon)
    {
        name = locationName;
        latitude = lat;
        longitude = lon;
    }

    // Returns the name of the location
    public String getName()
    {
        return name;
    }

    // Returns the latitude
    public double getLatitude()
    {
        return latitude;
    }

    // Returns the longitude
    public double getLongitude()
    {
        return longitude;
    }

    // Returns a formatted string representation of the location
    public String toString()
    {
        return name + " (" + latitude + ", " + longitude + ")";
    }

    // Calculates the distance from this location to another location
    public double distanceFrom(GeoLocation other)
    {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);

        double theCos = Math.sin(lat1) * Math.sin(lat2) +
                        Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);

        return arcLength * RADIUS;
    }
}
