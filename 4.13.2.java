public class RetailAnalysisRunner
{
    public static void main(String[] args)
    {
        int[][] sales = {
            {118, 263, 173, 269, 87, 239, 142, 267, 183, 128}, // Monday
            {243, 168, 195, 288, 267, 72, 162, 276, 94, 0},    // Tuesday
            {198, 256, 272, 105, 236, 157, 97, 281, 264, 293}, // Wednesday
            {208, 193, 247, 276, 138, 65, 274, 268, 115, 146}, // Thursday
            {98, 277, 165, 214, 263, 185, 288, 87, 293, 134}, // Friday
            {205, 262, 140, 267, 187, 291, 168, 82, 221, 252}, // Saturday
            {259, 132, 239, 291, 184, 89, 288, 263, 276, 73}  // Sunday
        };

        RetailAnalysis store = new RetailAnalysis(sales);
        
        System.out.println("Mystery 1 output for product at index 0: ");
        System.out.println(store.getMaxSalesForProduct(0)+"\n");

        System.out.println("Mystery 2 output for day at index 5: ");
        System.out.println(store.getTotalSalesForDay(5)+"\n");
        
        System.out.println("Mystery 3 output: ");
        store.printDaysBelowThreshold(100);
    }
}

//-___________________________________________________________________________
public class RetailAnalysis 
{
    private int[][] sales;

    // Constructor to initialize the sales data array
    public RetailAnalysis(int[][] salesData) 
    {
        // Assign the actual data array to the instance variable
        sales = salesData;
    }

    public int getMaxSalesForProduct(int productIndex) 
    {
        int maxSales = sales[0][productIndex];

        for (int dayIndex = 1; dayIndex < sales.length; dayIndex++) 
        {
            if (sales[dayIndex][productIndex] > maxSales) 
            {
                maxSales = sales[dayIndex][productIndex];
            }
        }
        return maxSales;
    }

    public int getTotalSalesForDay(int dayIndex) 
    {
        int totalSales = 0;

        for (int productIndex = 0; productIndex < sales[dayIndex].length; productIndex++) 
        {
            totalSales += sales[dayIndex][productIndex];
        }
        return totalSales;
    }

    public void printDaysBelowThreshold(int threshold)
    {
        int[] countOfDays = new int[sales[0].length];

        for (int dayIndex = 0; dayIndex < sales.length; dayIndex++)
        {
            for (int productIndex = 0; productIndex < sales[0].length; productIndex++)
            {
                if (sales[dayIndex][productIndex] < threshold)
                {
                    countOfDays[productIndex]++;
                }
            }
        }

        for (int item : countOfDays)
        {
            System.out.print(item + " ");
        }
    }
}
