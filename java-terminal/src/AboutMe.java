import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome");

        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade");

        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura");

        Double altura = scanner.nextDouble();

        // Imprimindo dados obtidos:

        System.out.println("Olá, o meu nome é " + nome + " " + sobrenome + ", tenho "+ idade + " anos de idade e "+ altura + " de altura.");

    }
}
