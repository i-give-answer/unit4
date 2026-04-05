//Exam Grades

public class ExamGradesRunner
{
    public static void main(String[] args) 
    {
        int[] studentGrades = {55, 70, 85, 90, 45};

        // Create new ExamGrades object with student grades array
        // and passing rate of 60:
        ExamGrades exam = new ExamGrades(studentGrades, 60);

        // Print out results of at least one student passing method:
        System.out.print("At least one student passed: " + exam.hasAtLeastOnePass());
        
        // Print out results of all students passing method:
        System.out.println("All students passed: " + exam.areAllPassing());
    
    }
}

//________________________________________________________________________________________
/**
 * The ExamGrades class represents a list of student grades and provides methods
 * to determine if at least one student passed and if all students passed the course.
 */
public class ExamGrades 
{
    private int[] grades;
    private int passing;

    // Constructor with an integer array of student grades and
    // the minimum % needed to pass the exam
    public ExamGrades(int[] studentGrades, int passingPercent) 
    {
        // Creates a copy of the array parameter so that the object
        // holds a copy of the array in its attribute, not the 
        // original one used as the argument
        grades = new int[studentGrades.length];
        for (int i = 0; i < studentGrades.length; i++)
        {
            grades[i] = studentGrades[i];
        }

        passing = passingPercent;
    }

    // Determines if at least one student passed the course.
    public boolean hasAtLeastOnePass() 
    {
        // Complete this method
        for (int grade : grades)
        {
            if(grade >= passing)
            {
                return true;
            }
        }
        return false;
    }


    // Determines if all students passed the course.
    public boolean areAllPassing() 
    {
        // Complete this method
        for (int grade : grades)
        {
            if(grade < passing)
            {
                return false;
            }
        }
        return true;
        
    }
}
