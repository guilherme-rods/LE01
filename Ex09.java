//9. Leia dois números nas variáveis A e B e identifique se os valores são iguais ou diferentes. 
//Caso eles sejam iguais imprima uma mensagem dizendo que são iguais. 
//Caso sejam diferentes, informe que são diferentes e qual número é o maior.

import java.util.Scanner;

public class Ex09 {

    public static void executar(String[] args){

        System.out.println("Exercício 09:");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número 1: ");
        int num1 = leitor.nextInt();

        System.out.println("Digite o número 2: ");
        int num2 = leitor.nextInt();

        if(num1 == num2){
            System.out.println("Os números são iguais!");
        }else{
            System.out.println("Os números são diferentes!");
        }

        leitor.close();

    }

}
