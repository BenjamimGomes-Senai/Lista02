//PARTE 5. SWITCH
//Comparação por valor exato. Usar a forma case ->, que dispensa o break.
//13. Ler dois números do tipo double e uma opção de 1 a 4,
//  onde 1 é soma, 2 é subtração, 3 é multiplicação e 4 é divisão.
//  Usar switch para executar a operação escolhida e imprimir o
//  resultado. Qualquer outra opção cai no default como opção
//  inválida. Na divisão, verificar antes se o divisor é zero.

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = teclado.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        int opcao = teclado.nextInt();

        // Switch utilizando a sintaxe moderna "case ->" (sem necessidade de break)
        switch (opcao) {
            case 1 -> System.out.printf("Resultado da soma: %.2f%n", (num1 + num2));
            case 2 -> System.out.printf("Resultado da subtração: %.2f%n", (num1 - num2));
            case 3 -> System.out.printf("Resultado da multiplicação: %.2f%n", (num1 * num2));
            case 4 -> {
                // Na divisão, precisamos verificar antes se o divisor é zero
                if (num2 == 0) {
                    System.out.println("Erro: Não é possível dividir por zero.");
                } else {
                    System.out.printf("Resultado da divisão: %.2f%n", (num1 / num2));
                }
            }
            default -> System.out.println("Opção inválida.");
        }

        teclado.close();
    }
}
