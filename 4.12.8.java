public class Sum
{
    public static void main(String[] args)
    {
        int[][] array = {{4, 4, 5, 6, 3, 1},
                        {14, 2, 5, 4, 8, 2},
                        {45, 12, 13, 5, 2, 1}};
                        
        // Print out sum of 3rd row
        System.out.println("The sum of the 3rd row is " + sumRow(array, 2));
        
        // Print out sum of all elements
        System.out.print("The sum of the 2D array's elements is " + sum2DArray(array));
        
    }
    
    // Returns the sum of a row in the 2D array
    public static int sumRow(int[][] array, int row)
    {
        // Complete this method
        int sum = 0;
        
        for(int col = 0; col < array[row].length; col++)
        {
            sum += array[row][col];
        }
        return sum;
    }
    
    // Returns the sum of all elements in array
    public static int sum2DArray(int[][] array)
    {
        // Complete this 
        int sum = 0;
        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                sum += array[row][col];
            }
        }
        return sum;
    }
}
