public class XYPlotRunner
{
    public static void main(String[] args)
    {
        int[][] plot1 = {
            {1, 2},
            {2, 4},
            {3, 3},
            {2, 4},
            {5, 7},
            {6, 6},
            {7, 8},
            {8, 6},
            {9, 9},
            {10, 10}
        };

        // Create new XYPlot object
        XYPlot plot = new XYPlot(plot1);
        
        // Check to see if plot has duplicate coordinates
        System.out.println("Has duplicates: " + plot.hasDuplicates());
        System.out.println("All positive coordinates: " + plot.allPositive());
        
        // Check to see if all coordinates in plot are positive
        
        
        // Graph coordinates on X-Y plane
        plot.graphCoordinates();
        
    }
}


//____________________________________________________________________________________---
public class XYPlot 
{
    private int[][] plot;

    public XYPlot(int[][] plot)
    {
        // Allocate space for the instance variable
        this.plot = new int[plot.length][plot[0].length];

        // Copy in plot's values. This prevents the XYPlot class
        // from making changes to the original plot array
        for (int row = 0; row < plot.length; row++)
        {
            for (int col = 0; col < plot[0].length; col++)
            {
                this.plot[row][col] = plot[row][col];
            }
        }
    }

    // Check for any duplicate coordinates
    public boolean allPositive()
    {
        // Complete this method
        for (int[] point : plot)
        {
            if (point[0] < 0 || point [1] < 0)
            {
                return false;
            }
        }
        return true;
        
        
    }

    // Check if all X and Y coordinates are positive
    public boolean hasDuplicates()
    {
        // Complete this method
        
        for (int i = 0; i < plot.length; i++)
        {
            
            for (int j = i + 1; j < plot.length; j++)
            {
                if (plot[i][0] == plot[j][0] && plot[i][1] == plot[j][1])
                {
                    return true;
                }
            }
        }
        return false;
        
        
    }

    // Graph coordinates in postive X-Y plane
    public void graphCoordinates()
    {
        if (!allPositive())
        {
            System.out.println("Coordinates must be positive to graph.");
            return;
        }
        String[][] graph = {
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
        };

        // Complete this method
        
        
        for (int[] point : plot)
        {
            int x = point[0];
            int y = point[1];
            int row = 10 - y;
            int col = x;
            
            if (row >= 0 && row < graph.length && col >= 0 && col < graph[0].length)
            {
                graph[row][col] = "x";
            }
        }
        
        for (String[] r : graph)
        {
            for (String val : r)
            {
                System.out.print(val);
            }
        }
        
    }
}
