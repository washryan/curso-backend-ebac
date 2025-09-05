package com.washryan.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "acessorio")
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique = true, length = 80)
    private String nome;

    @ManyToMany(mappedBy = "acessorios")
    private Set<Carro> carros = new HashSet<>();

    public Acessorio() {}
    public Acessorio(String nome) { this.nome = nome; }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Set<Carro> getCarros() { return carros; }

    @Override
    public String toString() {
        return "Acessorio{id=" + id + ", nome='" + nome + "'}";
    }
}
