package org.example;

import org.example.nsteps.NStepsProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        configAndPerformNStepProblemsSolving();

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
}