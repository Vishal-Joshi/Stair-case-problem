import junit.framework.TestCase;

/**
 * Created by vishal on 04/07/15.
 */
public class PermutationCalculatorTest extends TestCase {

    public void testShouldReturn1IfNumberOfStepsAre1(){
        PermutationCalculator calculator = new PermutationCalculator();
        int ways = calculator.calculateNumberOfPermutationsForSteps(1);
        assertEquals(1, ways);
    }

    public void testShouldReturn2IfNumberOfStepsAre2(){
        PermutationCalculator calculator = new PermutationCalculator();
        int ways = calculator.calculateNumberOfPermutationsForSteps(2);
        assertEquals(2, ways);
    }

    public void testShouldReturn3IfNumberOfStepsAre3(){
        PermutationCalculator calculator = new PermutationCalculator();
        int ways = calculator.calculateNumberOfPermutationsForSteps(3);
        assertEquals(3, ways);
    }

    public void testShouldReturn8IfNumberOfStepsAre5(){
        PermutationCalculator calculator = new PermutationCalculator();
        int ways = calculator.calculateNumberOfPermutationsForSteps(5);
        assertEquals(8, ways);
    }

}