import javax.swing.JOptionPane;

public class SomaNumeros {
    public static void main(String[] args) {
        // Solicita ao usuário um número inteiro
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo:"));

        int soma = 0; // Variável que vai acumular a soma dos números

        // Laço 'for' que vai de 1 até o número digitado pelo usuário
        // 'i' representa cada número dentro do intervalo de 1 até n
        for (int i = 1; i <= n; i++) {
            soma += i; // Adiciona o valor de 'i' à variável 'soma'
        }

        // Exibe o resultado da soma
        JOptionPane.showMessageDialog(null, "A soma dos números de 1 até " + n + " é: " + soma);
    }
}