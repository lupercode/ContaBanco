import java.util.Scanner;

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