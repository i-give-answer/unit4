//Finding Duplicates

public class DuplicateRunner 
{
    public static void main (String[] args)
    {
        // Integer array to test methods
        int[] numbers = {1, 1, 5, 3, 5, 5};
        
        // Check for the presence of duplicates in numbers,
        // and count the number of adjacent duplicate pairs:
        boolean hasDup = Duplicates.hasDuplicates(numbers);
        System.out.println("Has Duplicates: " + hasDup);
        
        // Count adjacent duplicates
        int adjacentCount = Duplicates.countAdjacentDuplicates(numbers);
        System.out.println("Number of adjacent duplicate pairs: " + adjacentCount);        
    }
}

//___________________________________________________________________________________________
public class Duplicates 
{
    // Checks if there are any duplicate values in the given array.
    public static boolean hasDuplicates(int[] numArray)
    {
        for (int i = 0; i < numArray.length - 1; i++)
        {
            for (int j = i + 1; j < numArray.length; j++)
            {
                if (numArray[i] == numArray[j])
                {
                    return true;
                }
            }
        }
        return false;
    }

    // Counts and returns the number of adjacent duplicate value pairs
    // in the given array.
    public static int countAdjacentDuplicates(int[] numArray) 
    {
        // Complete this method
        int count = 0;
        
        for (int i = 0; i < numArray.length - 1; i++)
        {
            if(numArray[i] == numArray[i + 1])
            {
                count++;
            }
        }
        return count;
        
        
        
        
    }
}
