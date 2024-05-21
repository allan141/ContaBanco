public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 17;
        double valorSolicitado = 18;

        if(saldo > valorSolicitado){
            saldo = saldo - valorSolicitado;
            System.out.println("Saque Efetuado");
            System.out.println("Seu novo saldo da conta é: R$" + saldo);
        }
        else { 
            System.out.println("Saldo Insulficiente");
        }

    }
}
