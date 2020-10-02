import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int valor     = 0;
        int Pares     = 0;
        int Impares   = 0;
        int Positivos = 0;
        int Negativos = 0;

        for (int contador = 1; contador <=5 ; contador++){
            valor = teclado.nextInt();
            if (valor % 2 == 0 ){
                Pares++;
            }
            else {
                Impares++;
            }
            if (valor > 0){
                Positivos++;
            }
            else if (valor < 0){
                Negativos++;
            }
        }
    System.out.println(Pares +" valor(es) par(es)");
    System.out.println(Impares +" valor(es) impar(es)");
    System.out.println(Positivos +" valor(es) positivo(s)");
    System.out.println(Negativos +" valor(es) negativo(s)");
    }
}

