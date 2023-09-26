package nsteps;

import org.example.nsteps.NStepsProblem;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class NStepsProblemTests {
    @Test
    public void shouldReturnCorrectAnswer() {
        List<List<Integer>> completeAnswer = new LinkedList<>();

        List<Integer> firstRow = new LinkedList<>();
        firstRow.add(1);
        firstRow.add(1);
        firstRow.add(1);
        firstRow.add(1);
        completeAnswer.add(firstRow);

        List<Integer> secondRow = new LinkedList<>();
        secondRow.add(1);
        secondRow.add(1);
        secondRow.add(2);
        completeAnswer.add(secondRow);

        List<Integer> thirdRow = new LinkedList<>();
        thirdRow.add(1);
        thirdRow.add(2);
        thirdRow.add(1);
        completeAnswer.add(thirdRow);

        List<Integer> fourthRow = new LinkedList<>();
        fourthRow.add(2);
        fourthRow.add(1);
        fourthRow.add(1);
        completeAnswer.add(fourthRow);

        List<Integer> fifthRow = new LinkedList<>();
        fifthRow.add(2);
        fifthRow.add(2);
        completeAnswer.add(fifthRow);

        List<Integer> possibleSteps = new LinkedList<>();
        possibleSteps.add(1);
        possibleSteps.add(2);
        Integer numberOfStairs = 4;
        NStepsProblem nStepsProblem = new NStepsProblem(possibleSteps, numberOfStairs);
        nStepsProblem.initialValuesCheckAndDataPrepare();
        nStepsProblem.startAlgorithm();

        List<List<Integer>> finalAnswer = new LinkedList<>();
        finalAnswer = nStepsProblem.returnListOfValidSteps();

        assertTrue(finalAnswer.size() == completeAnswer.size() && finalAnswer.containsAll(completeAnswer) && completeAnswer.containsAll(finalAnswer));
    }

}
