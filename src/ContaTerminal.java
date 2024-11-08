/**
*<h1>Conta Bancária</h1>
*
*<p>A classe ContaTerminal representa uma conta bancária com informações básicas
*sobre o cliente, agência, número da conta e saldo.</p>
*
*<p>Essa classe permite criar uma conta bancária e exibir suas informações em
*uma mensagem formatada.</p>
* 
* <p>Exemplo de uso:</p>
* <pre>
*     ContaTerminal conta = new ContaTerminal(1021, "067-8", "Luan Pereira", 237.48);
*     conta.exibirMensagem();
* </pre>
*
*@author Luan Pereira
*@version 1.0
*@since 07/11/2024
*
*/
public class ContaTerminal {
    private int conta;
    private String agencia;
    private String nomeDoCliente;
    private double saldo;

    /**
     * Construtor para a classe {@link ContaTerminal}
     *
     * @param conta         O número da conta
     * @param agencia       O número da agência
     * @param nomeDoCliente O nome do clinete
     * @param saldo         O saldo inicial da conta
     */
    public ContaTerminal(int conta, String agencia, String nomeDoCliente, double saldo) {
        this.conta = conta;
        this.agencia = agencia;
        this.nomeDoCliente = nomeDoCliente;
        this.saldo = saldo;
    }

    /**
     * Get saldo.
     *
     * @return saldo como double.
     */
    public double getSaldo()
    {
        return saldo;
    }
    
    /**
     * Set saldo.
     *
     * @param saldo Altera o valor do saldo.
     */
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

     /**
     * Exibe uma mensagem formatada com as informações da conta.
     * A mensagem inclui o nome do cliente, o número da agência,
     * o número da conta e o saldo.
     */
    public void exibirMensagem() {
        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeDoCliente, agencia, conta, saldo
                );
        System.out.println(mensagem);
    }
}