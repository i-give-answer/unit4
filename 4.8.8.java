public class ClassListRunner
{
    public static void main(String[] args)
    {
        // You don't need to change anything here, but feel free to add more students!
        Roster myRoster = new Roster();

        myRoster.addStudent("Alan", 11);
        myRoster.addStudent("Alex", 10);
        myRoster.addStudent("Anita", 12);

        System.out.println(myRoster.getClassList());

        System.out.println("Last Student: " + myRoster.getLastStudentName());
        System.out.println("First Student: " + myRoster.getStudentName(0));
        System.out.println("Fourth Student: " + myRoster.getStudentName(3));

        System.out.println();

        myRoster.addStudent(2, "Trevor", 12);
        System.out.println(myRoster.getClassList());
        System.out.println("Class Size: " + myRoster.getClassSize());
    }
}

//____________________________________________________________________________________
import java.util.ArrayList;

public class Roster
{
    // ==============================
    // Instance variable
    // ==============================
    private ArrayList<Student> classList;


    // ==============================
    // Constructor
    // ==============================
    public Roster()
    {
        classList = new ArrayList<Student>();
    }


    // ==============================
    // Original addStudent (adds to end)
    // ==============================
    public void addStudent(String name, int grade)
    {
        classList.add(new Student(name, grade));
    }


    // ==============================
    // Overloaded addStudent
    // adds at specific index
    // ==============================
    public void addStudent(int index, String name, int grade)
    {
        if (index >= 0 && index <= classList.size())
        {
            classList.add(index, new Student(name, grade));
        }
        else
        {
            System.out.println("Invalid index");
        }
    }


    // ==============================
    // Returns name at index
    // ==============================
    public String getStudentName(int index)
    {
        if (index >= 0 && index < classList.size())
        {
            return classList.get(index).getName();
        }
        else
        {
            return "Invalid index";
        }
    }


    // ==============================
    // Returns last student name
    // ==============================
    public String getLastStudentName()
    {
        if (classList.size() > 0)
        {
            return classList.get(classList.size() - 1).getName();
        }
        else
        {
            return "No students in roster";
        }
    }


    // ==============================
    // Returns list size
    // ==============================
    public int getClassSize()
    {
        return classList.size();
    }


    // ==============================
    // Provided method (unchanged)
    // ==============================
    public String getClassList()
    {
        String names = "";
        for (Student s : classList)
        {
            names += s.getName() + "\n";
        }
        return "Student Class List:\n" + names;
    }
}


//_______________________________________________________________
public class Student
{
    /*
     * This class is complete. You do not need
     * to add anything.
     */
    private String name;
    private int grade;
    
    public Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
    }
    
    public String getName()
    {
        return this.name;
    }
}
