import java.util.Scanner;
public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        double A, B, MEDIA, PESO1, PESO2;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        PESO1 = 3.5;
        PESO2 = 7.5;
       
        //nota 1 x peso 1  + nota 2 x peso 2 / soma dos dois pesos
        MEDIA = (A * PESO1 + B * PESO2) / (PESO1 + PESO2);

        System.out.printf("MEDIA = %.5f\n",MEDIA);
    }
}