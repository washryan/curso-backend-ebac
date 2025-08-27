package br.com.washryan.annotations.demo;

import br.com.washryan.annotations.Tabela;

@Tabela("clientes")
public class Cliente {
    // Conteúdo só para exemplo
    private Long id;
    private String nome;

    public Cliente() {}
    public Cliente(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
