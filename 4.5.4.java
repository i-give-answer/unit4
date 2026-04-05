//Reverse Playlist

public class PlaylistRunner
{
    public static void main(String[] args)
    {
        String[] mySongs = {"Song A", "Song B", "Song C", "Song D", "Song E"};
        
        // Create playlist object with array of songs:
        Playlist playlist = new Playlist(mySongs);
        


        // Print out original list of songs:
        System.out.println("Original Playlisy:");
        System.out.println(playlist);


        // Reverse and print out new order of songs:
        playlist.reverse();
        System.out.println("Reversed Playlist:");
        System.out.println(playlist);
    }
}

//______________________________________________________________________________________________
public class Playlist 
{
    private String[] songs;

    // Constructor that receives an array of strings
    public Playlist(String[] songList) 
    {
        // Creates a copy of the array parameter so that
        // changes to this attribute don't carry over to
        // the original array, mySongs
        songs = new String[songList.length];
        for (int i = 0; i < songList.length; i++)
        {
            songs[i] = songList[i];
        }
    }
    
    // Method to reverse the array of strings
    public void reverse() 
    {
        
        // Complete this method
        int left = 0;
        int right = songs.length - 1;
        
        while(left < right)
        {
            String temp = songs[left];
            songs[left] = songs[right];
            songs[right] = temp;

            left++;
            right--;
        }
        
    }

    // toString method that prints the array of strings
    public String toString() 
    {
        String printedSongs = "";

        for (String song : songs)
        {
            printedSongs += song + "\n";
        }
        return printedSongs;
    }
}
