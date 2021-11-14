import java.util.Scanner;
public class TP8 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("a : ");
        double a = keyboard.nextDouble();
        System.out.print("b : ");
        double b = keyboard.nextDouble();
        System.out.print("c : ");
        double c = keyboard.nextDouble();

        double delta=Math.pow(b,2)-4.0*a*c;
        double x1,x2,x;

        if(delta>0){
            x1 = (-b-Math.sqrt(delta))/(2.0*a);
            x2 = (-b+Math.sqrt(delta))/(2.0*a);
            System.out.printf("Les solutions de l'équation sont : %f %f", x1,x2);
        }
        else if(delta==0){
            x=-b/(2.0*a);
            System.out.printf("La solution de l'équation est : %f", x);
        }
        else {
            System.out.println("L'équation n'a pas de solution");
        }



    }}