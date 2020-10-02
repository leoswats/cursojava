import java.util.Scanner;
public class Exercicio2a{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        //Defino as variaveis que preciso
        float lado, area;

        //passo1 - entrada
        System.out.println("digite o valor do LADO");
        lado = teclado.nextFloat();

        //passo 2 - processamento 
        area = lado * lado;
        
        //passo 3 - saida 
        System.out.println("valor da area"+ area);

    }
}