
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora!");
        System.out.println("Deseja iniciar? S/N");
        String opcao = scanner.next();

        while (opcao.equalsIgnoreCase("S")) {
            System.out.print("Digite o primeiro valor: ");
            double valor1 = scanner.nextDouble();

            System.out.print("Digite o segundo valor: ");
            double valor2 = scanner.nextDouble();

            System.out.print("Escolha a operação (+, -, *, /): ");
            String operacao = scanner.next();

            double resultado = 0;
            boolean valido = true;

            switch (operacao) {
                case "+" -> resultado = valor1 + valor2;
                case "-" -> resultado = valor1 - valor2;
                case "*" -> resultado = valor1 * valor2;
                case "/" -> {
                    if (valor2 == 0) {
                        System.out.println("Erro: não é possível dividir por zero.");
                        valido = false;
                    } else {
                        resultado = valor1 / valor2;
                    }
                }
                default -> {
                    System.out.println("Operação inválida: " + operacao);
                    valido = false;
                }
            }

            if (valido) {
                System.out.println("Resultado: " + resultado);
            }

            System.out.println("Deseja continuar? (S/N)");
            opcao = scanner.next();
        }

        System.out.println("Encerrando a calculadora. Até logo!");
        scanner.close();
    }
}
    