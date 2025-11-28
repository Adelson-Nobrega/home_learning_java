import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<ContaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        this.contas.add(conta);
    }

    public double calcularSaldoTotalDoBanco() {
        double saldoTotal = 0.0;
        for (ContaBancaria conta : this.contas) {
            saldoTotal += conta.getSaldo();
        }
        return saldoTotal;
    }

    public void aplicarRendimentoEmTodasAsPoupancas() {
        for (ContaBancaria conta : this.contas) {
            if (conta instanceof ContaPoupanca) {
                ((ContaPoupanca) conta).aplicarRendimento();
            }
        }
    }
}
