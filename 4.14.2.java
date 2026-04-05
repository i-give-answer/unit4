import java.util.Scanner;

public class FruitSearch
{
    public static void main(String[] args)
    {
        String[] fruits = {"Lemon", "Apple", "Apricot", "Guava", "Fig", "Mango"};

        // Add your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a fruit: ");
        String  userFruit = input.nextLine();
        
        boolean found = findFruit(fruits, userFruit);
        if (found)
        {
            System.out.println("That fruit is in the list.");
        }
        else
        {
            System.out.println("That fruit is NOT in the list.");
        }
        input.close();
    }
    
    public static boolean findFruit(String[] list, String fruit)
    {
        // Complete this method
        for (int i = 0; i < list.length; i++)
        {
            if(list[i].equals(fruit))
            {
                return true;
            }
        }
        return false;
    }
}
