public class BasketballStatsRunner
{
    public static void main(String[] args)
    {
        // Create an array of Player objects using sample data
        Player[] players = {
            new Player("LeBron", "James", "39", "25.7", "7.3"),
            new Player("Stephen", "Curry", "36", "29.5", "6.1"),
            new Player("Nikola", "Jokić", "29", "26.4", ""),
            new Player("Kevin", "Durant", "35", "28.3", "7.4"),
            new Player("Jayson", "Tatum", "27", "", "8.1"),
            new Player("Luka", "Dončić", "25", "33.9", "")
        };

        // Print out each player's information
        for (Player player : players)
        {
            System.out.println(player);
        }

        // Print summary stats (average PPG and top scorer)
        Player.printOverallStats();
    }
}

//____________________________________________________________________
public class Player
{
    // Instance variables: data for each individual player
    private String firstName;
    private String lastName;
    private Integer age;
    private Double pointsPerGame;
    private Double reboundsPerGame;
    
    
    
    // Static variables: shared across all Player objects
    private static double totalPoints = 0;
    private static int validPointCount = 0;
    private static String topScorer = "";
    private static double highestPPG = 0;
    
    
    // Constructor: builds a Player object and processes stats
    public Player (String first, String last, String ageValue, String ppgValue, String rpgValue)
    {
        firstName = first;
        lastName = last;
        
        if (ageValue.length() > 0)
            age = Integer.parseInt(ageValue);
            
        if (ppgValue.length() > 0)
            pointsPerGame = Double.parseDouble(ppgValue);
        
        if (rpgValue.length() > 0)
            reboundsPerGame = Double.parseDouble(rpgValue);
            
        recordStats();
    }
    
    

    // Complete recordStats method that updates shared stats
    // for all players:
    private void recordStats()
    {
        if (pointsPerGame != null)
        {
            totalPoints += pointsPerGame;
            validPointCount++;

            if (pointsPerGame > highestPPG)
            {
                highestPPG = pointsPerGame;
                topScorer = getFullName();
            }
        }
    }
    
    
    

    /// ~~ Getters for player data ~~ //
    
    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public Integer getAge()
    {
        return age;
    }

    public Double getPointsPerGame()
    {
        return pointsPerGame;
    }

    public Double getReboundsPerGame()
    {
        return reboundsPerGame;
    }

    /**
     * Prints out a player's information. If there is a missing
     * data point, then it prints "No Data" for that field.
     */ 
    public String toString()
    {
        String message = getFullName();

        if (getAge() != null)
        {
            message += ", Age: " + getAge();
        }
        else
        {
            message += ", Age: No Data";
        }

        if (getPointsPerGame() != null)
        {
            message += ", PPG: " + getPointsPerGame();
        }
        else
        {
            message += ", PPG: No Data";
        }

        if (getReboundsPerGame() != null)
        {
            message += ", RPG: " + getReboundsPerGame();
        }
        else
        {
            message += ", RPG: No Data";
        }

        return message;
    }


    // Static method to print summary stats for all players
    public static void printOverallStats()
    {
        System.out.println();

        // Calculate and print average PPG for all players
        if (validPointCount > 0)
        {
            double average = totalPoints / validPointCount;
            // Round to the 10th
            average = Math.round(average * 10) / 10.0;
            System.out.println("Average PPG (of " + validPointCount + " players): " + average);
        }
        else
        {
            System.out.println("Average PPG: No Data");
        }

        // Print the highest PPG among the players 
        if (highestPPG > 0)
        {
            System.out.println("Top Scorer: " + topScorer + " with " + highestPPG + " PPG");
        }
        else
        {
            System.out.println("Top Scorer: No Data");
        }
    }
}
