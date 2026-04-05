import java.util.ArrayList;

public class LineOrderRunner
{
    public static void main(String[] args)
    {
        // Create an ArrayList to store student names
        ArrayList<String> lineOrder = new ArrayList<>();

        // Add 15 student names to the ArrayList
        lineOrder.add("John Smith");
        lineOrder.add("Emily Davis");
        lineOrder.add("Michael Johnson");
        lineOrder.add("Aisha Brown");
        lineOrder.add("David Wilson");
        lineOrder.add("Laura Martinez");
        lineOrder.add("James Anderson");
        lineOrder.add("Jessica Taylor");
        lineOrder.add("Jessica Walker");
        lineOrder.add("Chris Thomas");
        lineOrder.add("Amanda White");
        lineOrder.add("Julio Marquez");
        lineOrder.add("Emma Clark");
        lineOrder.add("Joshua Lewis");
        lineOrder.add("Olivia Robinson");
        
        System.out.println("Original order: ");
        printLineOrder(lineOrder);
        System.out.println("*************************");
        
        // Test your shiftLeft algorithm here
        ArrayList<String> shiftedLeft = LineOrderAlgorithms.shiftLeft(lineOrder);

        System.out.println("Shift Left Order:");
        printLineOrder(shiftedLeft);
        System.out.println("*************************");
        // Test your checkPairs algorithm here
        boolean pairCheck = LineOrderAlgorithms.checkPairs("Jessica Walker", "Chris Thomas", lineOrder);
        
        System.out.println("Are Jessica Walker and Chris Thomas next to each other?");
        System.out.println(pairCheck);
                
    }
    
    public static void printLineOrder(ArrayList<String> lineOrder)
    {
        for (int i = 0; i < lineOrder.size(); i++)
        {
            System.out.println(i+1 + ". " + lineOrder.get(i));
        }
    }
}

//___________________________________________________________________________________
import java.util.ArrayList;

public class LineOrderAlgorithms
{
    // Removes all instances of a specific student name from the list.
    // This is useful for removing a student from the line entirely.
    // If the student appears multiple times, each occurrence is removed.
    public static void removeStudent(ArrayList<String> list, String student)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).equals(student))
            {
                list.remove(i);
                i--; // Adjust the index so no elements are skipped after a removal
            }
        }
    }

    // Returns a new ArrayList with the order of students reversed.
    // The original list remains unchanged.
    // This could be useful if students need to line up in the opposite order.
    public static ArrayList<String> reverseOrder(ArrayList<String> list)
    {
        ArrayList<String> mysteryList = new ArrayList<String>();

        // Add elements from the end of the original list to the new list
        for (int i = list.size() - 1; i >= 0; i--)
        {
            mysteryList.add(list.get(i));
        }

        return mysteryList;
    }

    // Returns a new ArrayList where the last student is moved to the front,
    // and all other students shift one spot to the right.
    // This simulates one position of a right shift in line order.
    public static ArrayList<String> shiftRight(ArrayList<String> list)
    {
        ArrayList<String> newOrder = new ArrayList<String>();

        // Add all elements except the last one
        for (int i = 0; i < list.size() - 1; i++)
        {
            newOrder.add(list.get(i));
        }

        // Move the last student to the front of the new list
        newOrder.add(0, list.get(list.size() - 1));

        return newOrder;
    }

    // Write the shiftLeft method
    public static ArrayList<String> shiftLeft(ArrayList<String> list)
    {
        ArrayList<String> newOrder = new ArrayList<String>();
        for (int i = 1; i <list.size();i++)
        {
            newOrder.add(list.get(i));
        }
        
        newOrder.add(list.get(0));
        
        return newOrder;
    }

    // Write the checkPairs method
    public static boolean checkPairs(String name1, String name2, ArrayList<String> list)
    {
        for (int i=0; i < list.size()-1; i++)
        {
            String first = list.get(i);
            String second = list.get(i + 1);
            
            if ((first.equals(name1) && second.equals(name2)) || (first.equals(name2) && second.equals(name1)))
            {
                return true;
            }
        }
        return false;
    }
    
}
