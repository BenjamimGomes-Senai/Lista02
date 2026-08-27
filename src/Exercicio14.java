//14. Ler o número de um mês de 1 a 12 e imprimir a quantidade
//  de dias desse mês. Agrupar os meses de mesma duração em
//  um único case, separando os valores por vírgula. Considerar
//  fevereiro com 28 dias. Valores fora da faixa de 1 a 12 devem
//  ser tratados no default.

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de um mês (1 a 12): ");
        int mes = teclado.nextInt();

        // Switch moderno agrupando meses com a mesma quantidade de dias
        switch (mes) {
            // Janeiro, Março, Maio, Julho, Agosto, Outubro, Dezembro
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Este mês tem 31 dias.");

            // Abril, Junho, Setembro, Novembro
            case 4, 6, 9, 11 -> System.out.println("Este mês tem 30 dias.");

            // Fevereiro
            case 2 -> System.out.println("Este mês tem 28 dias.");

            // Qualquer valor fora da faixa de 1 a 12
            default -> System.out.println("Mês inválido.");
        }

        teclado.close();
    }
}
