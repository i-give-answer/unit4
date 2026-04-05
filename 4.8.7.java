public class ClassListRunner
{
    public static void main(String[] args)
    {
        // Create an instance of the Roster class
        Roster myRoster = new Roster();

        // Use the instance methods to add students
        myRoster.addStudent("Alan", 11);
        myRoster.addStudent("Alex", 10);
        myRoster.addStudent("Anita", 12);

        // Print the list of student names using an instance method
        System.out.println(myRoster.getClassList());
    }
}

//__________________________________________________________________________
import java.util.ArrayList;

public class Roster 
{
    
    // Declare Student ArrayList variable
    private ArrayList<Student> classList;
    
    public Roster()
    {
        // Initialize Arraylist variable (and allocate memory)
        // with a new student arraylist
        classList = new ArrayList<Student>();
        
        
    }
    
    // Creates new student object and adds to class list
    public void addStudent(String name, int grade)
    {
        // Complete this method
        Student newStudent = new Student (name, grade);
        classList.add(newStudent);
        
    }
    
    /**
     * Don't change the code in this method!
     * This method will print out all the Student names
     * in the classList Array.
     */
    public String getClassList()
    {
        String names = "";
        for (Student name: classList)
        {
            names+= name.getName() + "\n";
        }
        return "Student Class List:\n" + names;
    }
    
}

//________________________________________________________________________
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
