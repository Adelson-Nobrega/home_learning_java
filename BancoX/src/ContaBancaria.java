public class ContaBancaria {

    protected String numeroDaConta;
    protected double saldo;

    public ContaBancaria(String numero, double saldoInicial) {
        if (saldoInicial > 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
        this.numeroDaConta = numero;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor; // ou this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saque inválido. Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNumeroDaConta() {
        return this.numeroDaConta;
    }
}
