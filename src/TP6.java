import java.util.Scanner;

class TP6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.print("a : ");
        int a = keyboard.nextInt();
        System.out.print("b : ");
        int b = keyboard.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.printf("Les nouvelles valeurs sont a=%d , b=%d ", a,b);
    }
}