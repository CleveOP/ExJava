import javax.swing.JOptionPane;

public class CalculadoraIMC {
    public static void main(String[] args) {
        // Entrada de dados
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso (kg):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura (m):"));

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Classificação
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }

        // Saída de dados
        JOptionPane.showMessageDialog(null,
            "Nome: " + nome +
            "\nIMC: " + String.format("%.2f", imc) +
            "\nClassificação: " + classificacao);
    }
}