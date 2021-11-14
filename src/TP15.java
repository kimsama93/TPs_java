import java.util.Scanner;

public class TP15 {
    public static void main(String[] args) {
        int T1[] = {2, 6, 8, 15, 39, 11};
        int T2[] = {21, 33, 12, 19, 0};
        int T3[] = {17, 18, 46};
        int S=0;
        int S1=0;
        int S2=0;
        int S3=0;

        System.out.println("Tableau1 : ");
        for (int i = 0; i < T1.length; i++) {
            System.out.printf("%d \n", T1[i]);
            if(T1[i]%3==0){
                S1=S1+T1[i];
            }
        }

        System.out.println("Tableau2 : ");
        for (int i = 0; i < T2.length; i++) {
            System.out.printf("%d  \n", T2[i]);
            if(T2[i]%3==0){
                S2=S2+T2[i];
            }
        }

        //System.out.printf("somme2 = %d \n", S2);

        System.out.println("Tableau3 : ");
        for (int i = 0; i < T3.length; i++) {
            System.out.printf("%d \n", T3[i]);
            if(T3[i]%3==0){
                S3=S3+T3[i];
            }
        }

        S=S1+S2+S3;

        System.out.println("La somme des valeurs multiples de 3 est : "+S);


    }
}
