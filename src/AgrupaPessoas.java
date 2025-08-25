import java.util.*;

public class AgrupaPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        System.out.println("Digite os dados das pessoas (digite 'fim' para encerrar):");

        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) break;

            System.out.print("Sexo (M/F): ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                homens.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                mulheres.add(nome);
            } else {
                System.out.println("Sexo inválido! Digite M ou F.");
            }
        }

        System.out.println("\n--- Grupo Masculino ---");
        for (String h : homens) {
            System.out.println(h);
        }

        System.out.println("\n--- Grupo Feminino ---");
        for (String m : mulheres) {
            System.out.println(m);
        }

        scanner.close();   
    }
}
