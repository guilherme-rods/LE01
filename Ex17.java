//17. Elabore um algoritmo que receba três notas de um aluno os pesos referentes a cada nota e retorne a sua média ponderada.
// Veja o cálculo da média ponderada:
//Média ponderada =
//nota1 * peso1 + nota2 * peso2 + nota3 * peso3
//peso1 + peso2 + peso3
//Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1 = 5, peso2 = 3, peso3 = 2
//Média ponderada = 8.25

import java.util.Scanner;

public class Ex17 {

    public static void executar(String[] args) {
        
        System.out.println("Exercício 16:");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota 1 e seu peso: ");
        double nota1 = leitor.nextDouble();
        double peso1 = leitor.nextDouble();

        System.out.println("Digite a nota 2 e seu peso: ");
        double nota2 = leitor.nextDouble();
        double peso2 = leitor.nextDouble();

        System.out.println("Digite a nota 3 e seu peso: ");
        double nota3 = leitor.nextDouble();
        double peso3 = leitor.nextDouble();

        double peso = peso1 + peso2 + peso3;

        double mediapond = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / peso;

        System.out.println("A média ponderada do aluno é: " + String.format("%.2f", mediapond));

        leitor.close();

    }

}
