//18. Elabore um algoritmo que receba três notas de um aluno e retorne a sua média harmônica.
//Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8
//Média: 7.37

import java.util.Scanner;

public class Ex18 {

    public static void executar() {
        
        System.out.println("Exercício 18:");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota2 = leitor.nextDouble();

        System.out.println("Digite a nota 3: ");
        double nota3 = leitor.nextDouble();


        double mediaharm = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3)); 

        System.out.println("A média harmônica do aluno é: " + String.format("%.2f", mediaharm));

        leitor.close();

    }

}
