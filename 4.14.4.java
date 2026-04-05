import java.util.Scanner;

public class FindStudent
{
    public static void main(String[] args)
    {
        String[][] roster = {{"Julio", "Lauren", "James"},
							{"LaKesha", "Rachel", "Alex"},
                            {"Adam", "Paulina", "Reba"}, 
                            {"Shawn", "Kendrick", "Anna"}};	
        
        // Add your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a student name: ");
        String student = input.nextLine();

        int clubIndex = findStudent(roster, student);

        if (clubIndex != -1)
        {
            System.out.println("The student is in club index: " + clubIndex);
        }
        else
        {
            System.out.println("The student is not enrolled.");
        }

        input.close();
        
        
        
    }
    
    public static int findStudent(String[][] roster, String targetStudent)
    {
        // Complete this method
        for (int row = 0; row <roster.length; row++)
        {
            for (int col = 0; col < roster[row].length; col++)
            {
                if (roster[row][col].equalsIgnoreCase(targetStudent))
                {
                    return row;
                }
            }
        }
        return -1;
        
        
    }
}
