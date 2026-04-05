import java.util.ArrayList;

public class EarningsAnalysisRunner
{
    public static void main(String[] args)
    {
        ArrayList<Double> babysittingTotals = new ArrayList<>();

        babysittingTotals.add(15.50);
        babysittingTotals.add(19.00);
        babysittingTotals.add(23.00);
        babysittingTotals.add(25.00);
        babysittingTotals.add(32.50);
        babysittingTotals.add(40.00);
        babysittingTotals.add(55.50);
        babysittingTotals.add(70.50);

        System.out.println("Original List of Earnings:");
        System.out.println(babysittingTotals);

        System.out.println("Total Earnings: "
                + EarningsAnalysis.calculateTotalEarnings(babysittingTotals));

        System.out.println("Above $50: "
                + EarningsAnalysis.filterAboveAmount(babysittingTotals, 50.0));

        EarningsAnalysis.removeBelowAmount(babysittingTotals, 22.0);

        System.out.println("After removing below $22:");
        System.out.println(babysittingTotals);
    }
}

//__________________________________________________________________________________________
import java.util.ArrayList;

public class EarningsAnalysis
{
    // Returns total of all earnings
    public static double calculateTotalEarnings(ArrayList<Double> earnings)
    {
        double total = 0;

        for (double amount : earnings)
        {
            total += amount;
        }

        return total;
    }

    // Returns only earnings above a threshold
    public static ArrayList<Double> filterAboveAmount(ArrayList<Double> earnings, double threshold)
    {
        ArrayList<Double> filteredEarnings = new ArrayList<>();

        for (double amount : earnings)
        {
            if (amount > threshold)
            {
                filteredEarnings.add(amount);
            }
        }

        return filteredEarnings;
    }

    // Removes earnings below a minimum
    public static void removeBelowAmount(ArrayList<Double> earningsList, double minimumAmount)
    {
        for (int i = earningsList.size() - 1; i >= 0; i--)
        {
            double currentAmount = earningsList.get(i);

            if (currentAmount < minimumAmount)
            {
                earningsList.remove(i);
            }
        }
    }
}
