package com.washryan.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, length = 100)
    private String modelo;

    @Column(nullable=false)
    private Integer ano;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;

    @ManyToMany
    @JoinTable(
        name = "carro_acessorio",
        joinColumns = @JoinColumn(name = "carro_id"),
        inverseJoinColumns = @JoinColumn(name = "acessorio_id")
    )
    private Set<Acessorio> acessorios = new HashSet<>();

    public Carro() {}
    public Carro(String modelo, Integer ano) {
        this.modelo = modelo; this.ano = ano;
    }

    public Long getId() { return id; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public Integer getAno() { return ano; }
    public void setAno(Integer ano) { this.ano = ano; }
    public Marca getMarca() { return marca; }
    public void setMarca(Marca marca) { this.marca = marca; }
    public Set<Acessorio> getAcessorios() { return acessorios; }

    public void adicionarAcessorio(Acessorio a) {
        acessorios.add(a);
        a.getCarros().add(this);
    }
    public void removerAcessorio(Acessorio a) {
        acessorios.remove(a);
        a.getCarros().remove(this);
    }

    @Override
    public String toString() {
        return "Carro{id=" + id + ", modelo='" + modelo + "', ano=" + ano +
               ", marca=" + (marca != null ? marca.getNome() : null) + "}";
    }
}
