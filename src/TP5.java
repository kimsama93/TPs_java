import java.util.Scanner;
class TP5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int anneeActuelle = 2021;
        System.out.print("a : ");
        int a = keyboard.nextInt();

        System.out.print("b : ");
        int b = keyboard.nextInt();

        System.out.print("c : ");
        int c = keyboard.nextInt();

        System.out.print("x : ");
        double x = keyboard.nextDouble();

        double result = (( (a+b)/2.0)*Math.pow(x,3))+((Math.pow((a+b),2)*Math.pow(x,2)))+a+b+c;

        System.out.printf("Le résultat est : %f  ", result);
    }
}