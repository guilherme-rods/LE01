//19. Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seu volume calculado de acordo 
//com a seguinte fórmula: volume = 3.14 * raio2 * altura;
//Exemplo: raio = 10, altura = 15. Volume = 4710

import java.util.Scanner;

public class Ex19 {

    public static void executar() {
        
        System.out.println("Exercício 19:");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o raio do cilindro (cm): ");
        double raio = leitor.nextDouble();

        System.out.println("Digite a altura do cilindro (cm): ");
        double altura = leitor.nextDouble();

        double volume = 3.14 * (raio * raio) * altura;

        System.out.println("O volume do cilindro é: " + String.format("%.2f", volume) + " cm³.");

        leitor.close();

    }

}
