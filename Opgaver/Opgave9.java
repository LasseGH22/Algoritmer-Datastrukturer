package Opgaver;

public class Opgave9 {
    public static void main(String[] args) {
        System.out.println(myMethod(10));
    }
    /*
        Hvad er Store-O tidskompleksiteten for nedenstående metode? Dit svar må godt være baseret på udførte
        tests. Hvis du vælger at give et svar uden tests, skal svaret begrundes.
    */

    public static long myMethod(int n)
    {
        if (n <= 1)
            return 1;
        else
            return myMethod(n-1) + myMethod(n-2);
    }
}
