public class TesteBanco {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("123");
        ContaPoupanca contaPoupanca = new ContaPoupanca("456");

        contaCorrente.depositar(1000);
        contaPoupanca.depositar(500);

        System.out.println("Antes da transferência:");
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

        contaCorrente.transferir(200, contaPoupanca);

        System.out.println("Depois da transferência:");
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

        contaPoupanca.aplicarRendimento();
        System.out.println("Após aplicação de rendimento:");
        System.out.println(contaPoupanca);
    }
}
