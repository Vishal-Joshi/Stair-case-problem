/**
 * Created by vishal on 04/07/15.
 */
public class PermutationCalculator {

    public int calculateNumberOfPermutationsForSteps(int steps){
        int waysToReachFromGroundStep = 1;
        return calculateNumberOfWaysToTakeTheStairsForStep(steps + waysToReachFromGroundStep);
    }

    private int calculateNumberOfWaysToTakeTheStairsForStep(int step){
        if(step<=1){
            return step;
        }
        return calculateNumberOfWaysToTakeTheStairsForStep(step-1)+calculateNumberOfWaysToTakeTheStairsForStep(step-2);
    }
}
