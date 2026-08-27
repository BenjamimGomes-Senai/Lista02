//9. Ler o salário de um funcionário e o tempo de casa em anos.
//  Definir o bônus: menos de 1 ano não recebe, de 1 a 3 anos
//  recebe 5 por cento, acima de 3 e até 10 anos recebe 10 por
//  cento, acima de 10 anos recebe 15 por cento. Imprimir o
//  percentual e o valor do bônus.

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = teclado.nextDouble();

        System.out.print("Digite o tempo de casa (em anos): ");
        int tempoCasa = teclado.nextInt();

        double percentual = 0.0;

        // Estrutura encadeada para definir a faixa de bônus excludente
        if (tempoCasa < 1) {
            percentual = 0.0;
        } else if (tempoCasa <= 3) {
            percentual = 5.0;
        } else if (tempoCasa <= 10) {
            percentual = 10.0;
        } else {
            percentual = 15.0;
        }

        // Cálculos finais
        double valorBonus = salario * (percentual / 100.0);

        // Impressão dos resultados com formatação de duas casas decimais
        System.out.printf("Percentual do bônus: %.2f%%%n", percentual);
        System.out.printf("Valor do bônus: R$ %.2f%n", valorBonus);

        teclado.close();
    }
}
