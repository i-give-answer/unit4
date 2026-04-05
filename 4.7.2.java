public class GymLiftsRunner
{
    public static void main(String[] args)
    {
        GymLifts weights = new GymLifts(183, 90, 220);

        Double percent = null;
        weights.printSquatVolumeWorkout(percent);

        double lightPercent = 0.50;
        weights.printSquatVolumeWorkout(lightPercent);

        double newBench = 100;
        weights.setBench(newBench);

        Double newMax = newBench + 5;
        weights.setBench(newMax);

        Integer totalWeight = 180;
        System.out.println("\nWeight to add to each side of the barbell: " 
            + weights.computePlateWeight(totalWeight) + " lbs");
    }
}

//______________________________________________________________________________
public class GymLifts
{
    private double maxSquat;
    private double maxBench;
    private double maxDeadlift;
    
    public GymLifts(double squat, double bench, double deadlift)
    {
        maxSquat = squat;
        maxBench = bench;
        maxDeadlift = deadlift;
    }
    
    public void printSquatVolumeWorkout(Double percentage)
    {
        if (percentage != null) {
            double weight = ((int)(maxSquat * percentage * 100)) / 100.0;
            System.out.println("Squats: 6 sets x 3 reps at " + weight + " lbs");
        } else {
            System.out.println("Error: No percentage provided!");
        }
    }

    public int computePlateWeight(Integer weight)
    {
        return (weight - 45) / 2;
    }

    public void setBench(double newMax)
    {
        maxBench = newMax;
    }
}
