public class ArrayExploration
{
    public static void main(String[] args)
    {
        // Creating an integer array with default values (0 for int)
        int[] numbers = {10, 20, 30};

        // Setting a new value using an index
        numbers[1] = 99;
        numbers[2] = 999;

        // Accessing and printing values
        System.out.println("Integer Array (length of " + numbers.length + "):");
        System.out.println("Index 0: " + numbers[0]);
        System.out.println("Index 1: " + numbers[1]);
        System.out.println("Index 2: " + numbers[2]);

        // Creating a string array with explicit initialization
        String[] words = new String[2];
        
        // Setting values using indexes
        words[0] = "Hello";
        words[1] = "World";

        // Accessing and printing values
        System.out.println("\nString Array(length of " + words.length + "):");
        System.out.println("Index 0: " + words[0]);
        System.out.println("Index 1: " + words[1]);
        
        double[] scores = {3.4, 9.1, 3.3, 4.2};
        System.out.println("Index 0: " + scores[0]);
        System.out.println("Index 1: " + scores[1]);
        System.out.println("Index 2: " + scores[2]);
        System.out.println("Index 3: " + scores[3]);
        
        boolean[] statuses = new boolean[3];
        statuses[1] = true;
        System.out.println("Index 0: " + statuses[0]);
        System.out.println("Index 1: " + statuses[1]);
        System.out.println("Index 2: " + statuses[2]);
        
        
    }
}
