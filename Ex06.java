//6. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é:
// F = (9 * C + 160) / 5

import java.util.Scanner;

public class Ex06 {

    public static void executar(String[] args) {

        System.out.println("Exercício 06:");
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma temperatura em graus Celsius (°C): ");
        double celsius = leitor.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit + " °F.");

        leitor.close();

    }

}
