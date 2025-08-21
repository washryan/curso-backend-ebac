import java.util.Scanner;

public class ConversaoWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int valorPrimitivo = scanner.nextInt();

        // Autoboxing
        Integer valorWrapper = valorPrimitivo;

        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.println("Valor como Wrapper: " + valorWrapper);
        
        scanner.close();
    }
}
