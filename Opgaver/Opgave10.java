package Opgaver;

public class Opgave10 {
    public static void main(String[] args) {
        int n = 32;
        System.out.println("Log2 af " + n + " er " + logTo(n));

    }

    /*
        Skriv en rekursiv metode med følgende signatur: int logTo(int N)
        Algoritmen returner totals-logaritmen af N, og det er en forudsætning, at N er et naturligt tal og en potens af 2.
        Kaldt med N = 32 returneres 5, og med N = 4096 returneres 12.
     */

    private static int logTo(int n) {
        if (n < 2) return 0;

        return 1 + logTo(n / 2);
    }
}
