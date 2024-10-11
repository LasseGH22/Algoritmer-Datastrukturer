package Opgaver;

public class Opgave2 {

    // Hvad er Store-O tidskompleksiteten for nedenstående algoritme. Begrund dit svar.
    public static int myMethod( int N )
    {
        int x = 0; int y = 0; // Constant time, O(1), gets ignored

        /* Loop i
            Runs from i = 0 to i < N
            After each iteration i is incremented by itself, doubling its value each iteration
            This makes its time complexity logarithmic in base 2, log2(N)
            In Big O notation, the base of the logarithm is often omitted because logarithms of different bases differ only by a constant factor
            Making it contribute O(log(N))
         */
        for (int i = 0; i < N; i++)
        {
            /* Loop j
                Runs from j = 0 to j < N
                After each iteration j is doubled
                Making it contribute O(log(N))
             */
            for (int j = 0; j < N; j++)
            {
                /* Loop k
                    Runs from k = 0 to k < N * sqrt(N)
                    As k is not involved in any other operation it makes loop k contribute O(N * sqrt(N))
                 */
                for (int k = 0; k < N * Math.sqrt(N); k++)

                {
                    x++;
                }

                j *= 2; // Doubling of j after each iteration
            }

            i += i; // Incrementation of i after each iteration
        }

        /* Timecomplexity of nested loops
            O(log(N)) * O(log(N)) * O(N * sqrt(N)) = O(log^2(N) * N * sqrt(N))
         */

        /* Loop i2
            Runs from i = 0 to i < N * N
            Making it run N * N times
            Therefore its timecomplexity is O(N^2)
         */
        for (int i = 0; i < N*N; i++)
            y++;
        return x+y;
    }

    /*
        Tidskompleksiteten af algoritmen er O(N^2). Det er den da det nederste loops tidskompleksitet dominere.
        Da O(N^2) gror hurtigere end O(log^2(N) * N * sqrt(N)) gør det O(log^2(N) * N * sqrt(N)) overflødigt.
     */
}
