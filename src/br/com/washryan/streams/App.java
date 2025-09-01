package br.com.washryan.streams;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Digite nome e sexo separados por vírgula (ex: Ana,F).");
        System.out.println("Digite 'sair' para encerrar.");

        while (true) {
            String linha = sc.nextLine().trim();
            if (linha.equalsIgnoreCase("sair")) break;

            // divide nome e sexo
            String[] partes = linha.split(",");
            if (partes.length != 2) {
                System.out.println("Formato inválido! Use: nome,sexo (M/F).");
                continue;
            }

            String nome = partes[0].trim();
            String sexo = partes[1].trim().toUpperCase();

            pessoas.add(new Pessoa(nome, sexo));
        }

        sc.close();

        // Filtrar apenas mulheres usando Lambda + Streams
        List<Pessoa> mulheres = pessoas.stream()
                                       .filter(p -> p.getSexo().equals("F"))
                                       .collect(Collectors.toList());

        System.out.println("\n📋 Lista completa:");
        pessoas.forEach(System.out::println);

        System.out.println("\n👩 Lista de mulheres:");
        mulheres.forEach(System.out::println);
    }
}
