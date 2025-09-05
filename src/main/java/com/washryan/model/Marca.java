package com.washryan.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 60)
    private String nome;

    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Carro> carros = new ArrayList<>();

    public Marca() {}
    public Marca(String nome) { this.nome = nome; }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public List<Carro> getCarros() { return carros; }

    // Conveniência para manter os dois lados sincronizados
    public void adicionarCarro(Carro carro) {
        carros.add(carro);
        carro.setMarca(this);
    }

    public void removerCarro(Carro carro) {
        carros.remove(carro);
        carro.setMarca(null);
    }

    @Override
    public String toString() {
        return "Marca{id=" + id + ", nome='" + nome + "'}";
    }
}
