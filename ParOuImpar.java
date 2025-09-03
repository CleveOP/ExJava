import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt(); // Lê o número digitado

        // Verifica se o número é par usando o operador módulo (%)
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
