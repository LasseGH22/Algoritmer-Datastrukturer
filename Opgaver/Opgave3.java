package Opgaver;

public class Opgave3 {

    public static void main(String[] args) {
        System.out.println(additive("82842605"));
    }
    /*
        Skriv en rekursiv algoritme med følgende signatur:
                    bool additive(String s)

        Parameteren indeholder en streng bestående af cifre, fx. “82842605”.
        Algoritmen returnerer true, hvis parameteren indeholder en substring af tre på hinanden efterfølgende tal,
        hvor det tredje ciffer er lig med summen af de to forrige
     */

    private static boolean additive(String s) {
        char[] chars = s.toCharArray();

        if (chars.length < 3) {
            System.out.println("For kort");
            return false;
        }

        if (Character.getNumericValue(chars[0]) + Character.getNumericValue(chars[1]) == Character.getNumericValue(chars[2])) {
            System.out.println(chars[0] + " + " + chars[1] + " = " + chars[2]);
            return true;
        }

        String returnString = "";
        for (int i = 1; i < chars.length; i++) {
            returnString += chars[i];
        }

        System.out.println("String returned: " + returnString);
        return additive(returnString);
    }
}
