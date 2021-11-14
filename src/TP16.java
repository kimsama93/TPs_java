import java.util.Scanner;

public class TP16 {
    public static void main(String[] args) {
        int tableau[] = new int[6];

        int min=tableau[0];
        int max = tableau[1];
        int positionPetit=0;
        int positionGrand=0;
        //        Ecriture via une boucle
        Scanner clavier = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            if (i == 0) {
                System.out.printf("Entrez le %der : ", (i + 1));

            } else {
                System.out.printf("Entrez le %dème : ", (i + 1));
            }
            tableau[i] = clavier.nextInt();
        }

        for(int c= 0; c < tableau.length; c++) {
            if (tableau[c] < min) {
                min = tableau[c];
                positionPetit=c;
            } else {
                min = min;
            }
            if (tableau[c] > max) {
                max = tableau[c];
                positionGrand=c;
            } else {
                max = max;
            }
        }



        System.out.print("Tableau : [");
        for (int i = 0; i < tableau.length; i++) {

            if(tableau[i]==max) {
                System.out.printf("%d(PG) ", tableau[i]);
            }
            else if(tableau[i]==min){
                System.out.printf("%d(PP) ", tableau[i]);
            }
            else{
                System.out.printf("%d ", tableau[i]);
            }

        }
        System.out.println("]");

        System.out.printf("Le plus grand nombre est %d et sa position est %d ", max,positionGrand);
        System.out.printf("Le plus petit nombre est %d et sa position est %d ", min,positionPetit);
    }}