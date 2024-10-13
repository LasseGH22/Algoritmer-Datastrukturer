package Opgaver;

import java.util.*;

public class Opgave4 {

    public static void main(String[] args) {
        int[] unsortedNumbersList = {23,56,22,11,65,89,3,44,87,910,45,35,98};
        checkNumbers(unsortedNumbersList);
    }

    private static void checkNumbers(int[] unsortedNumbers) {
        int[] powers = generatePowersOfTwo();

        int bestDifference = Integer.MAX_VALUE;
        int[] bestCombination = new int[3];
        int bestPow = 0;

        for (int i = 0; i < unsortedNumbers.length; i++) {
            for (int j = i + 1; j < unsortedNumbers.length; j++) {
                for (int k = j + 1; k < unsortedNumbers.length; k++) {

                    int sum = unsortedNumbers[i] + unsortedNumbers[j] + unsortedNumbers[k];
                    int closestPow = powers[0];

                    for (int power : powers) {
                        if (Math.abs(power - sum) <= Math.abs(closestPow - sum)) {
                            closestPow = power;
                        }
                    }

                    int diff = Math.abs(closestPow - sum);
                    if (diff < bestDifference) {
                        bestDifference = diff;
                        bestCombination[0] = unsortedNumbers[i];
                        bestCombination[1] = unsortedNumbers[j];
                        bestCombination[2] = unsortedNumbers[k];
                        bestPow = closestPow;
                    }
                }
            }
        }
        System.out.println("Combination: " + Arrays.toString(bestCombination) + "\n" + "Closest power of 2: " + bestPow);
    }

    private static int[] generatePowersOfTwo() {
        int[] powers = new int[12];
        for (int i = 0; i < powers.length; i++) {
            powers[i] = (int) Math.pow(2,i+1);
        }
        return powers;
    }
}
