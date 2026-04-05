//Hospital Occupancy

public class HospitalRunner
{
    public static void main(String[] args)
    {
        // Create a hospital with the default number of rooms (4)
        Hospital myHospital = new Hospital();

        // Print initial room statuses
        myHospital.printRoomStatuses();

        // Admit patients to specific rooms
        myHospital.admitPatient(2);
        myHospital.admitPatient(3);
        myHospital.admitPatient(5);

        // Print room statuses
        myHospital.printRoomStatuses();

        // Try admitting a patient to an already occupied room
        myHospital.admitPatient(3);

        // Discharge patient from room 2
        myHospital.dischargePatient(2);

        // Print new room statuses
        myHospital.printRoomStatuses();
    }
}



//_____________________________________________________________________________________
public class Hospital
{
    // Instance variable
    private boolean[] rooms;

    // Basic constructor that initializes the array with 4 rooms
    public Hospital()
    {
        // Complete constructor
        rooms = new boolean[4];
    }

    // Complete admitPatient method
    
    public void admitPatient(int roomNumber)
    {
        if(roomNumber < 1 || roomNumber > 4 )
        {
            System.out.println("Invalid room number.");
            return;
        }
        int index = roomNumber -1;
        
        if (!rooms[index])
        {
            rooms[index] = true;
            System.out.println("Patient admitted to room " + roomNumber);
        }
        else
        {
            System.out.println("Room " + roomNumber + " is already occupied.");
        }
    }
    
    
    
    
    
    
    // Complete dischargePatient method
    public void dischargePatient(int roomNumber)
    {
        if(roomNumber < 1 || roomNumber > 4)
        {
            System.out.println("Invalid room number.");
            return;
        }
        
        int index = roomNumber -1;
        
        if (rooms[index])
        {
            rooms[index] = false;
            System.out.println("Room " + roomNumber + " is now available");
        }
        else
        {
            System.out.println("Room " + roomNumber + " is already empty.");
        }
        
    }
    
    
    
    
    
    

    // Print the occupation status for all four rooms
    public void printRoomStatuses()
    {
        System.out.println("\n== Room Statuses ==" +
            "\nRoom 1 Occupied: " + rooms[0] +
            "\nRoom 2 Occupied: " + rooms[1] +
            "\nRoom 3 Occupied: " + rooms[2] +
            "\nRoom 4 Occupied: " + rooms[3] + "\n");
    }
}
