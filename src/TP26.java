
import java.util.Scanner;

public class TP26 {
    static boolean isPrefix(String chaine1, String chaine2) {
        return chaine1.contains(chaine2);
    }

    public static void main(String[] args) {

        String mot1="banner";
        String mot2="ban";

        System.out.println(isPrefix("banner","ban"));

    }

}