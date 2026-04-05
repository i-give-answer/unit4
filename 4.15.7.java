import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] arr1 = {3, 1, 2};
        int[] arr2 = {5, 3, 4, 1, 6, 2};
        
        // Create your own array to be sorted
        

        // Run the insertion sort with printed outputs
        insertionSort(arr1);
    }
    
    /*
     * Insertion sort takes in an array of integers and
     * returns a sorted array of the same integers.
     */
    private static void insertionSort(int[] arr)
    {
        // Show initial state of the array
        System.out.println(Arrays.toString(arr));
        // Boolean to help print array state only when changes occur
        boolean shifted = false;
        // Loop through unsorted portion of the array starting at index 1
        for (int unsortedIndex = 1; unsortedIndex < arr.length; unsortedIndex++)
        {
            int unsortedValue = arr[unsortedIndex];
            
            // Set index to be place to the left
            int sortedIndex = unsortedIndex - 1;
            
            // We are still inbounds and the current number
            // is less than the current index
            while (sortedIndex > -1 && arr[sortedIndex] > unsortedValue)
            {
                // Shift the value at curIndex to the right one place
                arr[sortedIndex + 1] = arr[sortedIndex];
                sortedIndex--;
                // Tells us that shifts occured so that we can print new state
                shifted = true;
            }
            // Put this number in the proper location
            arr[sortedIndex + 1] = unsortedValue;
            
            // Only print state if the sorted values were actually shifted (otherwise
            // the unsorted value was already in the correct spot)
            if (shifted)
            {
                System.out.println(Arrays.toString(arr));
                shifted = false;
            }
        }
    }
}
