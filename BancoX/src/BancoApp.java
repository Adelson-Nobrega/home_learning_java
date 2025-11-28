void main() {

    Banco caixa = new Banco();
    ContaPoupanca poup1 = new ContaPoupanca("12345", 500.00, 0.05);
    ContaCorrente cc1 = new ContaCorrente("54321", 1000.00, 2000.00);
    ContaPoupanca poup2 = new ContaPoupanca("12345", 700.00, 0.05);

    caixa.adicionarConta(poup1);
    caixa.adicionarConta(cc1);
    caixa.adicionarConta(poup2);


    double saldoTotal = caixa.calcularSaldoTotalDoBanco();
    System.out.println("Saldo total do banco: R$ " + saldoTotal);

    caixa.aplicarRendimentoEmTodasAsPoupancas();

    saldoTotal = caixa.calcularSaldoTotalDoBanco();
    System.out.println("Saldo total do banco após juros: R$ " + saldoTotal);


    poup1.depositar(750);
    poup1.aplicarRendimento();

    cc1.sacar(1500);
}