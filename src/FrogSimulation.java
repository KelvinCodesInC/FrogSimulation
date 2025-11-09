public class FrogSimulation
{
    /** Distance, in inches, from the starting position to the goal. */
    private int goalDistance;
    private int position;
    /** Maximum number of hops allowed to reach the goal. */
    private int maxHops;

    /** Constructs a FrogSimulation where dist is the distance, in inches, from the starting
     * position to the goal, and numHops is the maximum number of hops allowed to reach the goal.
     * Precondition: dist > 0; numHops > 0
     */
    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }
    /** Returns an integer representing the distance, in inches, to be moved when the frog hops.
     */
    private int hopDistance()
    {
        return (int) (Math.random() * 20) - 10;
    }

    /** Simulates a frog attempting to reach the goal as described in part (a).
     * Returns true if the frog successfully reached or passed the goal during the simulation;
     * false otherwise.
     */
    public boolean simulate()
    {
        position = 0;

        for (int i = 0; i < maxHops; i++) {
            int distance = hopDistance();
            System.out.println("hop distance: " + distance);
            position += distance;
            System.out.println("Current Position: " + position);
            if (position >= goalDistance) return true;
            if (position < 0) return false;
        }
        return false;
    }


    /** Runs num simulations and returns the proportion of simulations in which the frog
     * successfully reached or passed the goal.
     * Precondition: num > 0
     */
    public double runSimulations(int num)
    {
        double numTrue = 0.0;

        for (int i = 0; i < num; i++) {
            if (simulate()) {
                numTrue += 1.0;
            }
        }
        return  numTrue/num;
    }
}
