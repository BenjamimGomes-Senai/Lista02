//3. Ler a temperatura em graus Celsius e a umidade relativa do
//  ar em porcentagem. Imprimir os alertas que se aplicam:
//  temperatura de 38 graus ou mais gera alerta de calor extremo,
//  umidade abaixo de 30 por cento gera alerta de umidade baixa,
//  temperatura de 35 graus ou mais com umidade abaixo de 20
//  por cento gera alerta de risco de queimada.

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double temperatura = teclado.nextDouble();

        System.out.print("Digite a umidade relativa do ar (%): ");
        double umidade = teclado.nextDouble();

        // 1. Alerta de calor extremo
        if (temperatura >= 38) {
            System.out.println("Alerta: Calor extremo.");
        }

        // 2. Alerta de umidade baixa
        if (umidade < 30) {
            System.out.println("Alerta: Umidade baixa.");
        }

        // 3. Alerta de risco de queimada (ambas as condições devem ser verdadeiras)
        if (temperatura >= 35 && umidade < 20) {
            System.out.println("Alerta: Risco de queimada.");
        }

        teclado.close();
    }
}
