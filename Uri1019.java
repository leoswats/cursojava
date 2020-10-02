import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int TEMPO;
        int h, m, s;
        int SOBRA;

        TEMPO = teclado.nextInt();
        h = TEMPO / 3600;
        SOBRA = TEMPO % 3600;

        m = resto / 60;
        s = resto % 60;
        System.out.println(h+":"+m+":"+s);
        }
}