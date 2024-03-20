import java.util.Scanner;

class CaixaEletronico{
    private double saldo;
    private Scanner scan = new Scanner(System.in);

    public CaixaEletronico(double saldo){
        this.saldo=saldo;
    }

    double saque(){
        System.out.println("Digite o valor de saque: ");
        double valor = scan.nextDouble();
        saldo = verificaSaque(valor);    
        return saldo;
    }

    double realizaDeposito(double valorDeposito){
        saldo += valorDeposito;
        System.out.println("Deposito de valor: R$"+valorDeposito+ " realizado");
        return saldo;
    }

    double verificaSaque(double valorSaque){
        if (valorSaque > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            saldo -= valorSaque;
            System.out.println("Saque de valor: R$"+valorSaque+ " realizado");
        }
        return saldo;
    }
    void inicializacaoCaixa(){
        System.out.println("Bem-vindo ao caixa eletronico");
        apresentaSaldo(saldo);
        apresentaOpcao();
    }
    void apresentaOpcao(){
        System.out.println("1-Saque");
        System.out.println("2-Deposito");
        System.out.println("3-Consultar saldo");
    }
    void apresentaSaldo(double saldo){
        System.out.println("Seu saldo atual é: R$"+saldo);
    }
}