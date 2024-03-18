//10. Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. 
//Caso o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número inválido!”.

import java.util.Scanner;

public class Ex10 {

    public static void executar(String[] args){

        System.out.println("Exercício 10:");

        Scanner leitor = new Scanner(System.in);

        String [] numextenso = {"", "Um", "Dois", "Três", "Quatro", "Cinco"};

        System.out.println("Digite um número entre 1 e 5: ");
        int num = leitor.nextInt();

        if(1 <= num && num <= 5){

            System.out.println(numextenso[num]);

        }else{

            System.out.println("Número inválido!");

        }

        leitor.close();

    }

}
