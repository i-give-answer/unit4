//Coffee Shop
public class CoffeeShopRunner 
{
    public static void main(String[] args) 
    {
        // Create array of coffee bean types
        String[] coffeeTypes = {"Espresso", 
                                "House Blend", 
                                "Mexican", 
                                "Columbian",
                                "French Roast"};

        // Create new coffee shop with types and initial amounts
        CoffeeShop brew = new CoffeeShop(coffeeTypes, 10.0);

        // Print inventory
        System.out.println("Current Inventory:");
        brew.displayInventory();

        // Add 2.0 lbs to inventory
        brew.addInventory(2.0);

        // Sell 0.5 lbs of Mexican coffee
        brew.sellCoffee("Mexican", 0.5);

        // Try to sell 20 lbs of Columbian coffee
        brew.sellCoffee("Columbian", 20.0);

        // Print inventory
        System.out.println("\nCurrent Inventory:");
        brew.displayInventory();
    }
}


//________________________________________________________________________________________
public class CoffeeShop
{
    // Creating an array of CoffeeBag objects
    private CoffeeBag[] inventory;

    // Custom constructor with coffee types and amount
    public CoffeeShop(String[] types, double amount)
    {
        // Allocate memory for inventory
        inventory = new CoffeeBag[types.length];

        // Initialize inventory with bags using coffee types
        // in the types array:
        for(int i = 0; i < types.length; i++)
        {
            inventory[i] = new CoffeeBag(types[i], amount);
        }
        
        
        
        
        
    }

    // Default constructor, creating 5 bags of coffee
    public CoffeeShop()
    {
        inventory = new CoffeeBag[5];

        // Populating the array with different types of coffee
        inventory[0] = new CoffeeBag("Espresso", 5.0);
        inventory[1] = new CoffeeBag("House Blend", 5.0);
        inventory[2] = new CoffeeBag("Mexican", 5.0);
        inventory[3] = new CoffeeBag("Colombian", 5.0);
        inventory[4] = new CoffeeBag("French Roast", 5.0);
    }

    // Adds amount to all bags in inventory
    public void addInventory(double amount)
    {
        // Add amount to every coffee bag in inventory:
        for(CoffeeBag bag : inventory)
        {
            bag.add(amount);
        }
        
        System.out.println(amount + " lbs pounds of all coffee types added.");
        
        
        
        
        System.out.println(amount + " lbs of all coffee types added.");
    }

    // If choice is in inventory, and amount is less than available 
    // weight for bag, reduce weight by amount
    public void sellCoffee(String choice, double amount)
    {
        // Check if bag is in inventory and if there is enough
        // weight to sell. If so, sell that amount and exit method:
        for(CoffeeBag bag : inventory)
        {
            if(bag.getType().toLowerCase().equals(choice.toLowerCase()))
            {
                if(bag.getWeight() >= amount)
                {
                    bag.sell(amount);
                    System.out.println(amount+ " lbs of "+ bag.getType() + " coffee sold.");   
                    return;
                    
                }
            }
        }
        System.out.print("Sorry, we don't have your request in stock.");
        
        
        
        
        
        
        
        
        
        
        
        
        

        // Only prints if amount of choice is not available
        System.out.println("Sorry, we don't have your request in stock.");
    }

    // Print out the amount in stock for each bag
    public void displayInventory()
    {
        // Print out every bag in inventory:
        for(CoffeeBag bag : inventory)
        {
            System.out.println(bag);
        }
        
        System.out.println();
        
    }
}

//____________________________________________________________________________________________________
public class CoffeeBag
{
    private String type;
    private double weight; // in pounds

    // Constructor
    public CoffeeBag(String coffeeType, double initialWeight)
    {
        type = coffeeType;
        weight = initialWeight;
    }

    // Adds amount when coffee is purchased
    public void add(double amount)
    {
        if (amount > 0)
        {
            weight += amount;
        }
    }

    // Subtracts amount when coffee is sold
    public void sell(double amount)
    {
        if (amount > 0 && amount <= weight)
        {
            weight -= amount;
        }
    }

    public String getType()
    {
        return type;
    }

    public double getWeight()
    {
        return weight;
    }

    public String toString()
    {
        return "Type: " + type + ", Weight: " + weight + " lbs";
    }
}
