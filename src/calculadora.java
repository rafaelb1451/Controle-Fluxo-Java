
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora!");
        System.out.println("Digite os valores e escolha a operação que deseja fazer.");

        System.out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.println("Escolha o tipo de operação (+, -, *, /): ");
        String operacao = scanner.next();

        double resultado = 0;

        if ("+".equals(operacao)) {
            resultado = valor1 + valor2;
        } else if("-".equals(operacao)) {
            resultado = valor1 - valor2; 
        } else if("*".equals(operacao)){
            resultado = valor1 * valor2;
        }else if("/".equals(operacao)){
            resultado = valor1/valor2;
        }else{
            System.err.println("Operacao invalida " + operacao);
        }

        System.out.println("Resultado da operação: " + resultado);

    }
}
