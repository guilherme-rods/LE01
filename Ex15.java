//15. Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2, y2), 
//calcule e retorne a distância entre eles. A fórmula que efetua tal cálculo é: d = raiz (((x2 - x1)2) + ((y2 - y1)2)). 
//Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03

import java.util.Scanner;

public class Ex15 {

    public static void executar(String[] args) {
        
        System.out.println("Exercício 15:");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite os dados x1 e y1 do plano P1(x1, y1) respectivamente: ");
        double x1 = leitor.nextDouble();
        double y1 = leitor.nextDouble();

        System.out.println("Digite os dados x2 e y2 do plano P2(x2, y2) respectivamente: ");
        double x2 = leitor.nextDouble();
        double y2 = leitor.nextDouble();

        double d = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

        System.out.printf("A distância é: %.2f\n", d );
    }
}
