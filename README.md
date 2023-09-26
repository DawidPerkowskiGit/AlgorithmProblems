# Algorithm solutions   
These are my solutions for some algorithm problems
* [N step problem](#n-step-problem)
* [Pangram checker](#pangram-checker)
* [Setup](#setup)
## N step problem
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/nsteps

## Pangram checker
https://github.com/DawidPerkowskiGit/AlgorithmsProblems/tree/master/src/main/java/org/example/pangramchecker


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
