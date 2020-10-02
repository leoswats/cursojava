import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int HORA_INICIO, HORA_FIM, MINUTO_INICIO, MINUTO_FIM, TOTAL_HORA, TOTAL_MINUTO;

        HORA_INICIO = teclado.nextInt();
        HORA_FIM = teclado.nextInt();
        MINUTO_INICIO = teclado.nextInt();
        MINUTO_FIM = teclado.nextInt();


        TOTAL_HORA = HORA_FIM - HORA_INICIO;
        TOTAL_MINUTO = MINUTO_FIM - MINUTO_INICIO;

        if (TOTAL_HORA <=0) {
            TOTAL_HORA = TOTAL_HORA + 24;
            TOTAL_MINUTO = TOTAL_MINUTO + 60;
        }
        System.out.println("O JOGO DUROU " +TOTAL_HORA +" HORA(S)" + " E" +TOTAL_MINUTO + " MINUTO(S)");
    }
}