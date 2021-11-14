import java.util.ArrayList;
import java.util.Scanner;
class TP25 {
    public static void main(String[] args) {

        ArrayList<String> listeAdresses = new ArrayList<>();

        double cmptGmail = 0;
        double cmptYahoo = 0;
        double cmptHotmail = 0;

        double tauxGmail;
        double tauxYahoo;
        double tauxHotmail;


        listeAdresses.add(" christian.lisangola@gmail.com");
        listeAdresses.add(" jean.paul@gmail.com");
        listeAdresses.add(" alain@gmail.com");
        listeAdresses.add(" lydie@yahoo.fr");
        listeAdresses.add(" josephine.lajoie@yahoo.com");
        listeAdresses.add(" luise@hotmail.fr");
        listeAdresses.add(" philemon.turion@gmail.com");
        listeAdresses.add(" jules.cesar@hotmail.fr ");

        //Affichage
        for(int i=0;i<listeAdresses.size();i++){
            System.out.printf("adresse mail numéro %d : %s\n",(i+1),listeAdresses.get(i));
        }

        for (int i = 0; i < listeAdresses.size(); i++) {


            if (listeAdresses.get(i).contains("gmail")) {
                cmptGmail++;
            } else if (listeAdresses.get(i).contains("yahoo")) {
                cmptYahoo++;
            } else if (listeAdresses.get(i).contains("hotmail")) {
                cmptHotmail++;
            }
        }

        System.out.printf("cmpt gmail    :%f \n", cmptGmail);
        System.out.printf("cmpt hotmail   :%f \n", cmptHotmail);
        System.out.printf("cmpt yahoo   : %f \n", cmptYahoo);

        tauxGmail = (cmptGmail / listeAdresses.size()) * 100;
        tauxHotmail = (cmptHotmail / listeAdresses.size()) * 100;
        tauxYahoo = (cmptYahoo / listeAdresses.size()) * 100;

        System.out.printf("pourcentage gmail  :%d %%\n", (int)tauxGmail);
        System.out.printf("pourcentage hotmail :%d %%\n", (int)tauxHotmail);
        System.out.printf("pourcentage yahoo  :%d %%\n", (int)tauxYahoo);


    }
}