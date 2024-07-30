public class ContaPoupanca extends Conta {
    private static final double TAXA_DE_RENDIMENTO = 0.01;

    public ContaPoupanca(String numero) {
        super(numero);
    }

    public void aplicarRendimento() {
        double saldoAtual = getSaldo();
        depositar(saldoAtual * TAXA_DE_RENDIMENTO);
    }
}
