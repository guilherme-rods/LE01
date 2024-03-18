//2. Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o resultado da sua soma.

import java.util.Scanner;

public class Ex02 {

    public static void executar(String[] args){

        System.out.println("Exercício 02:");

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número 1: ");
        int num1 = leitor.nextInt();

        System.out.println("Digite o número 2: ");
        int num2 = leitor.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma dos dois números escolhidos é: " + soma);

    }

}
