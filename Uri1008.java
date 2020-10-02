import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int NUMBER, HORAST;
        double VALOR_HORA, SALARY;

        NUMBER = teclado.nextInt();
        HORAST = teclado.nextInt();
        VALOR_HORA = teclado.nextDouble();
       
        //nota 1 x peso 1  + nota 2 x peso 2 / soma dos dois pesos
        SALARY = (HORAST * VALOR_HORA);

        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f\n",SALARY);
    }
}