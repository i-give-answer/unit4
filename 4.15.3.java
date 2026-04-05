import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr1 = {3, 1, 2};
        int[] arr2 = {5, 3, 4, 1, 6, 2};
        
        // Create your own array to be sorted
        

        // Run the selection sort with printed outputs
        selectionSort(arr1);
    }
   
    private static void selectionSort(int[] arr)
    {
        // Show initial state of array at each pass
        System.out.println(Arrays.toString(arr));
        
        // Loop through each index in the array up to the 2nd to last index
        for (int curIndex = 0; curIndex < arr.length - 1; curIndex++)
        {
            // Find minimum in the rest of the list
            int minIndex = findMin(arr, curIndex);
            
            // Swap only if the index of min value is not the current index
            if (curIndex != minIndex)
            {
                // Swap the minimum into the correct position
                swap(arr, curIndex, minIndex);
                // Print new array state
                System.out.println(Arrays.toString(arr));
            }
        }
    }
    
    private static int findMin(int[] arr, int startingIndex)
    {
        int minIndex = startingIndex;
        
        for (int i = minIndex + 1; i < arr.length; i++)
        {
            if (arr[i] < arr[minIndex])
            {
                minIndex = i;
            }
        }
        
        return minIndex;
    }

    private static void swap(int[] arr, int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
