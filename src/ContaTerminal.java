import java.util.Scanner;

/**
*<h1>Conta Bancária</h1>
*
*<p>A classe ContaTerminal representa uma conta bancária com informações básicas
*sobre o cliente, agência, número da conta e saldo.</p>
*
*<p>Essa classe permite criar uma conta bancária e exibir suas informações em
*uma mensagem formatada.</p>
*
*@author Luan Pereira
*@version 1.0
*@since 07/11/2024
*
*/
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        int conta = input.nextInt();
        input.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = input.nextLine();

        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeDoCliente = input.nextLine();

        System.out.println("Por favor, digite o Saldo !");
        double saldo = input.nextDouble();

        input.close();

        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeDoCliente,
                agencia,
                conta,
                saldo
                );

        System.out.println(mensagem);
    }
}