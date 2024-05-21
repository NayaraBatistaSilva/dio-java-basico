import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //captação de dados
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Banco Pinel");

        System.out.println("Para acessar o seu saldo:");

        System.out.println("Digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu Nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        double saldo = 237.48;


        //imprimindo os dados
        System.out.println("Olá " +nomeCliente+ " " +sobrenome +" obrigado por criar uma conta em nosso banco, sua agência é " +agencia +", conta " +numero +" e seu saldo R$" +saldo +" já está disponível para saque." );




    }
}
