package org.example.nsteps;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * #####################
 *  PROBLEM:
 * #####################
 *  There's a staircase with N steps, and you can climb 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.
 *
 * For example, if N is 4, then there are 5 unique ways:
 *
 *     1, 1, 1, 1
 *     2, 1, 1
 *     1, 2, 1
 *     1, 1, 2
 *     2, 2
 *
 * What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time. Generalize your function to take in X.
 *
 * #####################
 *  MY SOLUTION:
 * #####################
 *
 * I solved this problem using recursion. First algorithm checks if the data is correct, then it sorts the step amount list from lowest to highest.
 * Algorithm takes current number of steps taken, number of steps to be taken and current steps amount history.
 * There are only three outcomes of climbing the stairs in the next step.
 *
 * #1 If we didn't reach the top continue climbing for every possible steps amount(#2, #3)
 * #2 If we overshoot (current stairs count + stairs to be climbed > total stairs) stop the algorithm
 * #3 If we reach the top, save current steps taken history.
 */
public class NStepsProblem {

    private final List<Integer> stepsAmountlist;

    private final Integer numberOfStairs;

    private String errorMessage = "";
    private List<List<Integer>> listOfPossibleCombinations = new LinkedList<>();
    public NStepsProblem(List<Integer> stepsAmountlist, Integer numberOfStairs) {
        this.stepsAmountlist = stepsAmountlist;
        this.numberOfStairs = numberOfStairs;
    }

    /**
     * Start the algorithm with initial values
     */
    public void startAlgorithm() {
        for (Integer listEntry: this.stepsAmountlist
             ) {
            this.findSolutions(0, listEntry, new LinkedList<>());
        }
    }

    /**
     * Recursively solve the problem
     * @param currentSum current amount steps taken
     * @param nextValue steps to be taken
     * @param stepsTaken steps taken so far
     */
    public void findSolutions(Integer currentSum, Integer nextValue, List<Integer> stepsTaken) {

        if (currentSum + nextValue < this.numberOfStairs) {
            stepsTaken.add(nextValue);
            currentSum += nextValue;
            for (Integer stepsAmount: this.stepsAmountlist
                 ) {
                List<Integer> copiedList = new LinkedList<>(stepsTaken);
                this.findSolutions(currentSum, stepsAmount, copiedList);
            }
        }

        else if (currentSum + nextValue > this.numberOfStairs) {
            System.out.println("Program stops working at: current steps: "+ Arrays.toString(stepsTaken.toArray()) + " current sum of steps = " + currentSum + " next numbers of steps to climb = " + nextValue);
        }

        else if (currentSum + nextValue == this.numberOfStairs) {
            stepsTaken.add(nextValue);
            listOfPossibleCombinations.add(stepsTaken);
        }

    }

    /**
     * Check the initial parameters and sort steps list
     */
    public void initialValuesCheckAndDataPrepare() {
        if (this.stepsAmountlist.isEmpty()) {
            this.errorMessage =" You did not provide available steps combinations";
        }

        if (numberOfStairs < 1) {
            this.errorMessage = "Staircase should be at least one step high";
        }

        stepsAmountlist.sort(Integer::compareTo);

        this.errorMessage = "All data is correct";
    }

    /**
     * Returns problem solution
     * @return List of possible combinations of steps taken
     */
    public List<List<Integer>> returnListOfValidSteps() {
        return this.listOfPossibleCombinations;
    }

}
