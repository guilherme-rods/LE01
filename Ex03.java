//3. Escreva um algoritmo que leia os valores de dois números inteiros distintos nas variáveis A e B e informe qual deles é o maior. 
//Caso os números sejam iguais informar ao usuário que a sequência de números informados é inválida.

import java.util.Scanner;

public class Ex03 {

    public static void executar() {

        System.out.println("Exercício 03:");

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número 1: ");
        int A = leitor.nextInt();

        System.out.println("Digite o número 2: ");
        int B = leitor.nextInt();

        if(A > B){
            System.out.println("O maior número é: " + A);
        }else if(B > A){
            System.out.println("O maior número é: " + B);
        }else{
            System.out.println("A sequência de números informados é inválida");
        }

    }



}
