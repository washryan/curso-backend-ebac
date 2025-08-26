package br.com.washryan.padroes.abstractfactory;

import br.com.washryan.padroes.abstractfactory.carro.SUV;
import br.com.washryan.padroes.abstractfactory.carro.Sedan;
import br.com.washryan.padroes.abstractfactory.fabrica.FabricaCarro;
import br.com.washryan.padroes.abstractfactory.fabrica.impl.FabricaCarroLuxo;
import br.com.washryan.padroes.abstractfactory.fabrica.impl.FabricaCarroPopular;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Abstract Factory • Fábrica de Carros ===");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Escolha a FAMÍLIA: [1] Popular  [2] Luxo");
            System.out.print("Opção: ");
            int familia = Integer.parseInt(sc.nextLine().trim());

            FabricaCarro fabrica =
                    (familia == 2) ? new FabricaCarroLuxo() : new FabricaCarroPopular();

            System.out.println("Escolha o TIPO: [1] Sedan  [2] SUV");
            System.out.print("Opção: ");
            int tipo = Integer.parseInt(sc.nextLine().trim());

            switch (tipo) {
                case 1 -> {
                    Sedan sedan = fabrica.criarSedan();
                    sedan.exibirInfo();
                }
                case 2 -> {
                    SUV suv = fabrica.criarSUV();
                    suv.exibirInfo();
                }
                default -> System.out.println("Tipo inválido.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Tente novamente com números (1 ou 2).");
        }
    }
}
