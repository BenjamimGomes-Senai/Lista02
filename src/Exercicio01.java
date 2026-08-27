//1. Ler a idade de uma pessoa e imprimir todas as classificações
//  que se aplicam a ela: 16 anos ou mais pode votar, 18 anos ou
//  mais pode dirigir, 60 anos ou mais é idoso. Uma pessoa de 65
//  anos deve receber as três mensagens.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = teclado.nextInt();

        // Coloquei uma condição para verificar se a idade e menor que 16 para imprimir um aviso
        if (idade < 16) {
            System.out.println("Infelizmente melhor não tem autorização alguma.");
        }
        // IFs Independentes - cada condição é testada por conta própria
        if (idade >= 16) {
            System.out.println("Pode votar.");
        }

        if (idade >= 18) {
            System.out.println("Pode dirigir.");
        }

        if (idade >= 60) {
            System.out.println("É idoso.");
        }
        //  Fechar o objeto Scanner e liberar os recursos do sistema operacional que ele estava usando.
        teclado.close();
    }
}
