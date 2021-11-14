
import java.util.Scanner;
import java.lang.Character;
import java.util.Arrays;

public class TP28 {
    static char[] UpperLower(char[] tableauChar) {

        char[] resultat = new char[tableauChar.length];
        for (int i = 0; i < tableauChar.length; i++) {
            resultat[i] = tableauChar[i];
        }

        for (int i = 1; i < tableauChar.length; i++) {


            if ((Character.isLowerCase(resultat[i - 1]))) {

                resultat[i] = Character.toUpperCase(tableauChar[i]);

            } else {
                resultat[i] = tableauChar[i];
            }


        }
        return resultat;
    }

    public static void main(String[] args) {

        char resultat[];
        char tab[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        resultat = UpperLower(tab);

        System.out.println(Arrays.toString(resultat));


    }

}