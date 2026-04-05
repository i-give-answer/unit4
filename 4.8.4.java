import java.util.ArrayList;

public class ArrayListMethods 
{
    public static void main(String[] args) 
    {
        // Create an ArrayList that stores vegetable names
        ArrayList<String> veggies = new ArrayList<String>();


        // Add vegetables to the END of the list
        veggies.add("Carrot");
        veggies.add("Zuchinni");
        veggies.add("Corn");
        veggies.add("Pepper");

        // Print the entire list
        System.out.println("Elements in list: " + veggies);
        System.out.println("\n----------------------\n");
        

        // get(index) retrieves the item at index 2 (does NOT remove it)
        // Index 2 = "Corn"
        String element1 = veggies.get(2);
        System.out.println("Item at index 2: " + element1);

        // List stays the same because get() only reads
        System.out.println("Elements in list: " + veggies);
        System.out.println("\n----------------------\n");


        // size() returns how many elements are in the list
        System.out.println("Size of the list: " + veggies.size());
        

        // set(index, value) replaces the item at index 1 with "Broccoli"
        // It RETURNS the old value that was replaced ("Zuchinni")
        String element2 = veggies.set(1, "Broccoli");
        System.out.println("Replaced item: " + element2);

        // Replace the first element (index 0)
        veggies.set(0, "Cauliflower");

        // Print updated list
        System.out.println("Elements in list: " + veggies);


        // =========================
        // NEW TASKS
        // =========================

        // Get and print the SECOND item (index 1)
        String secondItem = veggies.get(1);
        System.out.println("Second item: " + secondItem);

        // Set first element to my favorite vegetable
        veggies.set(0, "Spinach");

        // Print final list
        System.out.println("Final list: " + veggies);
    }
}
