//Exploration: Two Traversals

public class TwoTraversals
{
    public static void main(String[] args)
    {
        int[] scores = {80, 92, 91, 68, 88};
        doubleValues(scores);

        System.out.println("Traditional for loop:");
        printTraditional(scores);

        System.out.println("\nEnhanced for loop:");
        printEnhanced(scores);
    }

    // Prints each item in the array using a traditional for loop
    public static void printTraditional(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {   
	        System.out.println(arr[i]);
        }
    }

    // Prints each item in the array using an enhanced for loop
    public static void printEnhanced(int[] arr)
    {
        for (int item : arr)
        {
            System.out.println(item);
        }
    }

    // Doubles every value in the array
    public static void doubleValues(int[] arr)
    {
        // Complete this method
        for (int i = 0; i < arr.length; i++)
        {   
	        arr[i] *= 2;
        }
    }
}
