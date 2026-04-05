import java.util.ArrayList;

public class Odds
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        // Pre-load the array list with values
        for (int index = 1; index < 21; index++)
        {
            nums.add(index);
        }
        
        System.out.println("Original List:");
        System.out.println(nums);
        
        // Call removeEvens on the ArrayList above
        removeEvens(nums);
        
        // Print the ArrayList to verify the even numbers have been removed
        System.out.println("New List:");
        System.out.println(nums);
        
        
    }
    
    // Removes all even numbers from the list
    public static void removeEvens(ArrayList<Integer> list)
    {
        // Write your code here
        for (int i = list.size() - 1; i >= 0; i--)
        {
            if(list.get(i) % 2 == 0)
                list.remove(i);
        }
        
    }
}
