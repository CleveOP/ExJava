
    import javax.swing.JOptionPane;

public class MediaComJOptionPane {
    public static void main(String[] args) {
        // Solicita o nome do aluno usando uma janela de entrada
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");

        // Solicita as três notas, convertendo de String para double
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));

        // Calcula a média das notas
        double media = (nota1 + nota2 + nota3) / 3;

        // Define a mensagem com base na média
        String mensagem;
        if (media >= 7.0) {
            mensagem = "Situação: Aprovado ✅";
        } else if (media >= 5.0) {
            mensagem = "Situação: Recuperação ⚠️";
        } else {
            mensagem = "Situação: Reprovado ❌";
        }

        // Exibe a média e a situação em uma janela de mensagem
        JOptionPane.showMessageDialog(null,
            String.format("Aluno: %s\nMédia: %.2f\n%s", nome, media, mensagem),
            "Resultado Final",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
