import java.util.ArrayList;

public class LineOrderRunner
{
    public static void main(String[] args)
    {
        // Create an ArrayList to store the names of students in line order
        ArrayList<String> lineOrder = new ArrayList<>();

        // Add 15 student names to the ArrayList in the order they are currently standing in line
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

        // Print the original list of students in line
        System.out.println("Original order: ");
        printLineOrder(lineOrder);
        System.out.println("*************************");

        // Call Mystery Algorithm 1 to modify the line order based on a student's name
        LineOrderAlgorithms.removeStudent(lineOrder, "Jessica Taylor");
        System.out.println("Mystery Algorithm 1 output: ");
        printLineOrder(lineOrder);

        // Uncomment the following lines to test Mystery Algorithm 2
        lineOrder = LineOrderAlgorithms.reversedLineOrder(lineOrder);
        System.out.println("Mystery Algorithm 2 output: ");
        printLineOrder(lineOrder);

        // Uncomment the following lines to test Mystery Algorithm 3
        lineOrder = LineOrderAlgorithms.moveLastStudentToFront(lineOrder);
        System.out.println("Mystery Algorithm 3 output: ");
        printLineOrder(lineOrder);
    }

    // Prints the current order of students in line, one name per line with a number
    public static void printLineOrder(ArrayList<String> lineOrder)
    {
        for (int i = 0; i < lineOrder.size(); i++)
        {
            System.out.println(i + 1 + ". " + lineOrder.get(i));
        }
    }
}

//________________________________________________________________________________
import java.util.ArrayList;

public class LineOrderAlgorithms {

    public static void removeStudent(ArrayList<String> list, String studentName)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).equals(studentName))
            {
                list.remove(i);
                i--;
            }
        }
    }
    
    public static ArrayList<String> reversedLineOrder(ArrayList<String> list)
    {
        ArrayList<String> reversedList = new ArrayList<String>();
        
        for (int i = list.size() - 1; i >= 0; i--)
        {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    public static ArrayList<String> moveLastStudentToFront(ArrayList<String> list)
    {
        ArrayList<String> updatedList = new ArrayList<String>();
        
        for (int i = 0; i < list.size() -1 ; i++)
        {
            updatedList.add(list.get(i));
        }
        
        String lastStudent = list.get(list.size()-1);
        updatedList.add(0, lastStudent);
        
        return updatedList;
    }
}
