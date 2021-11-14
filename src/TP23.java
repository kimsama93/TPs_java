import java.util.ArrayList;
import java.util.Scanner;
class Tp23 {
    public static void main(String[] args) {

        ArrayList<String> langageDeProg=new ArrayList<>();
        ArrayList<String> langageDeProgSanssuppression=new ArrayList<>();
        ArrayList<String> langageDeProgASupprimer=new ArrayList<>();

        Scanner keyboard=new Scanner(System.in);
        System.out.print("Combien de language de programmation vous souhaitez :");
        int nbreLangage=keyboard.nextInt();


        for(int i=0;i<nbreLangage;i++){
            System.out.println("Entrez le langage souhaité : ");
            langageDeProg.add(keyboard.next());

        }
        for(int i=0;i<langageDeProg.size();i++){

            langageDeProgSanssuppression.add(langageDeProg.get(i));
        }


        System.out.print("Combien de language de programmation vous souhaitez supprimer :");
        int nbreLangageASupprimer=keyboard.nextInt();


        for(int i=0;i<nbreLangageASupprimer;i++){
            System.out.println("Entrez le langage a supprimer : ");
            langageDeProgASupprimer.add(keyboard.next());
        }

        for(int i=0;i<langageDeProg.size();i++){
            for(int j=0;j<langageDeProgASupprimer.size();j++) {

                if((langageDeProg.get(i)).equals(langageDeProgASupprimer.get(j))){
                    langageDeProg.remove(i);
                }


            }}


        for(int k=0;k<langageDeProgSanssuppression.size();k++){
            System.out.printf("Language %d : %s\n",(k+1),langageDeProgSanssuppression.get(k));
        }
        System.out.println("le tableaux avec les elements supprimés ");
        for(int b=0;b<langageDeProg.size();b++){
            System.out.printf("Language %d : %s\n",(b+1),langageDeProg.get(b));
        }







    }
}