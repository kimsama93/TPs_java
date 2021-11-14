import java.util.Scanner;
public class TP7 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int nombre;
        System.out.print("nombre : ");
        nombre = keyboard.nextInt();


        if (nombre>0) {
            if(nombre%2==0){
            System.out.println("Le nombre est positif et pair");
        }   else {
            System.out.println("Le nombre est positif et impair");
        }}
            else if(nombre<0){
                if(nombre%2==0){
                    System.out.println("Le nombre est négatif et pair");
                }
                else {
                    System.out.println("Le nombre est négatif et imppair");
                }

        }
            else System.out.println("Le nombre est nul et pair");

}}