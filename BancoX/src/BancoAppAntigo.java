void main() {
    // Criando um objeto (uma instância) da classe ContaBancaria
    ContaBancaria minhaConta = new ContaBancaria("57916", 500.00);

    System.out.println("Saldo inicial: R$" + minhaConta.getSaldo());

    minhaConta.depositar(250.00);
    minhaConta.sacar(100.00);
    minhaConta.sacar(1000.00); // Teste de saque inválido

    System.out.println("Saldo final: R$" + minhaConta.getSaldo());
}
