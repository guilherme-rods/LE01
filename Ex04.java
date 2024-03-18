//4. Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos.

import java.util.Scanner;

public class Ex04 {

    public static void executar(String[] args) {

        System.out.println("Exercício 04:");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número 1: ");
        double num1 = leitor.nextDouble();

        System.out.println("Digite o número 2: ");
        double num2 = leitor.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println("A soma entre os números escolhidos: " + soma);
        System.out.println("A subtração entre os números escolhidos: " + subtracao);
        System.out.println("A multiplicação entre os números escolhidos: " + multiplicacao);
        System.out.println("A divisão entre os números escolhidos: " + String.format("%.2f", divisao));
        
    }

}
