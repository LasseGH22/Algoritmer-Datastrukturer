package Opgaver;

public class Opgave6 {
    public static void main(String[] args) {
        System.out.println(sumDivisibleBy3(12));
    }

    private static int sumDivisibleBy3(int N) {
        if (N < 1) {
            return 0;
        }

        if (N % 3 != 0) {
            return sumDivisibleBy3(N - 1);
        }

        return N + sumDivisibleBy3(N - 1);
    }
}
