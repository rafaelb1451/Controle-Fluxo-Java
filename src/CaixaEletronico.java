import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1800.0;
        double valorSolicitado;

        System.out.println("Digite o valor que deseja sacar: ");
        valorSolicitado = scanner.nextDouble();

        if (valorSolicitado > saldo) {
            System.out.println("Saldo insuficiente!");
        }else{
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso, seu saldo é de: " .concat(String.valueOf(saldo)));
        }

        scanner.close();

    }
}
