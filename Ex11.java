//11. Escreva um algoritmo que leia três valores inteiros distintos e escreva-os em ordem crescente.

import java.util.Scanner;

public class Ex11 {

    public static void executar() {
        
        System.out.println("Exercício 11: ");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = leitor.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = leitor.nextInt();

        int aux = 0;

        for(int i = 0; i < 3; i++){
            if(num1 > num2){
                aux = num1;
                num1 = num2;
                num2 = aux;
            }else if(num2 > num3){
                aux = num2;
                num2 = num3;
                num3 = aux;
            }else if(num1 > num2){
                aux = num1;
                num1 = num2;
                num2 = aux;
            }
        }

        System.out.println("Valores em ordem crescente:");
        System.out.println(num1 + ", " + num2 + ", " + num3);

        leitor.close();

    }

}