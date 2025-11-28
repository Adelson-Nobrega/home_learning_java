public class ContaCorrente extends ContaBancaria{

    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double saldoInicial, double limiteChequeEspecial) {
        super(numero, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= (this.saldo + this.limiteChequeEspecial)) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Novo saldo: R$" + this.saldo);
            return true;
        } else {
            System.out.println("Saque inválido. Saldo insuficiente (incluindo cheque especial) ou valor inválido.");
            return false;
        }
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
}
