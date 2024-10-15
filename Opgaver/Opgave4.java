package Opgaver;

import java.util.*;

public class Opgave4 {

    public static void main(String[] args) {
        int[] unsortedNumbersList = {23,56,22,11,65,89,3,44,87,910,45,35,98};
        checkNumbers(unsortedNumbersList);
    }

    /*
        Skriv en algoritme, der har et array af usorterede, entydige naturlige tal som input og find de tre tal i
    arrayet, hvis sum er tættest på en potens af 2. Det samme tal kan må bruges én gang.
    Algoritmens returværdi skal være et heltalsarray, som først indeholder de tre tal og dernæst den tilhørende
    potens af to (fx 512).
    Kaldt med arrayet {23,56,22,11,65,89,3,44,87,910,45,35,98}, returneres de tre tal 89, 3, 35 og potensen af 2: 128.

    Hvad er Store-O tidskompleksiteten af din algoritme? Begrund dit svar og diskuter mulighederne for at optimere din løsning yderligere.
     */

    private static void checkNumbers(int[] unsortedNumbers) {
        int[] powers = generatePowersOfTwo(); // O(N)

        int bestDifference = Integer.MAX_VALUE;
        int[] bestCombination = new int[3];
        int bestPow = 0;

        for (int i = 0; i < unsortedNumbers.length; i++) { // O(N)
            for (int j = i + 1; j < unsortedNumbers.length; j++) { // O(N)
                for (int k = j + 1; k < unsortedNumbers.length; k++) { // O(N)

                    int sum = unsortedNumbers[i] + unsortedNumbers[j] + unsortedNumbers[k];
                    int closestPow = powers[0];

                    for (int power : powers) { // O(N)
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

    /*
        Grundet de nestede loops vil tidskompleksiteten af algoritmen være O(N^4).
        Da de nestede loops samlet er O(N^4) ses der bort fra loopet der genererer powers of two, da dette loop kun er O(N).

        For at kunne optimere tidskompleksiteten ville det være oplagt at finde et workaround til mængden af nestede for-loops
        At fjerne 1 for-loop ville allerede gøre en stor forskel i mængden af tid det tager at køre algoritmen igennem
     */
}
