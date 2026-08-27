//PARTE 4. IF ANINHADO
//A segunda verificação só acontece se a primeira permitir. Cada etapa tem
//uma resposta própria, então unir tudo em uma única condição com && não
//resolve.
//10. Ler o nome de usuário e a senha. Se o usuário for diferente
//  de admin, imprimir que o usuário não foi encontrado e não
//  verificar a senha. Se o usuário existir, verificar a senha: se for
//  java123, o acesso é liberado; caso contrário, a senha está
//  incorreta. São três saídas diferentes.

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String usuario = teclado.next();

        System.out.print("Digite a senha: ");
        String senha = teclado.next();

        // Primeira etapa: verifica se o usuário existe
        if (!usuario.equals("admin")) {
            System.out.println("Usuário não encontrado.");
        } else {
            // Segunda etapa (Aninhada): só acontece se o usuário for "admin"
            if (senha.equals("java123")) {
                System.out.println("Acesso liberado.");
            } else {
                System.out.println("Senha incorreta.");
            }
        }

        teclado.close();
    }
}
