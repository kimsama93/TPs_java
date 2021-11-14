import java.util.Scanner;

public class TP17 {
    public static void main(String[] args) {
        var clavier=new Scanner(System.in);
        String texteInverse="";

        System.out.println("Saisir un texte  : ");
        String texte=clavier.nextLine();//0xaabc

        for(int i=texte.length()-1;i>=0;i--){
            texteInverse=texteInverse+texte.charAt(i);
        }

        System.out.println(texteInverse);
    }
}
