package org.example;

import org.example.arraydiff.ArrayDiff;
import org.example.arrayproductexceptforitself.ArrayProductExceptForItself;
import org.example.binarytreeserializer.BinaryTreeSerializer;
import org.example.binarytreeserializer.Node;
import org.example.duplicateencoder.DuplicateEncoder;
import org.example.humanreadabletime.HumanReadableTime;
import org.example.largestnonadjacentsum.LargestNonAdjacentSum;
import org.example.messagedecoder.MessageDecoder;
import org.example.missingpositiveinteger.MissingPositiveIntegerInArray;
import org.example.nsteps.NStepsProblem;
import org.example.pangramchecker.PangramChecker;
import org.example.parityoutlier.ParityOutlier;
import org.example.twosumchecker.TwoSumChecker;
import org.example.univaltreecounter.UnivalTreeCounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        configAndPerformNStepProblemsSolving();
        performPangramCheck();
        twoSumChecker();
        parityOutlier();
        arrayProductExceptForItself();
        binaryTreeSerializationDeserialization();
        arrayDifference();
        firstMissingInteger();
        messageDecoder();
        humanReadableTime();
        univalCounter();
        duplicateEncoder();
        biggestNonAdjacentSum();
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

    public static void twoSumChecker() {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(3);
        numbers.add(7);
        int sum = 17;

        TwoSumChecker twoSumChecker = new TwoSumChecker();
        System.out.println("Two sum checker result: "+ twoSumChecker.checkTwoSum(numbers, sum));
    }

    public static void parityOutlier() {
        int[] list = {2, 6, 8, -10, 3};
        ParityOutlier parityOutlier = new ParityOutlier();
        System.out.println("Parity outlier: " + parityOutlier.find(list));
    }

    public static void arrayProductExceptForItself() {
        int[] input = {1, 2, 3, 4, 5};

        ArrayProductExceptForItself arrayProductExceptForItself = new ArrayProductExceptForItself();
        arrayProductExceptForItself.DIVISION_ALGORITHM = true;

        System.out.println("Array product except for itself. Division algorithm: " + arrayProductExceptForItself.DIVISION_ALGORITHM);
        System.out.println("Input:" + Arrays.toString(Arrays.stream(input).toArray()));
        System.out.println("Output:" + Arrays.toString(Arrays.stream(arrayProductExceptForItself.calculate(input)).toArray()));

    }

    public static void binaryTreeSerializationDeserialization() {
        Node node = new Node("root",new Node("left",new Node("left.left", new Node("left.left.left"), ""), ""),new Node("right"));

        BinaryTreeSerializer binaryTreeSerializer = new BinaryTreeSerializer();

        String serialized = binaryTreeSerializer.serialize(node);

        System.out.println(serialized);

        Node deserialized = binaryTreeSerializer.deserialization(serialized);

        System.out.println("root.left.left.left.val = " + deserialized.left.left.left.val);
    }

    public static void arrayDifference() {
        int[] arrayA = {1, 2, 2, 2, 3};

        int[] arrayB = {2};

        ArrayDiff arrayDiff = new ArrayDiff();

        System.out.println(Arrays.toString(Arrays.stream(arrayDiff.removeElements(arrayA, arrayB)).toArray()));
    }

    public static void firstMissingInteger() {
        int[] nums = {1,-1,-5,-3,3,4,2,8};

        MissingPositiveIntegerInArray alg = new MissingPositiveIntegerInArray();

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Missing number: " + alg.find(nums));
    }

    public static void messageDecoder() {
        String message = "1111111111";

        MessageDecoder messageDecoder = new MessageDecoder();

        System.out.println("Message decoder. Message: " + message + ", Possible decoded words: "+  messageDecoder.decode(message));
    }

    public static void humanReadableTime() {
        HumanReadableTime humanReadableTime = new HumanReadableTime();

        int time = 3600;

        System.out.println(time + " seconds converted to human readable time: " + humanReadableTime.makeReadable(time));
    }

    public static void univalCounter() {
        Node root = new Node(
                "0",
                new Node(
                        "1",
                        new Node(
                                "1",
                                new Node("1"),
                                new Node("1")),
                        new Node("0")),
                new Node("0"));

        UnivalTreeCounter univalTreeCounter = new UnivalTreeCounter();

        System.out.println("Unival trees count: " + univalTreeCounter.count(root));
    }

    public static void duplicateEncoder() {
        String input = "recede";
        DuplicateEncoder duplicateEncoder = new DuplicateEncoder();

        System.out.println("Input word: " + input + ", encoded message: " + duplicateEncoder.encode(input));
    }

    public static void biggestNonAdjacentSum() {
        int[] numbers = {2, 4, 6, 2, 5, 7, 1, 8};

        LargestNonAdjacentSum algorithm = new LargestNonAdjacentSum();

        System.out.println("Largest sum of non-adjacent numbers " + Arrays.toString(numbers) + " is: " + algorithm.findSum(numbers));
    }
}