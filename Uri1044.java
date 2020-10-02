import java.util.Scanner;
public class Uri1044{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int A, B, MULTIPLOS;

        A = teclado.nextInt();
        B = teclado.nextInt();

        MULTIPLOS = A / B

        if ((B % A) == 0) || (A % B == 0)) {
            System.out.println("Sao Multiplos");
        else {
            System.out.println("Nao sao Multiplos");
        }
        }
    }
}