package Opgaver;

public class Opgave6 {
    public static void main(String[] args) {
        System.out.println(sumDivisibleBy3(12));
    }

    /*
        Skriv en rekursiv algoritme med følgende signatur:
                    int sumDivisibleBy3(int N)

        Algoritmen returnerer summen af heltal større end 0 og mindre end eller lig med N, som er dividérbare med 3.
        Kaldt med N = 12 er den korrekte returværdi 30 (3+6+9+12). Kaldt med N = 14 er den korrekte
        returværdi også 30.

        Din algoritme skal optimeres således, at overflødige rekursive kald undgås.
     */

    private static int sumDivisibleBy3(int N) {
        if (N < 3) {
            return 0;
        }
        if (N % 3 != 0) {
            return sumDivisibleBy3(N - (N % 3));
        }
        return N + sumDivisibleBy3(N - 3);
    }
    /*
        jeg optimerede algoritmen til at undlade overflødige rekursive kald ved at
        når første dividerbare tal findes trækkes der 3 fra istedet for det normale 1.
        Derudover, hvis tallet ikke er dividerbart med 3 findes differencen til det næste dividerbare tal
    */
}
