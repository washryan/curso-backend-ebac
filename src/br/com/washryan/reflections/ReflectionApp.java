package br.com.washryan.reflections;

import br.com.washryan.annotations.Tabela;
import br.com.washryan.annotations.demo.Cliente;

public class ReflectionApp {
    public static void main(String[] args) {
        try {
            // Carregar a classe Cliente dinamicamente
            Class<?> clazz = Class.forName("br.com.washryan.annotations.demo.Cliente");

            // Verificar se possui a anotação @Tabela
            if (clazz.isAnnotationPresent(Tabela.class)) {
                Tabela tabela = clazz.getAnnotation(Tabela.class);
                System.out.println("Tabela configurada: " + tabela.value());
            } else {
                System.out.println("A classe não possui a anotação @Tabela.");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
