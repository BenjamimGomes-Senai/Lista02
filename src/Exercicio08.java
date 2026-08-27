//8. Ler a velocidade máxima da via e a velocidade do veículo.
//  Classificar a infração conforme o Código de Trânsito Brasileiro:
//  dentro do limite não há multa, até 20 por cento acima do limite
//  a infração é média, acima de 20 e até 50 por cento é grave,
//  acima de 50 por cento é gravíssima.

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a velocidade máxima da via (km/h): ");
        double velMaxima = teclado.nextDouble();

        System.out.print("Digite a velocidade do veículo (km/h): ");
        double velVeiculo = teclado.nextDouble();

        // Se estiver dentro do limite, não há necessidade de calcular percentual
        if (velVeiculo <= velMaxima) {
            System.out.println("Dentro do limite. Não há multa.");
        } else {
            // Calcula quantos por cento a velocidade do veículo está acima do limite
            double percentualAcima = ((velVeiculo - velMaxima) / velMaxima) * 100;

            // Classificação das infrações (faixas excludentes)
            if (percentualAcima <= 20.0) {
                System.out.println("Infração Média.");
            } else if (percentualAcima <= 50.0) {
                System.out.println("Infração Grave.");
            } else {
                System.out.println("Infração Gravíssima.");
            }
        }

        teclado.close();
    }
}
