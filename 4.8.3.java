import java.util.ArrayList;

public class ArrayListMethods
{
    public static void main(String[] args) 
    {
        ArrayList<String> fruit = new ArrayList<String>();
        
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Cherry");

        System.out.println("Elements in the list: " + fruit);
        
        if (fruit.add("Mango")) 
        {
            System.out.println("I am adding mangoes. They are my favorite!");
        }
        
        System.out.println("There are " + fruit.size() + " elements in the list now: " + fruit);
        
        fruit.add(1, "Blueberry");
        fruit.add(3, "Passionfruit");
        System.out.println("There are " + fruit.size() + " elements in the list now: " + fruit);
        
        fruit.remove(2);
        System.out.println("There are " + fruit.size() + " elements in the list now: " + fruit);
        
        //Add another fruit to the END
        fruit.add("Strawberry");
        
        //Add another fruit at index 4
        fruit.add(4, "Pineapple");
        
        //Print updated size
        System.out.println("Updated size: " + fruit.size());
        
        //Remove least favorite fruit by index (example: remove index 0)
        fruit.remove(0);
        
        //Final list after all changes
        System.out.println("Final list: " + fruit);
    }
}
