import java.util.Objects;
import java.util.Scanner;
public class TP12 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Veuillez définir votre adresse email: ");
        String email = keyboard.nextLine();

        System.out.print("Veuillez définir votre mot de passe: ");
        String motDePasse = keyboard.nextLine();


        String emailSaisi="xx";

        String motDePasseSaisi="";
        int nbrCnx=0;

        while(!Objects.equals(email,emailSaisi) || !Objects.equals(motDePasse,motDePasseSaisi) ) {
            System.out.print("Veuillez saisir votre adresse email: ");
            emailSaisi = keyboard.nextLine();
            System.out.print("Veuillez saisir votre mot de passe: ");
            motDePasseSaisi = keyboard.nextLine();
            nbrCnx++;
            if (!Objects.equals(email,emailSaisi) || !Objects.equals(motDePasse,motDePasseSaisi)) {

                System.out.println("Identifiants incorrects,veuillez recommencer ");
                System.out.printf(" il vous reste %d tentative  \n ",5-nbrCnx);
            } else {
                System.out.print("Bienvenue dans votre espace client !  ");
            }

            if (nbrCnx == 5) {
                System.out.print("Votre compte est bloqué ! ");
                break;
            }
        }


    }}
