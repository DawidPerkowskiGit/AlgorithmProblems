package org.example.estiamtepi;

public class CalculatePiValue {

    private final int PRECISION = 3;

    private final double PI = 3.14159265359;
    public double calculate() {
        int iterations = 0;
        int relativePi = calculateRelative(PI);
        double currentPiValue = 0.0;

        double x, y;
        double circlePoints = 0.0;
        double squarePoints = 0.0;
        while (relativePi != calculateRelative(currentPiValue)) {
            x = generateRandomValue();
            y = generateRandomValue();
            if (x * x + y * y <= 1) {
                circlePoints = circlePoints + 1.0;
            }
            squarePoints = squarePoints + 1.0;
            currentPiValue = (4 * circlePoints) / squarePoints;
            iterations++;
        }

        System.out.println("Reached desired Pi estimate of " + PRECISION+ " decimal places with " + iterations + " iterations. Estimated pi value = " + currentPiValue);

        return currentPiValue;
    }

    public double generateRandomValue() {
        return Math.random();
    }

    public int calculateRelative(double number) {
        return (int) (number * Math.pow(10, PRECISION));
    }
}
