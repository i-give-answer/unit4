public class MedalSearch
{
    public static void main(String[] args)
    {
        int[][] goldMedals = {{2024, 40},
                             {2020, 39},
                             {2016, 46},
                             {2012, 46},
                             {2008, 36},
                             {2004, 36},
                             {2000, 37},
                             {1996, 44},
                             {1992, 47},
                             {1988, 36}};
        
        int year = 1992;
        int numMedals = findNumGoldMedalsReversed(goldMedals, year);
        //int numMedals = findNumGoldMedals(goldMedals, year);
        System.out.println("Number of gold medals for " + year + ": " + numMedals);
    }
    
    // Returns the number of medals earned for the target year. Also
    // prints out the number of passes through the array to find the
    // target year.
    public static int findNumGoldMedals(int[][] medalData, int targetYear)
    {
        int passes = 1;

        for (int row = 0; row < medalData.length; row++)
        {
            int year = medalData[row][0];

            if (year == targetYear /* [CHECK FOR YEAR MATCH WITH TARGET YEAR] */)
            {
                System.out.println("Number of passes through the for loop: " + passes);
                return medalData[row][1];/* [ROW MEDAL COUNT VALUE] */
            }
            passes++;
        }
        
        System.out.println("Number of passes through the for loop: " + passes);
        return -1;
    }
    
    public static int findNumGoldMedalsReversed(int[][] medalData, int targetYear)
    {
        int passes = 1;
    
        for (int row = medalData.length - 1; row >= 0; row--)
        {
            int year = medalData[row][0];
    
            if (year == targetYear)
            {
                System.out.println("Number of passes through the for loop: " + passes);
                return medalData[row][1];
            }
            passes++;
        }
        
        System.out.println("Number of passes through the for loop: " + passes);
        return -1;
    }
}
