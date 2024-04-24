import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do titular:");
        String nomeCliente = scanner.nextLine(); // Alterado para nextLine()
        System.out.println("Por favor digite o numero da conta:");
        int numero = scanner.nextInt();
        System.out.println("Por favor digite o numero da agencia:");
        scanner.nextLine(); // Adicionado para consumir a nova linha restante
        String agencia = scanner.nextLine();
        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco," +
                        " sua agencia é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);
        scanner.close();

    }
}
