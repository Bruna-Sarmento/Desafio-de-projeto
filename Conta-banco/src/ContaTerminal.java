import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis para armazenar dados da conta
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitação e leitura do número da conta
        System.out.print("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();

        // Limpa o buffer do scanner para evitar problemas na leitura do próximo input
        scanner.nextLine();

        // Solicitação e leitura da agência
        System.out.print("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();

        // Solicitação e leitura do nome do cliente
        System.out.print("Por favor, digite o nome completo do cliente: ");
        nomeCliente = scanner.nextLine();

        // Solicitação e leitura do saldo
        System.out.print("Por favor, digite o saldo inicial da conta: ");
        saldo = scanner.nextDouble();

        // Exibição da mensagem final com os dados da conta
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo inicial é de R$" + saldo + ".");

        // Fechando o scanner
        scanner.close();
    }
}
