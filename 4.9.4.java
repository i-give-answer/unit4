import java.util.ArrayList;

public class TaskManager
{
    public static void main(String[] args)
    {
        // Create and populate the task list
        ArrayList<String> tasks = new ArrayList<String>();
        tasks.add("Sleep In");
        tasks.add("Clean");
        tasks.add("Clean");
        tasks.add("Study");
        tasks.add("Exercise");
    
        // Print all tasks
        for (int i = 0; i < tasks.size(); i++)
        {
            System.out.println("Task " + i + ": " + tasks.get(i));
        }

        // Add a new task if "Study" is found
        for (int i = 0; i < tasks.size(); i++)
        {
            if (tasks.get(i).equals("Study"))
            {
                tasks.add("Treat yourself with some ice cream");
            }
        }

        // Remove a task if it is "Sleep In"
        for (int i = tasks.size() - 1; i >= 0; i--)
        {
            if (tasks.get(i).equals("Sleep In"))
            {
                tasks.remove(i);
            }
        }

        // Check if task descriptions are long
        for (int i = 0; i < tasks.size(); i++)
        {
            String task = tasks.get(i);
            if (task.length() > 10)
            {
                System.out.println("\n" + task + " is a long task");
            }
        }

        // Remove tasks labeled "Clean"
        for (int i = tasks.size() - 1; i >= 0; i--)
        {
            if (tasks.get(i).equals("Clean"))
            {
                tasks.remove(i);
            }
        }

        // Print the final task list
        System.out.println("\nFinal task list: " + tasks);
    }
}
