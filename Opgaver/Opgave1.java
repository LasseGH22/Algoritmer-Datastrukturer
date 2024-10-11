package Opgaver;
public class Opgave1 {
    public static void main(String[] args) {
        System.out.println(sumOddSquares(8));
    }


    // Skriv en rekursiv algoritme, som har et naturligt tal som parameter og returnerer summen af de ulige tals kvadrater fra 1 til N.
    public static int sumOddSquares(int n) {
        // Hvis tallet er under 1, altså 0, vil vi gerne stoppe
        if (n < 1) {
            return 0;
        }

        // Hvis taller er lige går vi videre
        if (n % 2 == 0) {
            return sumOddSquares(n -1);
        }

        // Hvis de ovenstående ikke er sande udregnes kvadraten af tallet "n" og rekursionen fortsætter
        return n * n + sumOddSquares(n - 2);
    }
}
