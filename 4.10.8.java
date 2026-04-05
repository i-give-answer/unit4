import java.util.ArrayList;

public class DataPurgeRunner
{
    public static void main(String[] args)
    {
        ArrayList<String> members = new ArrayList<String>();
        addMembers(members);
        
        System.out.println("All names formatted correctly? " + DataPurge.correctlyFormatted(members));
        
        DataPurge.removeName(members, "Araceli Castaneda");
        DataPurge.removeDuplicates(members);
        System.out.println(members);
    }

    public static void addMembers(ArrayList<String> emails)
    {
        emails.add("London Braun");
        emails.add("Jaslyn Chavez");
        emails.add("Daphne Kane");
        emails.add("Aden Brock");
        emails.add("Jaime Wolf");
        emails.add("finley Wood");
        emails.add("Trent maynard");
        emails.add("Jaiden Krause");
        emails.add("London Braun");
        emails.add("Jaiden Krause");
        emails.add("Davon Mccormick");
        emails.add("JosieFreeman");
        emails.add("Jaslyn Chavez");
        emails.add("Zaiden Harding");
        emails.add("Araceli Castaneda");
        emails.add("Jaime Wolf");
        emails.add("London Braun");
    }
}


//___________________________________________________________
import java.util.ArrayList;

public class DataPurge
{
    // Removes duplicate names from the list.
    public static void removeDuplicates(ArrayList<String> members)
    {
        for (int i = 0; i < members.size(); i++)
        {
            for (int j = i + 1; j < members.size(); j++)
            {
                if (members.get(i).equals(members.get(j)))
                {
                    System.out.println("Duplicate " + members.get(j) + " removed");
                    members.remove(j);
                    j--; // adjust after removal
                }
            }
        }
    }

    // Removes all entries that match the target name
    public static void removeName(ArrayList<String> members, String name)
    {
        for (int i = members.size() - 1; i >= 0; i--)
        {
            if (members.get(i).equals(name))
            {
                System.out.println("Removing " + members.get(i));
                members.remove(i);
            }
        }
    }

    // Checks formatting rules
    public static boolean correctlyFormatted(ArrayList<String> members)
    {
        for (String name : members)
        {
            int spaceIndex = name.indexOf(" ");
    
            // must contain exactly one space
            if (spaceIndex == -1 || name.indexOf(" ", spaceIndex + 1) != -1)
                return false;
    
            String first = name.substring(0, spaceIndex);
            String last = name.substring(spaceIndex + 1);
    
            if (first.length() == 0 || last.length() == 0)
                return false;
    
            String firstLetter = first.substring(0, 1);
            String lastLetter = last.substring(0, 1);
    
            // use .equals() for comparison
            if (!firstLetter.equals(firstLetter.toUpperCase()) ||
                !lastLetter.equals(lastLetter.toUpperCase()))
                return false;
        }
    
        return true;
    }
}
