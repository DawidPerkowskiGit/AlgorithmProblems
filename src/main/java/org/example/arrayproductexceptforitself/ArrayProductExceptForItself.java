package org.example.arrayproductexceptforitself;

public class ArrayProductExceptForItself {

    public boolean DIVISION_ALGORITHM = false;

    public int[] calculate(int[] numbers) {
        if (DIVISION_ALGORITHM) {
            return divisionAlgorithm(numbers);
        }
        return nonDivisionAlgorithm(numbers);
    }

    public int[] divisionAlgorithm(int[] numbers) {

        final int arrLen = numbers.length;

        int[] outputNumbers = new int[arrLen];

        int totalProduct = 1;
        for (int i = 0 ; i < arrLen ; i++) {
            totalProduct *= numbers[i];
        }

        for (int i = 0 ; i < arrLen ; i++) {
            outputNumbers[i]=totalProduct/ numbers[i];
        }

        return outputNumbers;
    }

    public int[] nonDivisionAlgorithm(int[] numbers) {
        final int arrLen = numbers.length;
        int[] outputNumbers = new int[arrLen];
        int[] leftArr = new int[arrLen];
        int[] rightArr = new int[arrLen];

        leftArr[0] = 1;
        rightArr[arrLen - 1] = 1;

        for (int i = 1 ; i < arrLen ; i++) {
            leftArr[i] = leftArr[i - 1] * numbers[i - 1];
        }

        for (int i = arrLen - 2 ; i > -1 ; i--) {
            rightArr[i] = rightArr[i + 1] * numbers[i + 1];
        }

        for (int i = 0 ; i < arrLen ; i++) {
            outputNumbers[i] = leftArr[i] * rightArr[i];
        }

        return outputNumbers;
    }
}
