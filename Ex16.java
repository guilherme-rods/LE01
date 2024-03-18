//16. Elabore um algoritmo que receba três notas de um aluno e retorne a sua média aritmética. 
//Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83

import java.util.Scanner;

public class Ex16 {

    public static void executar(String[] args) {
        
        System.out.println("Exercício 16:");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota2 = leitor.nextDouble();

        System.out.println("Digite a nota 3: ");
        double nota3 = leitor.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média do aluno é: " + String.format("%.2f", media));

        leitor.close();

    }

}
