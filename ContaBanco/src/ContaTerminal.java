import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * <h1>ContaTerminal</h1>
     * Desafio de Projeto da DIO - Simulando Uma Conta Bancária Através Do Terminal/Console.
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   28/04/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine().toUpperCase();
        System.out.println("Por favor, digite o saldo do Cliente:");
        double saldo = scanner.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",nomeCliente,agencia,numero,saldo);
        scanner.close();
    }
}
