//4. Ler dois números inteiros e informar se o primeiro é múltiplo
//  do segundo. Antes de calcular, verificar se o segundo número é
//  zero e, nesse caso, informar que a verificação não pode ser
//  feita.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int primeiro = teclado.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int segundo = teclado.nextInt();

        // 1. Verifica primeiro se o segundo número é zero
        if (segundo == 0) {
            System.out.println("A verificação não pode ser feita.");
        }

        // 2. Só faz a verificação se o segundo número NÃO for zero
        if (segundo != 0 && primeiro % segundo == 0) {
            System.out.println("O primeiro número é múltiplo do segundo.");
        } else {
            System.out.println("O primeiro número NÃO é múltiplo do segundo.");
        }

        teclado.close();
    }
}
