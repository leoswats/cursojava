import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        double SALARIO;
        double NOVO_SALARIO, REAJUSTE;

        SALARIO = teclado.nextDouble();

        if (SALARIO <= 400){
            REAJUSTE = SALARIO *15/100;
            NOVO_SALARIO = REAJUSTE + SALARIO;
            System.out.printf("Novo salario: %.2f\n", NOVO_SALARIO);
            System.out.printf("Reajuste ganho: %.2f\n", REAJUSTE);
            System.out.println("Em percentual: 15 %");
        }
        else if ((SALARIO > 400) && (SALARIO <= 800)){
            REAJUSTE = SALARIO *12/100;
            NOVO_SALARIO = REAJUSTE + SALARIO;
            System.out.printf("Novo Salario: %.2f\n", NOVO_SALARIO);
            System.out.printf("Reajuste ganho: %.2f\n", REAJUSTE);
            System.out.println("Em Percentual: 12 %");
        }
        else if ((SALARIO > 800) && (SALARIO <= 1200)){
             REAJUSTE = SALARIO *10/100;
            NOVO_SALARIO = REAJUSTE + SALARIO;
            System.out.printf("Novo salario: %.2f\n", NOVO_SALARIO);
            System.out.printf("Reajuste ganho: %.2f\n", REAJUSTE);
            System.out.println("Em percentual: 10 %");
        }
        else if ((SALARIO > 1200) && (SALARIO <= 2000)){
            REAJUSTE = SALARIO *7/100;
            NOVO_SALARIO = REAJUSTE + SALARIO;
            System.out.printf("Novo salario: %.2f\n", NOVO_SALARIO);
            System.out.printf("Reajuste ganho: %.2f\n", REAJUSTE);
            System.out.println("Em percentual: 7 %");
        }
        else if (SALARIO > 2000){
            REAJUSTE = SALARIO *4/100;
            NOVO_SALARIO = REAJUSTE + SALARIO;
            System.out.printf("Novo salario: %.2f\n", NOVO_SALARIO);
            System.out.printf("Reajuste ganho: %.2f\n", REAJUSTE);
            System.out.println("Em percentual: 4 %");
        }
    }
}