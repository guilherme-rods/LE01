//7. Escreva um algoritmo que leia um número e diga, através de uma mensagem, se este número está no intervalo entre 100 e 200. 
//Caso o número esteja fora do intervalo o usuário também deverá ser informado.

import java.util.Scanner;

public class Ex07 {

    public static void executar() {
        
        System.out.println("Exercício 07: ");

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número entre 100 e 200: ");
        int num = leitor.nextInt();

        if(100 <= num && num <= 200){

            System.out.println("O número escolhido está dentro do intervalo determinado!");

        }else{

            System.out.println("O número escolhido está fora do intervalor determinado!");
        }

        leitor.close();
    }

}
