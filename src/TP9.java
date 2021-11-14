import java.util.Scanner;
public class TP9 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("mois : ");
        double mois = keyboard.nextDouble();

        if(mois==1){
            System.out.printf("Janvier");
        }
        if(mois==2){
            System.out.printf("Février");
        }
        if(mois==3){
            System.out.printf("Mars");
        }
        if(mois==4){
            System.out.printf("Avril");
        }
        if(mois==5){
            System.out.printf("Mai");
        }
        if(mois==6){
            System.out.printf("Juin");
        }
        if(mois==7){
            System.out.printf("Juillet");
        }
        if(mois==8){
            System.out.printf("Août");
        }
        if(mois==9){
            System.out.printf("Septembre");
        }
        if(mois==10){
            System.out.printf("Octobre");
        }
        if(mois==11){
            System.out.printf("Novembre");
        }
        if(mois==12){
            System.out.printf("Décembre");
        }

    }
}
