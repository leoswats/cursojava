import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int HI, HF, TH;

        HI = teclado.nextInt();
        HF = teclado.nextInt();

        TH = HF - HI;

        if (TH <=0) {
            TH = TH + 24;
        }
        System.out.println("O JOGO DUROU " +TH +" HORA(S)");
    }
}