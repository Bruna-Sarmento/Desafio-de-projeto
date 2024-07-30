public class ContaCorrente extends Conta {
    private static final double LIMITE_DESCUBERTO = 500;

    public ContaCorrente(String numero) {
        super(numero);
    }

    @Override
    public boolean sacar(double valor) {
        double saldoDisponivel = getSaldo() + LIMITE_DESCUBERTO;
        if (valor > 0 && valor <= saldoDisponivel) {
            return super.sacar(valor);
        }
        return false;
    }
}

