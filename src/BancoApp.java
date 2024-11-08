import java.util.Scanner;

public class BancoApp {
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

        ContaTerminal contaCliente = new ContaTerminal(conta, agencia, nomeDoCliente, saldo);

        contaCliente.exibirMensagem();
    }
}
