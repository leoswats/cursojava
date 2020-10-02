import java.util.Scanner;
public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
    
        int valor, alcool, gasolina, diesel;
    
        alcool   = 0;
        gasolina = 0;
        diesel   = 0;
    
        do {
            valor = teclado.nextInt();
            if (valor == 1 ) { 
            alcool++;
            }
            else if (valor == 2 ) {
            gasolina++;
            }
            else if (valor == 3 ) {
            diesel++;
            }
            
        } while (valor != 4);
            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: "+ alcool);
            System.out.println("Gasolina: "+ gasolina);
            System.out.println("Diesel: "+ diesel);
    }
}