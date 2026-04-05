//Best Men's Soccer Players: Reading Files and Arrays

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class PlayerRunner
{
    public static void main(String[] args)
    {
        // Create array for top 30 players
        String[] players = new String[30];

        // Read Players.txt into the array using try-catch
        try
        {
            File file = new File("Players.txt"); // capitalize File
            Scanner scan = new Scanner(file);
            int index = 0;

            while(scan.hasNext()) // no semicolon here
            {
                String line = scan.nextLine();
                players[index] = line;
                index++;
            }

            scan.close();
        }
        catch (IOException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }

        // Test the countryNumPlayers method
        int numArgentina = countryNumPlayers(players, "Argentina");
        System.out.println("Total players from Argentina: " + numArgentina);

        int numBrazil = countryNumPlayers(players, "Brazil");
        System.out.println("Total players from Brazil: " + numBrazil);
    }

    // Method to print players from a specific country and return total number
    public static int countryNumPlayers(String[] arr, String country)
    {
        int count = 0;
        for(String player : arr)
        {
            if(player != null && player.toLowerCase().endsWith(country.toLowerCase()))
            {
                System.out.println(player);
                count++;
            }
        }
        return count;
    }
}
