//6. Ler o valor de uma compra. Compras de 199,00 ou mais têm
//  frete grátis; abaixo disso o frete é 24,90. Imprimir o valor do
//  frete e o total a pagar nos dois casos.

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da compra (ex. 10.00): ");
        double valorCompra = teclado.nextDouble();

        double frete = 0.0;

        // Caso 1: Compra de 199.00 ou mais (Frete Grátis)
        if (valorCompra >= 199.00) {
            frete = 0.0;
        }

        // Caso 2: Compra abaixo de 199.00 (Frete Pago)
        if (valorCompra < 199.00) {
            frete = 24.90;
        }

        double totalPagar = valorCompra + frete;

        // Imprime os valores com duas casas decimais conforme a regra da entrega
        System.out.printf("Valor do frete: R$ %.2f%n", frete);
        System.out.printf("Total a pagar: R$ %.2f%n", totalPagar);

        teclado.close();
    }
}
