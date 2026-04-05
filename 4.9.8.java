import java.util.ArrayList;

public class ArrayListMethodsRunner
{
    public static void main(String[] args)
    {
        // Create an ArrayList to store double values
        ArrayList<Double> prices = new ArrayList<Double>();
        
        // Add sample values to the ArrayList
        prices.add(13.45);
        prices.add(8.99);
        prices.add(2.95);
        prices.add(7.88);
        prices.add(12.56);
        prices.add(1.23);
        
        // Print all values in the ArrayList
        ArrayListMethods.print(prices);
        
        // Call the condense method to combine pairs of values
        System.out.println("\nArrayList is condensing:");
        ArrayListMethods.condense(prices);
        ArrayListMethods.print(prices);
        
        // Call the duplicate method to add a second copy of all values
        System.out.println("\nArrayList is duplicating:");
        ArrayListMethods.duplicate(prices);
        ArrayListMethods.print(prices);
    }
}

//_________________________________________________________________________________
import java.util.ArrayList;

public class ArrayListMethods
{
    // Prints each value on its own line
    public static void print(ArrayList<Double> nums)
    {
        // Your code goes here
        for (double x : nums)
            System.out.println(x);
        
    }

    // Condenses the ArrayList by combining every pair of values
    public static void condense(ArrayList<Double> nums)
    {
        // Your code goes here
        for (int i = 0; i < nums.size() - 1; i++)
        {
            double product = nums.get(i) * nums.get(i+1);
            nums.set(i, product);
            nums.remove( i +1);
        }
        
    }

    // Duplicates all values in the ArrayList
    public static void duplicate(ArrayList<Double> nums)
    {
        // Your code goes here
        int originalSize = nums.size();
        
        for (int i = 0; i < originalSize; i++)
        {
            nums.add(nums.get(i));
        }
        
    }
}
