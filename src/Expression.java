public class Expression {
    public static void main(String[] args) {
        double rayon=12.5;
        final double PI=3.14;
        double surface=Math.pow(rayon,2)*Math.PI;
        System.out.printf("Surface = rayon x rayon x PI = %f x %f x %f =%f", rayon,rayon,Math.PI,surface);
    }
}
