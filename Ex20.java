//20. Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em uma viagem, 
//utilizando um automóvel que faz 12km por litro e considerando que são fornecidos o tempo em hora 
//e a velocidade média da viagem.

import java.util.Scanner;

public class Ex20 {

    public static void executar() {
        
        System.out.println("Exercício 20:");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas da viagem: ");
        double tempo = leitor.nextDouble();

        System.out.println("Digite a velocidade média (Km/h) do carro: ");
        double veloc = leitor.nextDouble();

        double consumo = (tempo * veloc) / 12;

        System.out.println("O consumo de combustível nessa viagem foi de " + String.format("%.2f", consumo) + " litros.");

        leitor.close();

    }

}
