        public class RetailAnalysisRunner
        {
            public static void main(String[] args)
            {
                int[][] sales = {
                    {118, 263, 173, 269, 87, 239, 142, 267, 183, 128}, // Monday
                    {243, 168, 195, 288, 267, 72, 162, 276, 94, 0},    // Tuesday
                    {198, 256, 272, 105, 236, 157, 97, 281, 264, 293}, // Wednesday
                    {208, 193, 247, 276, 138, 65, 274, 268, 115, 146}, // Thursday
                    {126, 277, 165, 214, 263, 185, 288, 87, 293, 134}, // Friday
                    {205, 262, 140, 267, 187, 291, 168, 82, 221, 252}, // Saturday
                    {259, 132, 239, 291, 184, 114, 288, 263, 276, 73}  // Sunday
                };
        
                // Create RetailAnalysis object and use new methods:
                RetailAnalysis store = new RetailAnalysis(sales);
                System.out.println("Sales dataset is missing data: " + store.hasMissingData());
        
                System.out.println("Average daily sales for product 2: " + store.averageSalesForProduct(2));
                
                
            }
        }

//___________________________________________________________________________________________--
public class RetailAnalysis 
{
    private int[][] sales;

    // Constructor to initialize the sales data array
    public RetailAnalysis(int[][] salesData) 
    {
        // Assign the actual data array to the instance variable
        sales = salesData;
    }

    // This method checks to see if there is any missing data (values
    // of 0) in the 2D array. Returns true if there is at least one
    // 0 in the dataset.
    public boolean hasMissingData()
    {
        // Complete this method
        for (int day = 0; day < sales.length; day++)
        {
            for (int product = 0; product < sales[day].length; product++)
            {
                if (sales[day][product] == 0)
                {
                    return true;
                }
            }
        }
        return false;
    }

    // This method calculates the average daily sales for a given product
    public double averageSalesForProduct(int productIndex)
    {
        // Complete this method
        int total = 0;
        
        for (int day = 0; day < sales.length; day++)
        {
            total += sales[day][productIndex];
        }
        return (double) total / sales.length;
    }
    
    // Feel free to copy in methods from part 1 to include all
    // of the retail analysis methods:
    
    
}
