//12. Ler o saldo da conta, o limite diário de saque e o valor
//  solicitado. Se o saldo for menor que o valor, informar saldo
//  insuficiente e não realizar as verificações seguintes. Havendo
//  saldo, verificar o limite: se o valor ultrapassar o limite diário,
//  informar isso; caso contrário, efetuar o saque e imprimir o novo saldo.

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: R$ ");
        double saldo = teclado.nextDouble();

        System.out.print("Digite o limite diário de saque: R$ ");
        double limiteDiario = teclado.nextDouble();

        System.out.print("Digite o valor solicitado para o saque: R$ ");
        double valorSolicitado = teclado.nextDouble();

        // Primeira etapa: verifica se há saldo suficiente
        if (saldo < valorSolicitado) {
            System.out.println("Saldo insuficiente.");
        } else {
            // Segunda etapa (Aninhada): só acontece se houver saldo suficiente
            if (valorSolicitado > limiteDiario) {
                System.out.println("O valor ultrapassa o limite diário.");
            } else {
                // Caso passe em todas as validações, efetua o saque
                saldo = saldo - valorSolicitado; // Atualiza o saldo
                System.out.printf("Saque efetuado com sucesso! Novo saldo: R$ %.2f%n", saldo);
            }
        }

        teclado.close();
    }
}
