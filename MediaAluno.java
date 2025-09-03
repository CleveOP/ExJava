
    import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine(); // Lê o nome completo

        // Solicita as três notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média das três notas
        double media = (nota1 + nota2 + nota3) / 3;

        // Exibe a média com duas casas decimais
        System.out.printf("A média de %s é: %.2f%n", nome, media);

        // Verifica a situação do aluno com base na média
        if (media >= 7.0) {
            System.out.println("Situação: Aprovado ✅");
        } else if (media >= 5.0) {
            System.out.println("Situação: Recuperação ⚠️");
        } else {
            System.out.println("Situação: Reprovado ❌");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}

