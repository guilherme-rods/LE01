//14. A expressão an = a1 + (n – 1) * r é denominada termo geral da Progressão Aritmética (PA). 
//Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo), r é a razão e a1 é o primeiro termo da Progressão Aritmética. 
//Escreva um algoritmo que encontre o n-ésimo termo de uma progressão aritmética. 
//Exemplo: a1 = 10, n = 7, r = 3. Resultado: an = 28

import java.util.Scanner;

public class Ex14 {

    public static void executar() {
        
        System.out.println("Exercício 14:");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Defina o primeiro termo (a1) da progressão aritmética: ");
        int a1 = leitor.nextInt();

        System.out.println("Defina o termo n da progressão aritmética: ");
        int n = leitor.nextInt();

        System.out.println("Defina a razão (r) da progressão aritmética: ");
        int r = leitor.nextInt();

        int an = a1 + (n - 1) * r;

        System.out.println("O n-ésimo termo (an) da progressão aritmética é: " + an);

        leitor.close();

    }

}
