import java.util.Scanner;

public class FantasyFootballRunner 
{
    public static void main(String[] args)
    {
        FantasyFootballTeam team = new FantasyFootballTeam();
        
        Scanner input = new Scanner(System.in);
    
        // Continually get user input until user stops
        while(true)
        {
            // Get player name
            System.out.println("Enter name of player to add (type 'stop' to finish): ");
            String player = input.nextLine();

            // Exit if user types stop
            if (player.equals("stop"))
            {
                break;
            }

            // Try to add the player
            team.addPlayer(player);
        }

        System.out.println("\nFinal team roster:\n" + team);
    }
}

//_______________________________________________________________________
import java.util.ArrayList;

public class FantasyFootballTeam
{   
    private ArrayList<String> team; // User's team roster
    private ArrayList<String> availablePlayers; // Players to choose from
    public static final int MAX_TEAM_SIZE = 5; // User team size max
    
    public FantasyFootballTeam()
    {
        team = new ArrayList<String>();
        availablePlayers = new ArrayList<String>();

        // Adding available players. Feel free to add names
        // of your favorite players to this list! But make
        // sure you DON'T remove any players from it!
        availablePlayers.add("Josh Allen");
        availablePlayers.add("Jonathan Taylor");
        availablePlayers.add("Breece Hall");
        availablePlayers.add("Patrick Mahomes");
        availablePlayers.add("Saquon Barkley");
        availablePlayers.add("CeeDee Lamb");
        availablePlayers.add("AJ Brown");
        availablePlayers.add("Travis Kelce");
        availablePlayers.add("Baker Mayfield");
        availablePlayers.add("Marvin Harrison Jr.");
        availablePlayers.add("Justin Jefferson");
        availablePlayers.add("Jahmyr Gibbs");
        availablePlayers.add("Alvin Kamara");
        availablePlayers.add("Mike Evans");
        availablePlayers.add("Aaron Rodgers");
    }
    
    // Add player to team if team is less than max team size
    public void addPlayer(String player)
    {
        // Complete method
        if (team.size() >= MAX_TEAM_SIZE)
        {
            System.out.println("Your team already has " + MAX_TEAM_SIZE + "players.");
            return;
        }
        int index = checkAvailability(player);
        
        if (index == -1)
        {
            System.out.println(player + " is not available.");
            return;
        }
        
        team.add(availablePlayers.get(index));
        availablePlayers.remove(index);
        System.out.println("Succesfully added " + player + ".");
    }

    // Returns the index of an available player or -1 if the player is not available
    public int checkAvailability(String player)
    {
        // Complete method
        for (int i = 0; i < availablePlayers.size(); i++)
        {
            if (availablePlayers.get(i).equalsIgnoreCase(player))
            {
                return i;
            }
        }
        return -1;
    }

    // Returns team size
    public int getTeamLength()
    {
        return team.size();
    }

    // Prints the team's roster
    public String toString()
    {
        String output = "";

        for (String player : team)
        {
            output += " * " + player + "\n";
        }

        return output;
    }
}
