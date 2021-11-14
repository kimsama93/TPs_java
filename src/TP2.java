import java.util.Scanner;
class TP2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String prenom;
        String nom;
        System.out.print("Votre prénom : ");
        prenom = keyboard.nextLine();//String
//
        System.out.print("Votre nom : ");
        nom = keyboard.nextLine();//

        System.out.print("Votre age : ");
        int age = keyboard.nextInt();//int

        System.out.printf("Vous vous appellez %s %s , et vous avez %d ans\n", prenom,nom,age);

    }
}

