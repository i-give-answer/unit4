public class Theater
{
    public static void main(String[] args)
    {
        // Create a 10x10 seating chart
        SeatingChart chart = new SeatingChart(10, 10);
        
        // Reserve seats for a few customers
        chart.reserveSeat(0, 1, "Adriana"); 
        chart.reserveSeat(1, 2, "Mayu");
        chart.reserveSeat(6, 8, "Alisa");
        
        // Check for seat availability
        System.out.println(chart.getSeatInfo(0, 1)); 
        System.out.println(chart.getSeatInfo(1, 2)); 
        System.out.println(chart.getSeatInfo(2, 2)); 
    }
}

//_____________________________________________________________________
public class SeatingChart
{
    // Create instance variable:
    private String [][] seats;
    
    

    public SeatingChart(int rowCount, int colCount)
    {
        // Complete constructor
        seats = new String[rowCount][colCount];
        
    }

    // Reserves seat with name if it is available
    public void reserveSeat(int row, int col, String name)
    {
        // Complete this method
        if (seats[row][col] == null)
        {
            seats[row][col] = name;
        }
        else System.out.println("Seat already reserved");
    }

    // Returns information about the seat availability
    public String getSeatInfo(int row, int col)
    {
        // Complete this method
        if (seats[row][col] == null)
        {
            return "Seat is available";
        }
        else
        {
            return "Seat is reserved by " + seats[row][col];
        }
        
    }
}
