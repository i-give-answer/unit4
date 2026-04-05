//Array Avarage
public class ArrayAverageRunner
{
   public static void main(String[] args)
   {
        // Don't change the values in this array
        int[] numArray =  {12, 17, 65, 7, 30, 88};
        double avg = ArrayAverage.getAverage(numArray);
        System.out.println("The average of the array is " + avg);
   }
}

//____________________________________________________________________

public class ArrayAverage
{
    // Complete your static method, getAverage, here:
    public static double getAverage(int[] arr)
    {
    
        double sum = 0;
        
        for(int num : arr)
        {
            sum += num;
        }
        return sum / arr.length;
    }
    
    
    
}
