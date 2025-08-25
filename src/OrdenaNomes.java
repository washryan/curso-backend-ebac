import java.util.*;

public class OrdenaNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite nomes separados por vírgula: ");
        String entrada = scanner.nextLine();

        String[] nomes = entrada.split(",");
        Arrays.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

        scanner.close();
    }
}
