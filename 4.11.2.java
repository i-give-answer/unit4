public class Gradebook
{
    public static void main(String[] args)
    {
        // Create individual quiz arrays
        //int[] quiz1 = {90, 87, 86, 56, 96};
        //int[] quiz2 = {65, 76, 87, 84, 93};
        //int[] quiz3 = {85, 56, 91, 90, 65};
        //int[] quiz4 = {70, 60, 78, 31, 65};

        // Create the gradebook
        int[][] gradebook = {
                {90, 87, 86, 56, 96},
                {65, 76, 87, 84, 93},
                {85, 56, 91, 90, 65},
                {70, 60, 78, 31, 65},
            };
        
        // Print the gradebook
        System.out.println("\tZara\tDiego\tMei\tOmar\tSaanvi");
        print2D(gradebook);
        
        // Access and print Mei's quiz 1 grade
        int grade = gradebook[0][2];
        System.out.println("\nMei's grade for quiz 1: " + grade);
        System.out.println("\nOmar's quiz 4 score: " + gradebook[3][3]);
        
        gradebook [2][1] = 68;
        System.out.println("Diego's updated quiz 3 score: " + gradebook[2][1]);
    }
    
    
    // This is a method to print the 2D array.
    // You will learn more about this in a future lesson!
    public static void print2D(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Quiz " + (i + 1) + ":\t");
            for (int num: array[i])
            {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
