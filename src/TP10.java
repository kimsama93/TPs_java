import java.util.Scanner;
class TP10 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        for (int i=2 ;i<=10 ; i++) {
            System.out.printf("Table de %d \n",i);
            for (int j = 1; j <= 10; j++) {


                System.out.printf("%d x %d = %d  \n", i, j,i*j);
            }

        }
    }

}
