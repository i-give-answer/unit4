import java.util.ArrayList;

public class EarningsAnalysisRunner
{
    public static void main(String[] args)
    {
        ArrayList<Double> babysittingTotals = new ArrayList<Double>();
        
        // Adds to babysittingTotals
        babysittingTotals.add(15.50);
        babysittingTotals.add(19.00);
        babysittingTotals.add(23.00);
        babysittingTotals.add(25.00);
        babysittingTotals.add(32.50);
        babysittingTotals.add(40.00);
        babysittingTotals.add(55.50);
        babysittingTotals.add(70.50);
        
        System.out.println("Original List of Earnings: ");
        System.out.println(babysittingTotals);
        
        //Test your findAverage method: 
        System.out.println("Average earnings: " + EarningsAnalysis.findAverage(babysittingTotals));
        
        //Test your greaterThanNum method
        double total = 50.00;
        System.out.println("Number of babysitting jobs earning above " + total + ": " + EarningsAnalysis.greaterThanNum(babysittingTotals, total));
        
        
        //Test your insertInOrder method
        EarningsAnalysis.insertInOrder(babysittingTotals, 12.00);
        System.out.println("Updated babysitting earnings data: " + babysittingTotals);
    }
}

//____________________________________________________________________________________________________
import java.util.ArrayList;

public class EarningsAnalysis
{
    // Calculates and returns the total sum of all elements in the list.
    // This method adds up all the babysitting earnings stored in the ArrayList.
    public static double findAverage(ArrayList<Double> list)
    {
        if(list.size() == 0)
        {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < list.size(); i++)
        {
            sum += list.get(i);
        }
        return sum / list.size();
    }

    // Creates and returns a new list containing only the values greater than a given number.
    // This method filters the original list to show which babysitting jobs earned more than the given amount.
    public static int greaterThanNum(ArrayList<Double> list, double num)
    {
        int count = 0;
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) > num)
            {
                count++;
            }
        }
        return count;
    }

    // Inserts a value into a list that is assumed to already be sorted in ascending order.
    // The method places the new number between two elements if it fits within that range.
    // Note: This version does not handle inserting at the beginning or end of the list.
    public static void insertInOrder(ArrayList<Double> list, double num)
    {
        if (list.size() == 0)
        {
            list.add(num);
            return;
        }
        
        if(num <= list.get(0))
        {
            list.add(0, num);
            return;
        }
        
        if (num >= list.get(list.size()-1))
        {
            list.add(num);
            return;
        }
        
        for (int i = 0; i < list.size() - 1; i++)
        {
            double currentNum = list.get(i);
            double nextNum = list.get(i + 1);

            // Insert the number if it fits between two existing values
            if (num >= currentNum && num <= nextNum)
            {
                list.add(i + 1, num);
                return;
            }
        }
    }
}
