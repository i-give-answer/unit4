import java.util.ArrayList;

public class AirlineTicketRunner
{
    public static void main(String[] args)
    {
        // Create an ArrayList to store AirlineTicket objects
        ArrayList<AirlineTicket> tickets = new ArrayList<AirlineTicket>();

        // Add randomized passengers to the tickets list
        addPassengers(tickets);

        // Display the list of all passengers with their seat, row, and boarding group
        System.out.println("Passengers in Line:");
        for (AirlineTicket elem : tickets)
        {
            System.out.println(elem);
        }

        // Create a TicketOrganizer object to manage boarding logic
        TicketOrganizer ticketOrganizer = new TicketOrganizer(tickets);

        // Display passengers grouped by boarding group
        System.out.println("\nPassengers Ordered by Boarding Group:");
        ticketOrganizer.printPassengersByBoardingGroup();

        // Check if any passengers in line can board together
        System.out.println("\nPassengers in line who can board together:");
        ticketOrganizer.canBoardTogether();
    }

    // Adds 15 randomized AirlineTicket objects to the list.
    // Each passenger is assigned a random seat, row, and boarding group.
    public static void addPassengers(ArrayList<AirlineTicket> ticketList)
    {
        // Retrieve a COPY of the valid seat letters from AirlineTicket
        String[] seats = AirlineTicket.getSeatLetters();
    
        for (int i = 0; i < 15; i++)
        {
            int randomIndex = (int) (Math.random() * seats.length);
            String seatLetter = seats[randomIndex];
    
            AirlineTicket ticket = new AirlineTicket(
                "Passenger " + (i + 1),
                seatLetter,
                (int) (Math.random() * 5) + 1,   // Boarding group 1‒5
                (int) (Math.random() * 8) + 1    // Row 1‒8
            );
    
            ticketList.add(ticket);
        }
    }
}


//____________________________________________________________________________
public class AirlineTicket
{
    // One shared, unchangeable list for the entire class
    private static final String[] SEATS = {"A", "B", "C", "D", "E", "F"};

    // Instance variables for passenger information
    private String name;
    private String seat;
    private int boardingGroup;
    private int row;

    // Constructor initializes all ticket information
     public AirlineTicket(String passengerName, String requestedSeat, int group, int seatRow)
    {
        name = passengerName;
        boardingGroup = group;
        row = seatRow;
        
        // Only assigns if requested seat is valid, otherwise generates new seat
        if (isValidSeat(requestedSeat))
        {
            seat = requestedSeat;
        }
        else // auto-correct the bad input
        {
            int r = (int) (Math.random() * SEATS.length);
            seat = SEATS[r];
        }
    }

    // Helper method to check if a seat letter is valid
    private boolean isValidSeat(String seat)
    {
        for (String elem : SEATS)
        {
            if (seat.equals(elem))
            {
                return true;
            }
        }
        return false;
    }
    
    // Returns a copy of SEATS so that it cannot be changed outside
    // of the class
    public static String[] getSeatLetters()
    {
        String[] copy = new String[SEATS.length];
        for (int i = 0; i < SEATS.length; i++)
        {
            copy[i] = SEATS[i];
        }
        return copy;
    }

    // Returns the seat letter
    public String getSeat()
    {
        return seat;
    }

    // Returns the passenger's name
    public String getName()
    {
        return name;
    }

    // Returns the boarding group number
    public int getBoardingGroup()
    {
        return boardingGroup;
    }

    // Returns the row number
    public int getRow()
    {
        return row;
    }

    // Returns a string representation of the ticket details
    public String toString()
    {
        return name + " Seat: " + seat + " Row: " + row + " Boarding Group: " + boardingGroup;
    }
}
