//Debugging: Multiples

public class Multiples
{
    public static void main(String[] args)
    {
        int[] sample = {75, 3, 40, 33, 110, 1, 92, 56, 80, 24};
        
        int num = 5;
        int count = multiples(sample, num);
        
        System.out.println("There are " + count + " multiples of " + num
            + " in the array.");
    }

    // Returns a count of the number of multiples of parameter "number"
    // in the parameter "arr"
    public static int multiples(int[] arr, int number)
    {
        int count = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % number == 0)
            {
                count++;
            }
        }

        return count;
    }
}
