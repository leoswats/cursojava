import java.util.Scanner;
public class MainNewMenu{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        Int A, B, C, D, DIFERENCA;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        
        //nota 1 x peso 1  + nota 2 x peso 2 / soma dos dois pesos
        DIFERENCA = (A * B - C * D);

        System.out.printf("MEDIA = %.1f\n",DIFERENCA);
    }
}