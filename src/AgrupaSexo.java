import java.util.*;

public class AgrupaSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite nomes e sexo separados por vírgula (Ex: Rodrigo - M, Daniela - F): ");
        String entrada = scanner.nextLine();

        String[] pessoas = entrada.split(",");

        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        for (String p : pessoas) {
            String[] partes = p.split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim();

                if (sexo.equalsIgnoreCase("M")) {
                    homens.add(nome);
                } else if (sexo.equalsIgnoreCase("F")) {
                    mulheres.add(nome);
                }
            }
        }

        System.out.println("\n--- Grupo Masculino ---");
        homens.forEach(System.out::println);

        System.out.println("\n--- Grupo Feminino ---");
        mulheres.forEach(System.out::println);

        scanner.close();
    }
}
