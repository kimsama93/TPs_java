import java.util.Scanner;
class TP3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.print("a : ");
        int a = keyboard.nextInt();
        System.out.print("b : ");
        int b = keyboard.nextInt();
        System.out.print("c : ");
        int c = keyboard.nextInt();


        int x=a;

        int y=b;
        int z=c;

        a=z;
        b=x;
        c=y;

        System.out.printf("Les nouvelles valeurs sont a=%d , b=%d , c=%d", a,b,c);



    }
}