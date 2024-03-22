//8. Escreva um algoritmo que leia um número e mostre uma mensagem caso este número seja maior ou igual a 50,
// outra se ele for menor que 50.

import java.util.Scanner;

public class Ex08 {

    public static void executar() {
        
        System.out.println("Exercício 08: ");

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int num = leitor.nextInt();

        if(num >= 50){

            System.out.println("O número escolhido é maior ou igual a 50!");

        }else{

            System.out.println("O número escolhido é menor que 50!");
        }

        leitor.close();
    }

}
