public class ZooRunner 
{
    public static void main(String[] args) 
    {
        // Create animal group objects
        AnimalGroup animal1 = new AnimalGroup("Elephant", "5000.0", "2");
        AnimalGroup animal2 = new AnimalGroup("Giraffe", "800.5", "3");

        // Create a new Zoo object with two animal groups
        Zoo zoo = new Zoo(animal1, animal2);

        // Print animal details
        zoo.printAnimals();

        // Print total weight of animals in the zoo
        System.out.println("Total weight: " + zoo.calculateTotalWeight() + " kg");
    }
}

//____________________________________________________________________________________________
public class Zoo 
{
    private AnimalGroup animal1;
    private AnimalGroup animal2;

    // Constructor stores copies of the animal objects
    public Zoo(AnimalGroup a1, AnimalGroup a2) 
    {
        animal1 = new AnimalGroup(a1.getName(), a1.getWeight(), a1.getQuantity());
        animal2 = new AnimalGroup(a2.getName(), a2.getWeight(), a2.getQuantity());
    }

    // Calculates total weight of animals in the zoo
    public double calculateTotalWeight() 
    {
        double total = 0.0;

        if (animal1 != null) 
        {
            double weight1 = Double.parseDouble(animal1.getWeight());
            int qty1 = Integer.parseInt(animal1.getQuantity());
            total += weight1 * qty1;
        }

        if (animal2 != null) 
        {
            double weight2 = Double.parseDouble(animal2.getWeight());
            int qty2 = Integer.parseInt(animal2.getQuantity());
            total += weight2 * qty2;
        }

        return total;
    }

    // Prints details of the animals in the zoo
    public void printAnimals() 
    {
        if (animal1 != null) 
        {
            System.out.println("Animal: " + animal1.getName() + ", Weight: " + animal1.getWeight() + " kg, Quantity: " + animal1.getQuantity());
        }

        if (animal2 != null) 
        {
            System.out.println("Animal: " + animal2.getName() + ", Weight: " + animal2.getWeight() + " kg, Quantity: " + animal2.getQuantity());
        }
    }
}

//_______________________________________________________________________________________________________________________________________________________-
public class AnimalGroup 
{
    private String name;
    private String averageSingleWeight; // average weight per animal in the group
    private String quantity;

    // Constructor initializes name, averageSingleWeight, and quantity
    public AnimalGroup(String n, String w, String q) 
    {
        name = n;
        averageSingleWeight = w;
        quantity = q;
    }

    // Returns the animal's name
    public String getName() 
    {
        return name;
    }

    // Returns weight of single animal in group
    public String getWeight() 
    {
        return averageSingleWeight;
    }

    // Returns quantity of animals in group
    public String getQuantity() 
    {
        return quantity;
    }
}
