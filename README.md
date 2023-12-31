# Algorithm solutions   
These are my solutions for some algorithm problems
* [N-step problem](#n-step-problem)
* [Pangram checker](#pangram-checker)
* [Two-sum problem](#two-sum-problem)
* [Parity outlier](#parity-outlier)
* [Array product except for itself](#array-product-except-for-itself)
* [Your order please](#your-order-please)
* [Binary tree serialization deserialization](#binary-tree-serialization-deserialization)
* [Array Diff](*array-diff)
* [Missing positive integer in arary](#missing-positive-integer-in-arary)
* [Message decoder](#message-decoder)
* [Human-readable time](#human-readable-time)
* [Unival tree counter](#unival-tree-counter)
* [Duplicate encoder](#duplicate-encoder)
* [Largest non-adjacent sum](#largest-non-adjacent-sum)
* [Ten minutes walk](#ten-minutes-walk)
* [Return element of a pair](#return-element-of-a-pair)
* [Job scheduler](#job-scheduler)
* [Longest substring containing k distinct characters](#longest-substring-containing-k-distinct-characters)
* [Estimate Pi value](#estimate-pi-value)
* [Pick random element from infinite stream](#pick-random-element-from-infinite-stream)
* [Find longest filepath](#find-longest-filepath)
* [Latest order list](#latest-order-list)

-----------------------

* [Setup](#setup)


## N-step problem
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/nsteps

## Pangram checker
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/pangramchecker

## Two-sum problem
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/twosumchecker

## Parity outlier
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/parityoutlier

## Array product except for itself
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/arrayproductexceptforitself

## Your order please
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/yourorderplease

## Binary tree serialization deserialization
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/binarytreeserializer

## Array diff
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/arraydiff

## Missing positive integer in arary
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/missingpositiveinteger

## Message decoder
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/messagedecoder

## Human-readable time
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/humanreadabletime

## Unival tree counter
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/univaltreecounter

## Duplicate encoder
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/duplicateencoder

## Largest non-adjacent sum
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/largestnonadjacentsum

## Ten minutes walk
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/tenminwalk

## Return element of a pair
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/returnpairelement

## Job scheduler
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/scheduler

## Autocompleter
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/autocompleter

## Longest substring containing k distinct characters
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/longestsubstringdistinctchars

## Estimate Pi value
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/estiamtepi

## Pick random element from infinite stream
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/randomelementfrominfinitestream

## Find longest filepath
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/findlongestfilepath

## Latest order list
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/latestorderlist

------------------------------------

### Setup

Prerequisites:
- Maven
- Java

Using any command line interface perform tasks listed below.

1. Clone the repository
```
git clone https://github.com/DawidPerkowskiGit/AlgorithmsProblems
```

2. Edit the Main.class file by uncommenting algorithm function you wish to deploy.

For example running the Pangram Checker algorithm.
```
public class Main {
    public static void main(String[] args) {
        //configAndPerformNStepProblemsSolving();
        performPangramCheck();
    }
}
```

3. Compile the project using Maven
```
mvn compile
```
4. Package the project using Maven
```
mvn clean package
```
5. Run the Jar file
```
java -jar .\target\CodingProblems-1.0-SNAPSHOT.jar
