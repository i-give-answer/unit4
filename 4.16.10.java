public class TraverseString
{
    public static void main(String[] args)
    {
        // Call your traverse method here!
        traverse("recursion", 0);
        
    }

    public static void traverse(String string, int index)
    {
        // Base Case
        if (index == string.length())
        {
            return;
        }
        // Access an individual letter and print it out
        System.out.println(string.charAt(index));
        
        // Recursive call
        traverse(string, index + 1);
    }
}
