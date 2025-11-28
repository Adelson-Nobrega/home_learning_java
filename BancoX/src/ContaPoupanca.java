public class ContaPoupanca extends ContaBancaria{

    private double taxaDeJuros; // Atributo específico da Conta Poupança

    public ContaPoupanca(String numero, double saldoInicial, double taxaDeJuros) {
        super(numero, saldoInicial); // Chama o construtor da classe pai (ContaBancaria)
        this.taxaDeJuros = taxaDeJuros;
    }

    public void aplicarRendimento() {
        this.saldo += this.saldo * this.taxaDeJuros;
        System.out.println("Juros de " + (this.taxaDeJuros * 100) + "% aplicados. Novo saldo: R$" + this.saldo);
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

}
