package Opgaver;

import java.util.Arrays;
import java.util.HashMap;

public class Opgave7 {
    public static void main(String[] args) {
        int[] bestCombination = checkBestCombination(6561);

        System.out.println(bestCombination[0] + "^" + bestCombination[1]);
    }

    /*
        Skriv en algoritme, som kan afgøre om et givent naturligt tal Z < 100,000 (algoritmens parameter) kan
        skrives som Z=XY hvor X og Y er heltal, hvorom det gælder, at X > 2 og Y > 2.

        Algoritmens returværdi skal designes således, at følgende information kan udledes fra den:
            • Værdien af X (i tilfældet 6561 er X=9).
            • Værdien af Y (i tilfældet 6561 er Y=4).
            • For det givne Z kan der være flere løsningspar (X,Y). For 3125 er der kun et
              løsningspar; men for 6561 er X=3 og Y=8 også en mulighed. Hvis der er mere end én
              løsning, skal den med den største X-værdi returneres.
            • Hvis det givne Z ikke har noget løsningspar (X,Y) eller Z indeholder en ulovlig værdi,
              returneres en dummy eller default værdi.

        Algoritmen skal optimeres under antagelsen af, at maksimumværdien for Z og minimumsværdierne for X og
        Y aldrig ændrer sig
     */

    private static int[] checkBestCombination(int n) {
        int bestX = 0;
        int bestY = 0;
        double isThisN;

        if (n < 100000 && n > 27) {
            for (int x = 3; x <= Math.sqrt(n); x++) {
                int y = 3;

                isThisN = Math.pow(x,y);

                while (isThisN <= n && isThisN > 0) {
                    if (isThisN == n) {
                        bestX = x;
                        bestY = y;
                    }

                    y++;
                    isThisN = Math.pow(x,y);
                }
            }
            if (bestX < 3) return new int[]{0,0};
        }
        return new int[]{bestX,bestY};
    }
}
