import java.util.Arrays;
import java.util.Scanner;

public class TP29 {
    static int[] point(String[] directions){
        int[] point=new int[2];
        point[0]=0;
        point[1]=0;
        for(int i=0;i<directions.length;i++){
            if(directions[i]=="gauche"){
                point[0] -=1;
            }
            if(directions[i]=="droite"){
                point[0] +=1;
            }
            if(directions[i]=="haut"){
                point[1] +=1;
            }
            if(directions[i]=="bas"){
                point[1] -=1;
            }
        }
        return point;
    }

    public static void main(String[] args) {

        String[] tab = {"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
        int[] coordonnes= point(tab);

        int[] coordonnees=new int[2];
        coordonnees[0]=0;
        coordonnees[1]=0;

        coordonnees=point(tab);

        System.out.println(Arrays.toString(coordonnees));


    }

}
