import java.util.ArrayList;

public class Max
{
    public static void main(String[] args)
    {
        // Create an ArrayList and add some elements
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        
        int max = findMax(numbers);
        System.out.println("Maximum value: " + max);
    }
    // Returns the maximum integer in an ArrayList of integers
    public static int findMax(ArrayList<Integer> list)
    {
        // Write your algorithm here!
        int max = Integer.MIN_VALUE;
        for (int x : list)
        {
            if (x > max)
                max = x;
        }
        return max;
    }
}
