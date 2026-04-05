//Warehouse Inventory
public class WarehouseRunner 
{
    public static void main(String[] args)
    {
        // Instantiate a Warehouse object with an initial
        // stock level for all products
        Warehouse warehouse = new Warehouse(20);
        
        // Display all stocks
        warehouse.displayStock();
    }
}

//_______________________________________________________________________________
public class Warehouse
{
    private int[] stockLevels;
    private int productCount;

    // Constructor initializes stock levels
    public Warehouse(int initialStock)
    {
        // Initializes variables and allocates memory
        productCount = 5;
        stockLevels = new int[productCount];

        // Use a for loop to set the same stock level for all 
        // products, avoiding these repeated statements:
        for(int i = 0; i < stockLevels.length; i++)
        {
            stockLevels[i] = initialStock;
        }
    }

    // Method to display stock levels
    public void displayStock()
    {
        System.out.println("Current Stock Levels:");
        
        // Use for loop to print out stock of each product
        for(int i = 0; i < stockLevels.length; i++)
        {
            System.out.println("Product " + (i + 1) + ": " 
                + stockLevels[i] + " units");
        }
        
    }
}
