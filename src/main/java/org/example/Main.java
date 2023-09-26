package org.example;

import org.example.nsteps.NStepsProblem;
import org.example.pangramchecker.PangramChecker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        configAndPerformNStepProblemsSolving();
        performPangramCheck();
    }

    /**
     * Configure and solve N-steps problem
     */
    public static void configAndPerformNStepProblemsSolving() {
        List<Integer> possibleSteps = new LinkedList<>();
        possibleSteps.add(1);
        possibleSteps.add(3);
        possibleSteps.add(5);
        Integer numberOfStairs = 5;
        NStepsProblem nStepsProblem = new NStepsProblem(possibleSteps, numberOfStairs);
        nStepsProblem.initialValuesCheckAndDataPrepare();
        nStepsProblem.startAlgorithm();

        List<List<Integer>> finalAnswer = new ArrayList<>();
        finalAnswer = nStepsProblem.returnListOfValidSteps();
        System.out.println(Arrays.toString(Arrays.stream(finalAnswer.toArray()).toArray()));
    }

    public static void performPangramCheck() {
        PangramChecker pangramChecker = new PangramChecker();
        String sentence = "The quick brown fox jumps over the lazy do.";
        System.out.println(pangramChecker.check(sentence));
    }
}