import java.util.Scanner;

public class PickupWindowRunner 
{
    public static void main(String[] args) 
    {
        // Define the menu data
        String[] items = {"1", "2", "3", "4", "5"};
        String[] descriptions = {"Hamburger", "Cheeseburger", "Veggie Burger", "Nachos\t", "Hot Dog\t"};
        String[] costs = {"20", "22", "20", "25", "10"};

        // Create a Menu object
        Menu menu = new Menu(items, descriptions, costs);

        // Print the menu
        menu.printMenu();

        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for their order number
        System.out.println("Enter Desired Item #: ");
        String orderNum = input.nextLine();

        // Use getItemCost to return item cost
        String cost = menu.getItemCost(String.valueOf(orderNum));
        
        if (cost.equals("Invalid")) 
        {
            System.out.println("Invalid item selected.");
        } 
        else 
        {
            // Convert the String to a double and print the total with tip 
            double price = Double.parseDouble(cost);
            double total = price * 1.22;
            System.out.println("Order Total (Tip Included): " + total);
            
        }
    }
}

//___________________________________________________________________________________________________
public class Menu 
{
    // Arrays to hold menu items, descriptions, and costs
    private String[] menuItem;
    private String[] itemDescription;
    private String[] menuCost;

    // Constructor to initialize menu arrays using a for loop
    public Menu(String[] items, String[] descriptions, String[] costs) 
    {
        menuItem = new String[items.length];
        itemDescription = new String[descriptions.length];
        menuCost = new String[costs.length];

        for (int i = 0; i < items.length; i++) 
        {
            menuItem[i] = items[i];
            itemDescription[i] = descriptions[i];
            menuCost[i] = costs[i];
        }
    }

    // Method to print the menu
    public void printMenu() 
    {
        System.out.println("----- Menu -----");
        System.out.println("Item #\tDescription\tCost $");

        for (int i = 0; i < menuItem.length; i++) 
        {
            System.out.println(menuItem[i] + "\t" + itemDescription[i] + "\t$" + menuCost[i]);
        }
        System.out.println();
    }

    // Method to return the cost of a selected item
    public String getItemCost(String selectedItem) 
    {
        for (int i = 0; i < menuItem.length; i++) 
        {
            if (menuItem[i].equals(selectedItem)) 
            {
                return menuCost[i];
            }
        }
        return "Invalid";
    }
}
