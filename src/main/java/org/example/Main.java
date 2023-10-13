package org.example;

import org.example.arraydiff.ArrayDiff;
import org.example.arrayproductexceptforitself.ArrayProductExceptForItself;
import org.example.autocompleter.Autocompleter;
import org.example.binarytreeserializer.BinaryTreeSerializer;
import org.example.binarytreeserializer.Node;
import org.example.duplicateencoder.DuplicateEncoder;
import org.example.findlongestfilepath.FindLongestFilepath;
import org.example.humanreadabletime.HumanReadableTime;
import org.example.largestnonadjacentsum.LargestNonAdjacentSum;
import org.example.longestsubstringdistinctchars.LongestSubstringDistinctCharacters;
import org.example.messagedecoder.MessageDecoder;
import org.example.missingpositiveinteger.MissingPositiveIntegerInArray;
import org.example.estiamtepi.CalculatePiValue;
import org.example.nsteps.NStepsProblem;
import org.example.pangramchecker.PangramChecker;
import org.example.parityoutlier.ParityOutlier;
import org.example.randomelementfrominfinitestream.PickRandomElementFromInfiniteStream;
import org.example.returnpairelement.cons;
import org.example.scheduler.CustomSchedule;
import org.example.scheduler.JobScheduler;
import org.example.tenminwalk.TenMinWalk;
import org.example.twosumchecker.TwoSumChecker;
import org.example.univaltreecounter.UnivalTreeCounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.example.returnpairelement.ReturnPairElement.car;
import static org.example.returnpairelement.ReturnPairElement.cdr;

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
        tenMinWalk();
        returnPairElement();
        //jobScheduler();
        autocompleter();
        longestSubstringDistinctCharacters();
        calculatePiValue();
        randomElementOfInfiniteSteam();
        findLongestPathFile();
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

    public static void tenMinWalk() {
        char[] path = {'n','s','n','s','n','s','n','s','n','s'};

        TenMinWalk tenMinWalk = new TenMinWalk();

        System.out.println("Is path: " + Arrays.toString(path) +", ten minute walk? Answer: " + tenMinWalk.isValid(path));
    }

    public static void returnPairElement() {
        System.out.println("car(cons(4, 3)) : " +car(new cons("4", "3")));
        System.out.println("cdr(cons(4, 3)) : " +cdr(new cons("4", "3")));

    }

    public static void jobScheduler() {
        JobScheduler scheduler = new JobScheduler();

        scheduler.addSchedule(new CustomSchedule("Info2", 11000));
        scheduler.addSchedule(new CustomSchedule("Info3", 15000));

        scheduler.addSchedule(new CustomSchedule("Ping", 10000));
        scheduler.addSchedule(new CustomSchedule("Pong", 3000));
        scheduler.addSchedule(new CustomSchedule("Info", 5000));

        scheduler.executeScheduler();

    }
    
    public static void autocompleter() {
        Autocompleter autocompleter = new Autocompleter();
        
        String phrase = "ab";
        String[] returnedWords = autocompleter.autocomplete(phrase);

        System.out.println("For phrase: " + phrase + ", autocompleted words: " + Arrays.toString(Arrays.stream(returnedWords).toArray()));
    }

    public static void longestSubstringDistinctCharacters() {
        String input = "fghijklzabcbazxy";
        int distinctChars = 4;

        LongestSubstringDistinctCharacters alg = new LongestSubstringDistinctCharacters(distinctChars, input);

        System.out.println("For input: " + input + ", longest substring with k = " + distinctChars + " distinct characters is " + alg.find() + " characters long");
    }

    public static void calculatePiValue() {
        CalculatePiValue calculatePiValue = new CalculatePiValue();
        calculatePiValue.calculate();
    }

    public static void randomElementOfInfiniteSteam() {
        PickRandomElementFromInfiniteStream random = new PickRandomElementFromInfiniteStream();
        int[] stream = {2, 5, 1, 9, 0, 123, 56, 93, 15, 20, 25, 6, -11, 7};
        random.pick(stream);
    }

    public static void findLongestPathFile() {
        FindLongestFilepath findLongestFilepath = new FindLongestFilepath();
        String path = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";

        System.out.println("Longest filepath of: " + path + " , is equal to: " + findLongestFilepath.find(path));
    }
}