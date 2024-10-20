package Opgaver;
public class Opgave1 {
    public static void main(String[] args) {
        System.out.println(sumOddSquares(8));
    }


    // Skriv en rekursiv algoritme, som har et naturligt tal som parameter og returnerer summen af de ulige tals kvadrater fra 1 til N.
    private static int sumOddSquares(int n) {
        if (n < 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return sumOddSquares(n - 1);
        }

        return n * n + sumOddSquares(n - 2);
    }
}
