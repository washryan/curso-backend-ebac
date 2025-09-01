package br.com.washryan.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", "F"));
        pessoas.add(new Pessoa("Maria", "F"));
        pessoas.add(new Pessoa("João", "M"));
        pessoas.add(new Pessoa("Carla", "F"));
        pessoas.add(new Pessoa("Pedro", "M"));

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> "F".equalsIgnoreCase(p.getSexo()))
                .collect(Collectors.toList());

        mulheres.forEach(m -> System.out.println(m.getNome()));
    }

    // método auxiliar para o teste
    public static List<Pessoa> obterMulheres(List<Pessoa> pessoas) {
        return pessoas.stream()
                .filter(p -> "F".equalsIgnoreCase(p.getSexo()))
                .collect(Collectors.toList());
    }
}
