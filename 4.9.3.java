import java.util.ArrayList;

public class ArrayListRemoverRunner
{
    public static void main(String[] args)
    {
        // Create and populate first list of snack names with consecutive duplicates of different snacks
        ArrayList<String> snacks1 = new ArrayList<String>();
        ArrayListUtility.initialize(snacks1);

        // Display original list
        System.out.println("Original snacks list:");
        ArrayListUtility.printList(snacks1);

        // Try removing "pickle chip" using forward loop
        ArrayListUtility.removeForward(snacks1, "pickle chip");

        // Display list after forward removal
        System.out.println("After removeForward (removing 'gummy worm'): ");
        ArrayListUtility.printList(snacks1);

        // Reset / initialize list with same snacks
        ArrayListUtility.initialize(snacks1);

        // Display second list before backward removal
        System.out.println("Original snacks list (again):");
        ArrayListUtility.printList(snacks1);

        // Try removing "gummy worm" using backward loop
        ArrayListUtility.removeBackward(snacks1, "pickle chip");

        // Display list after backward removal
        System.out.println("After removeBackward (removing 'gummy worm'): ");
        ArrayListUtility.printList(snacks1);
    }
}

//_____________________________________________________________________________________________
import java.util.ArrayList;

public class ArrayListUtility
{
    // Initializes the ArrayList with set items
    public static void initialize(ArrayList<String> list)
    {
        // Remove all elements from the ArrayList, if any
        list.clear();
        
        // Add new items
        list.add("gummy worm");
        list.add("gummy worm");
        list.add("pickle chip");
        list.add("pickle chip");
        list.add("rainbow pretzel");
        list.add("rainbow pretzel");
        list.add("rainbow pretzel");
        list.add("choco donut");
        list.add("pickle chip");
        list.add("pickle chip");
        list.add("gummy worm");
    }

    // Removes elements from the list using a forward loop
    // This method may skip elements due to shifting indexes
    public static void removeForward(ArrayList<String> list, String target)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).equals(target))
            {
                list.remove(i);
                i--;   // step back to check the shifted element
            }
        }
    }

    // Removes elements from the list using a backward loop
    // This method avoids skipping elements by starting from the end
    public static void removeBackward(ArrayList<String> list, String target)
    {
        for (int i = list.size() - 1; i >= 0; i--)
        {
            if (list.get(i).equals(target))
            {
                list.remove(i);
            }
        }
    }

    // Prints out each item in the list
    public static void printList(ArrayList<String> list)
    {
        for (String item : list)
        {
            System.out.println(item);
        }
        System.out.println();
    }
}
