//5. Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor da variável A 
//passe a ser o valor da variável B e o valor da variável B passe a ser o valor da variável A. 
//Apresentar uma mensagem com o valor original de cada variável e outra com os valores trocados.

import java.util.Scanner;

public class Ex05 {

    public static void executar() {

        System.out.println("Exercício 05:");
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da variável A: ");
        double A = leitor.nextDouble();
        
        System.out.println("Digite o valor da variável B: ");
        double B = leitor.nextDouble();

        System.out.println("Valor original de A : " + A);
        System.out.println("Valor original de B: " + B);

        double aux1 = 0;

        aux1 = A;
        A = B;
        B = aux1;
        
        System.out.println("Valor trocado de A: " + A);
        System.out.println("Valor trocado de B: " + B);

        leitor.close();
    }

}
