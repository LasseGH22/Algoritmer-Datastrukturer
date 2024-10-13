package Opgaver;

public class Opgave5 {

    //Hvad er Store-O tidskompleksiteten af nedenstående metode? Begrund dit svar.

    int myMethod(int N)
    {
        int x = 0;

        // O(√N)
        for (int i = 1; i <= Math.sqrt(N); i++) {

            // O(N)
            for (int j = 1; j <= N; j++) {

                // O(log(N))
                for (int k = 1; k < N;)
                {
                    x++;
                    k = k * 2;
                }
            }
        }
        return x;
    }

    /*
        Tidskompleksiteten af algoritmen er O(√N * N * log(N)) = O(N * sqrt(N) * log(N)).
        Dette er grundet i at det yderste loop kører O(√N) gange, det midterste loop kører O(N) gange og det inderste loop kører O(log(N)) gange.
        Da de er nestede multipliceres de med hinanden, hvilket giver en samlet tidskompleksitet på O(√N * N * log(N)).
     */
}
