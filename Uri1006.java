import java.util.Scanner;
public class Uri1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        double A, B, C, MEDIA, PESO1, PESO2, PESO3;

        c
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        PESO1 = 2;
        PESO2 = 3;
        PESO3 = 5;
       
        //nota 1 x peso 1  + nota 2 x peso 2 / soma dos dois pesos
        MEDIA = (A * PESO1 + B * PESO2 + C * PESO3) / (PESO1 + PESO2 + PESO3);

        System.out.printf("MEDIA = %.1f\n",MEDIA);
    }
}