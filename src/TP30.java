import java.util.Scanner;
import java.lang.Character;
import java.util.Arrays;

public class TP30 {
    static boolean deuxCharIdentiques(String chaine) {
        boolean identicalChars=false;
        for (int i = 1; i < chaine.length(); i++) {

            if (chaine.charAt(i-1) == chaine.charAt(i)) {
                identicalChars= true;


            }
        }
        return identicalChars;
        }

    public static void main(String[] args) {

        boolean identical=false;
        String mot = "cahhlo";
        identical = deuxCharIdentiques(mot);




        System.out.println(identical);



    }
    }

