import java.util.Locale;
import java.util.Scanner;

/**
 * Classe ContaTerminal
 * Esta classe representa um terminal de criação de contas bancárias para o Banco Ally.
 * O usuário pode inserir o número da conta, agência, nome completo e o valor do depósito inicial.
 */
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        try (
            // Criação do objeto Scanner para leitura de dados da entrada padrão (console)
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            // Mensagens de boas-vindas
            System.out.println("******BANCO ALLY NA DIO******");
            System.out.println("******BEM VINDA(O)!******");
            System.out.println(" ");
            
            // Solicita o número da conta ao usuário
            System.out.println("Por favor, digite o número da sua conta: ");
            int numeroDaConta = scanner.nextInt();

            // Solicita a agência ao usuário
            System.out.println("Por favor, digite a sua agência: ");
            String agencia = scanner.next();

            // Consumir a nova linha após o nextInt e next
            scanner.nextLine();

            // Solicita o nome completo ao usuário
            System.out.println("Por favor, digite o seu nome completo: ");
            String nomeCompleto = scanner.nextLine();

            // Solicita o valor do depósito inicial ao usuário
            System.out.println("Por favor, digite o valor do seu depósito inicial: ");
            Double saldoInicial = scanner.nextDouble();

            // Mensagem de confirmação da criação da conta
            System.out.println("Olá, " + nomeCompleto);
            System.out.println("Obrigado por criar uma conta em nosso banco, a sua agência é " + agencia + ", conta " + numeroDaConta + ", e o seu saldo inicial de R$" + saldoInicial + " já está disponível para saque!");
        }
    }
}
