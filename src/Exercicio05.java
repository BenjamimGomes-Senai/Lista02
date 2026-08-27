//5. Ler um ano e informar se ele é bissexto. Um ano é bissexto
//  quando é divisível por 4 e não é divisível por 100, ou quando é
//  divisível por 400.

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = teclado.nextInt();

        // Regra do ano bissexto traduzida para lógica de programação
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano é bissexto.");
        } else {
            System.out.println("O ano NÃO é bissexto.");
        }

        teclado.close();
    }
}
