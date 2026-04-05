import java.util.ArrayList;

public class MusicPlaylist
{
    public static void main(String[] args)
    {
        // Create a playlist and add classic rock songs
        ArrayList<String> playlist = new ArrayList<String>();

        playlist.add("Bohemian Rhapsody");
        playlist.add("Sweet Child O' Mine");

        // Replace index 1 with Stairway
        playlist.set(1, "Stairway to Heaven");

        playlist.add("Smoke on the Water");
        playlist.add("Back in Black");

        // Remove Stairway to Heaven
        playlist.remove(1);

        playlist.add("Born to Run");
        playlist.add("Dream On");

        // Display the playlist and information about it
        System.out.println("Playlist: \n" + playlist + "\n");
        System.out.println("Now playing: " + playlist.get(3));
        System.out.println("Total songs: " + playlist.size());
    }
}
