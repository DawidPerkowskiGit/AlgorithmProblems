package org.example.randomelementfrominfinitestream;

import java.util.Random;

public class PickRandomElementFromInfiniteStream {

    Random randomNum = new Random();

    public int pick(int[] stream) {
        int counter = 0;
        int currentRandomElement = 0;


        int randomNumber = 0;
        for (int element: stream
             ) {
            counter++;
            randomNumber = randomNum.nextInt(1, counter + 1);

            if (randomNumber == 1) {
                currentRandomElement = element;
            }

            System.out.println("Current random element = " + currentRandomElement + ", number of iterations: " + counter);
        }

        return currentRandomElement;
    }

}
