public class ChartRunner
{
    public static void main(String[] args)
    {
        Chart chart1 = new Chart(6, 6);

        // Use this space to call the chart methods in order
        // to debug the class
        chart1.setHorizontalNumbering();
        chart1.printChart();
        
        chart1.setVerticalNumbering();
        chart1.printChart();
    }
}

//______________________________________________________
public class Chart
{
    // Instance variable
    private int[][] chart;

    // Constructor to set the dimensions of the chart array
    public Chart(int rows, int cols)
    {
        // Initialize array with 0's as default values
        chart = new int[rows][cols];
    }

    // Sets the chart numbering so that they increase as the numbers
    // go across a single row (0, 1, 2...)
    public void setHorizontalNumbering()
    {
        for (int row = 0; row < chart.length; row++)
        {
            for (int col = 0; col < chart[row].length; col++)
            {
                chart[row][col] = col;
            }
        }
    }

    // Sets the chart numbering so that they increase as the numbers
    // go down a single column (0, 1, 2...)
    public void setVerticalNumbering()
    {
        for (int row = 0; row < chart.length; row++)
        {
            for (int col = 0; col < chart[row].length; col++)
            {
                chart[row][col] = row;
            }
        }
    }

    // Prints all of the contents of the chart
    public void printChart()
    {
        for (int[] row : chart)
        {
            for (int cell : row)
            {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
