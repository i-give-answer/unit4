//Reading Files and Arrays

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class StudentNamesRunner
{
    public static void main(String[] args)
    {
        // Read students from file
        String[] students = new String[50];
        
        try
        {
            File file = new File("StudentNames.txt");
            Scanner input = new Scanner(file);
            int index = 0;
            
            while (input.hasNext())
            {
                String name = input.nextLine();
                students[index] = name;
                index++;
            }
            input.close();
        }
        catch (IOException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }
        
        // Test the mystery method
        mystery(students, "Maya");
        
        // Optional test with a hard-coded array
        String[] testStudents = {"Alice", "Bob", "Amanda", "Michael", "Alex", null, ""};
        System.out.println("Number of students whose name starts with A: " + 
                            firstNameLetter(testStudents, "A")); // Output: 3
    }
    
    // Prints all names that contain a specific string and counts names starting with A
    public static void mystery(String[] arr, String name)
    {
        for (String item : arr)
        {
            if (item != null && item.contains(name))
            {
                System.out.println(name);
            }
        }

        // Use the same array passed in
        System.out.println("Number of students whose name starts with A: " + firstNameLetter(arr, "A"));
    }
    
    // Counts how many names start with a specific letter
    public static int firstNameLetter(String[] arr, String letter)
    {
        int count = 0;
        String upperLetter = letter.toUpperCase();
        
        for(String item : arr) 
        {
            if (item != null && item.length() > 0 && item.substring(0, 1).toUpperCase().equals(upperLetter))
            {
                count++;
            }
        }
        return count;
    }
}
