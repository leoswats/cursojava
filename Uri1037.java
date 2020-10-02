import java.util.Scanner;
public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        double intervalo1;

        intervalo1 = teclado.nextDouble();
        
        if ((intervalo1 >=0) && (intervalo1 <=25)) {
            System.out.println("Intervalo [0,25]");
        }
        else if ((intervalo1 >25) && (intervalo1 <=50)) {
            System.out.println("Intervalo (25,50]");
        }
        else if ((intervalo1 >50) && (intervalo1 <=75)) {
            System.out.println("Intervalo (50,75]");
        }
        else if ((intervalo1 >75) && (intervalo1 <=100)) {
            System.out.println("Intervalo (75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }
    }
}