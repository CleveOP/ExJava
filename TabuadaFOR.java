import javax.swing.JOptionPane; // Importa a classe para usar caixas de diálogo

public class TabuadaFOR {
    public static void main(String[] args) {
        // Solicita ao usuário que digite um número e converte o texto para inteiro
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para ver a tabuada:"));

        // Cria uma variável do tipo String para armazenar o resultado da tabuada
        String resultado = "Tabuada do " + numero + ":\n";

        // Laço de repetição 'for' que vai de 1 até 10
        // A variável 'i' representa o multiplicador (de 1 a 10)
        for (int i = 1; i <= 10; i++) {
            // Dentro do laço, a cada repetição, adicionamos uma linha à variável 'resultado'
            // Exemplo: se numero = 5 e i = 3, então será "5 x 3 = 15"
            resultado += numero + " x " + i + " = " + (numero * i) + "\n";
        }

        // Exibe o resultado final em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, resultado);
    }
}