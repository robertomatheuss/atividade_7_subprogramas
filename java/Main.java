import java.util.Scanner;

public class Main{
    static double saldo = 1000.0; 
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int opcao;
        double valor;
        CaixaEletronico primeiroCaixa = new CaixaEletronico(saldo);
        primeiroCaixa.inicializacaoCaixa();
        opcao = scan.nextInt();
        if(opcao == 1){
            saldo = primeiroCaixa.saque();
        }else if(opcao ==2 ){
            System.out.println("Digite o valor do deposito: ");
            valor = scan.nextDouble();
            saldo = primeiroCaixa.realizaDeposito(valor);
        }else if (opcao ==3){
            primeiroCaixa.apresentaSaldo(saldo);
        }else{
            System.out.println("Opcao invalida.");
        }
        scan.close();
    }
}