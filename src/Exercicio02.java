//2. Ler um número inteiro e imprimir uma linha para cada
//  característica verdadeira: é positivo, é par, é múltiplo de 5, tem
//  dois dígitos. Para a contagem de dígitos, considere o módulo do
//  número, obtido com Math.abs(numero). Se nenhuma
//  característica for verdadeira, nada é impresso.

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = teclado.nextInt();

        // 1. É positivo (maior que zero)
        if (numero > 0) {
            System.out.println("É positivo.");
        }

        // 2. É par (resto da divisão por 2 é igual a zero)
        if (numero % 2 == 0) {
            System.out.println("É par.");
        }

        // 3. É múltiplo de 5 (resto da divisão por 5 é igual a zero)
        if (numero % 5 == 0) {
            System.out.println("É múltiplo de 5.");
        }

        // 4. Tem dois dígitos (considerando o valor absoluto/módulo)
        int absoluto = Math.abs(numero);
        if (absoluto >= 10 && absoluto <= 99) {
            System.out.println("Tem dois dígitos.");
        }

        teclado.close();
    }
}