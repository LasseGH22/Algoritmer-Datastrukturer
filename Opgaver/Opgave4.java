package Opgaver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Opgave4 {

    public static void main(String[] args) {
        int[] unsortedNumbersList = {23,56,22,11,65,89,3,44,87,910,45,35,98};

        Map<int[], Integer> tripletMap = generateTriplets(unsortedNumbersList);
        int[] powers = generatePowersOfTwo();

        /*
        for (Map.Entry<int[], Integer> entry : tripletMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        for (Integer pow : powers) {
            System.out.println(pow);
        }
        */
    }

    /*
    public static int closestPower() {

    }

     */

    private static int[] generatePowersOfTwo() {
        int[] powers = new int[12];
        for (int i = 0; i < powers.length; i++) {
            powers[i] = (int) Math.pow(2,i+1);
        }
        return powers;
    }

    private static HashMap generateTriplets(int[] unsortedNumbers) {
        HashMap<int[], Integer> tripletMap = new HashMap<>();
        for (int i = 0; i < unsortedNumbers.length; i++) {
            for (int j = 0; j < unsortedNumbers.length - 1; j++) {
                for (int k = 0; k < unsortedNumbers.length - 2; k++) {
                    tripletMap.put(new int[]{
                            unsortedNumbers[i],
                            unsortedNumbers[j],
                            unsortedNumbers[k]
                    },unsortedNumbers[i] + unsortedNumbers[j] + unsortedNumbers[k]);
                }
            }
        }
       return tripletMap;
    }
}
