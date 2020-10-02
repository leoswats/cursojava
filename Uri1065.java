import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int valor     = 0;
        int Pares     = 0;

        for (int contador = 1; contador <=5 ; contador++){
            valor = teclado.nextInt();
            if (valor % 2 == 0 ){
                Pares++;
            }
        }
    System.out.println(Pares +"valores pares");
    }
}