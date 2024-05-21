import java.util.Scanner;

/**
 * ContaTerminal
 */
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int conta;
        System.out.println("Digite o seu Número da Conta: " );
        conta = ler.nextInt();

        Scanner ler2 = new Scanner(System.in);
        String agencia;
        System.out.println("Digite a sua Agência: ");
        agencia = ler2.next();

        Scanner ler3 = new Scanner(System.in);
        String nomeCliente;
        System.out.println("Digite Seu Nome: ");
        nomeCliente = ler3.next();

        Scanner ler4 = new Scanner(System.in);
        double saldo;
        System.out.println("Digite qual é o valor do seu Depósito ");
        saldo = ler4.nextDouble();

        System.out.println("Olá, " + nomeCliente + ", Obrigado por criar uma conta em nosso Banco.");
        System.out.println("Sua Agência é " + agencia + ", Conta " + conta);
        System.out.println("E seu saldo R$" + saldo + " Já está Disponivel para Saque.");

    }
}