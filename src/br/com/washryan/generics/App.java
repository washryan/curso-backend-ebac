package br.com.washryan.generics;

import br.com.washryan.generics.carros.Carro;
import br.com.washryan.generics.carros.Civic;
import br.com.washryan.generics.carros.Honda;
import br.com.washryan.generics.carros.BMW;
import br.com.washryan.generics.carros.Ford;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Carro> minhaGaragem = new ArrayList<>();

        minhaGaragem.add(new Honda());
        minhaGaragem.add(new Civic());
        minhaGaragem.add(new BMW());
        minhaGaragem.add(new Ford());

        System.out.println("--- Minha Garagem ---");

        for (Carro carro : minhaGaragem) {
            carro.exibirDetalhes();
        }
    }
}