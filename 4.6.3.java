//Karoke
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class KaraokeRunner
{
   public static void main(String[] args) throws IOException
   {
        // Create a File object
        File file = new File("Shake it Off.txt");
        
        // Create a Scanner object
        Scanner scan = new Scanner(file);
        
        // Use a while loop to access and print each line of the song
        while (scan.hasNext())
        {
            String line = scan.nextLine();
            System.out.println(line);
        }
        
        // Close the Scanner object
        scan.close();
   }
}

//__________________________________________________________________________
