import java.util.Scanner;
class TP4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int anneeActuelle = 2021;
        System.out.print("Votre age : ");
        int age = keyboard.nextInt();
        int anneeNaissance = anneeActuelle - age;

        System.out.printf("Votre année de naissance est : %d  ", anneeNaissance);
    }
}