//PARTE 6. EXERCÍCIO INTEGRADOR
//Usa as quatro estruturas na mesma classe.
//15. Terminal de estacionamento. Ler o tipo de veículo, onde 1 é carro e 2 é moto, e definir a tarifa por hora com switch: carro
//  custa 8,00 e moto custa 5,00. Tipo diferente imprime opção inválida e o programa não realiza as etapas seguintes. Ler a
//  quantidade de horas e calcular o valor. Ler se o cliente tem cupom, respondendo sim ou nao: havendo cupom, verificar se
//  o valor é de 50,00 ou mais; nesse caso aplicar 20 por cento de desconto, caso contrário informar que o cupom vale apenas
//  acima de 50,00. Em ifs independentes, imprimir aviso de permanência longa quando passar de 12 horas e aviso de
//  cobrança de diária quando passar de 24 horas. Classificar a permanência com else if: até 2 horas curta, até 6 horas média,
//  acima disso longa. Imprimir o valor final com duas casas.

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tipo de veículo (1 - Carro, 2 - Moto): ");
        int tipoVeiculo = teclado.nextInt();

        double tarifaPorHora = 0.0;
        boolean tipoValido = true;

        // 1. ESTRUTURA SWITCH: Define a tarifa ou invalida o programa
        switch (tipoVeiculo) {
            case 1 -> tarifaPorHora = 8.00;
            case 2 -> tarifaPorHora = 5.00;
            default -> {
                System.out.println("Opção inválida.");
                tipoValido = false;
            }
        }

        // Se o tipo for inválido, o programa não realiza as etapas seguintes
        if (tipoValido) {
            System.out.print("Digite a quantidade de horas que o veículo permaneceu: ");
            int horas = teclado.nextInt();

            double valorTotal = tarifaPorHora * horas;

            System.out.print("O cliente possui cupom? (sim / nao): ");
            String possuiCupom = teclado.next();

            // 2. ESTRUTURA IF ANINHADO: Validação do cupom de desconto
            if (possuiCupom.equalsIgnoreCase("sim")) {
                if (valorTotal >= 50.00) {
                    valorTotal = valorTotal * 0.80; // Aplica 20% de desconto
                    System.out.println("Cupom aplicado! Desconto de 20% concedido.");
                } else {
                    System.out.println("O cupom vale apenas para compras acima de R$ 50,00.");
                }
            }

            // 3. ESTRUTURA IFS INDEPENDENTES: Alertas de tempo de permanência
            if (horas > 12) {
                System.out.println("Aviso: Permanência longa.");
            }
            if (horas > 24) {
                System.out.println("Aviso: Cobrança de diária.");
            }

            // 4. ESTRUTURA ELSE IF ENCADEADO: Classificação da permanência
            if (horas <= 2) {
                System.out.println("Classificação da permanência: Curta.");
            } else if (horas <= 6) {
                System.out.println("Classificação da permanência: Média.");
            } else {
                System.out.println("Classificação da permanência: Longa.");
            }

            // Impressão do valor final com duas casas decimais
            System.out.printf("Valor final a pagar: R$ %.2f%n", valorTotal);
        }

        teclado.close();
    }
}
