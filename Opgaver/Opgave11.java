package Opgaver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Opgave11 {
    public static void main(String[] args) {
        int[] votes = new int[]{7,4,3,5,3,1,6,4,5,1,7,5};
        System.out.println(findIndividualVotes(votes));
    }

    /*
        Tabellen nedenfor repræsenterer de afgivne stemmer ved et valg.
                    {7,4,3,5,3,1,6,4,5,1,7,5}

        I dette eksempel er der 7 kandidater (1-7), og der er afgivet 12 stemmer. Kandidat 6 fik 1 stemme,
        kandidaterne 1, 3, 4 og 7 fik hver 2 stemmer, kandidat 5 fik 3 stemmer, and kandidat 2 fik 0 stemmer.

        Opgaven går ud på at skrive en algoritme, som kaldt med tabellen og eventuelt tabellens længde, kan
        afgøre om en kandidat fik mere end 50 % af stemmerne. I så fald returneres kandidatens nummer.
        Hvis ingen kandidat fik over 50 % af stemmerne, returneres -1.

        I eksemplet opnåede ingen af kandidaterne flertal, og der returneres -1.

        Hvad er din algoritmes tidskompleksitet?
     */

    private static int findIndividualVotes(int[] votes) {
        HashMap<Integer,Integer> voteCount = new HashMap<>();

        // O(N)
        for (int vote : votes) {
            if (voteCount.containsKey(vote)) {
                voteCount.put(vote, voteCount.get(vote) + 1);
            } else {
                voteCount.put(vote, 1);
            }
        }

        // O(N)
        for (Map.Entry<Integer,Integer> entry : voteCount.entrySet()) {
            if (entry.getValue() > votes.length / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }

    // Algoritmens tidskompleksitet er O(N)
}
