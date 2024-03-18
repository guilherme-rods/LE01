//12. Escreva um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido.

import java.util.Scanner;

public class Ex12 {

    public static void executar(String[] args) {
        
        System.out.println("Exercício 12:");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número do mês: ");
        int mes = leitor.nextInt();

        String [] mesextenso= {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        if(1 <= mes && mes <= 12){

            System.out.println("Mês escolhido: " + mesextenso[mes]);

        }else{

            System.out.println("Mês inválido!");

        }

        leitor.close();
    }

}
