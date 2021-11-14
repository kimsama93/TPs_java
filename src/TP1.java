import java.util.Scanner;
public class TP1 {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);


        System.out.print("Le diamètre : ");
        double diametre = keyboard.nextFloat();
        double rayon = diametre / 2;

        double s = rayon * rayon * Math.PI;

        System.out.printf("La surface est : %f", s);

    }
}
