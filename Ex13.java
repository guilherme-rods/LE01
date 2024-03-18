//13. Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de operador em outra variável do tipo CARACTERE. 
//Imprima o resultado da operação de A por B se o operador aritmético for válido; 
//caso contrário deve ser impresso uma mensagem de operador não definido. Tratar erro de divisão por zero.

import java.util.Scanner;

public class Ex13 {

    public static void executar(String[] args) {
        
        System.out.println("Exercício 13:");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número 1: ");
        double A = leitor.nextDouble();

        System.out.println("Digite o número 2: ");
        double B = leitor.nextDouble();

        System.out.println("Digite qual operação você deseja: ");
        String oper = leitor.next();

        switch (oper) {
            case "+":
                double soma = A + B;
                System.out.println("A soma entre os números é " + soma);
                break;

            case "-":
                double subtracao = A - B;
                System.out.println("A subtração entre os números é " + subtracao);
            break;

            case "*":
                double multiplicacao = A * B;
                System.out.println("A multiplicação entre os números é " + multiplicacao);
            break;

            case "/":
                double divisao = A / B;
                System.out.println("A divisão entre os números é " + divisao);
                if(B == 0){
                    System.out.println("Para a operação de divisão o número 2 não pode ser 0!");
                }
            break;
            default:
                break;
        }

        leitor.close();

    }

}
