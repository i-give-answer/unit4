//CityStats
public class CityStats
{
    public static void main(String[] args)
    {
      // Create the 3 arrays here
      String[] cities = {"London", "Marrakesh","Santa Fe"};
      
      int[] population = {8982000, 982850, 89008};
      
      double[] rain = {23.0, 9.5, 14.21};
        
      // Print all 3 arrays according to the output in the description
      for(int i = 0; i < cities.length; i++)
      {
          System.out.println(cities[i] + "'s population: " + population[i]);
      }
      
      System.out.println();
      
      
      for(int i = 0; i < cities.length; i++)
      {
          System.out.println(cities[i] + " averages " + rain[i] + " inches of rain per year.");
      }
      
    
    }
}
