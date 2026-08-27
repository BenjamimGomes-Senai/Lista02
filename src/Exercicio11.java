//11. Ler a frequência em porcentagem e a média final de um
//  aluno. Se a frequência for menor que 75 por cento, o aluno está
//  reprovado por falta e a média não deve ser avaliada. Se a
//  frequência for suficiente, avaliar a média: média >= 7 aprovado,
//  média >= 5 e média < 7 recuperação, média < 5 reprovado por nota.

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a frequência do aluno (%): ");
        double frequencia = teclado.nextDouble();

        System.out.print("Digite a média final do aluno: ");
        double media = teclado.nextDouble();

        // Primeira etapa: verifica se a frequência é insuficiente
        if (frequencia < 75.0) {
            System.out.println("Reprovado por falta.");
        } else {
            // Segunda etapa (Aninhada): só acontece se a frequência for suficiente (>= 75%)
            if (media >= 7.0) {
                System.out.println("Aprovado.");
            } else if (media >= 5.0) {
                System.out.println("Recuperação.");
            } else {
                System.out.println("Reprovado por nota.");
            }
        }

        teclado.close();
    }
}