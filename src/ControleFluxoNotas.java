import java.util.Scanner;

public class ControleFluxoNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            soma += scanner.nextDouble();
        }

        double media = soma / 4;

        if (media >= 7) {
            System.out.println("Aluno aprovado! Média: " + media);
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação. Média: " + media);
        } else {
            System.out.println("Aluno reprovado. Média: " + media);
        }

        scanner.close();
    }
}
