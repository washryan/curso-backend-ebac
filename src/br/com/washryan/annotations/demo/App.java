package br.com.washryan.annotations.demo;

import br.com.washryan.annotations.Tabela;

public class App {
    public static void main(String[] args) {
        Class<?> clazz = Cliente.class;

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela configurado por @Tabela: " + tabela.value());
        } else {
            System.out.println("A classe " + clazz.getSimpleName() + " não possui a anotação @Tabela.");
        }
    }
}
