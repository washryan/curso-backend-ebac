package com.washryan;

import com.washryan.model.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("lojaPU");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            // Cria uma marca
            Marca toyota = new Marca("Toyota");
            em.persist(toyota); // persistimos a marca primeiro

            // Cria alguns acessórios
            Acessorio ar = new Acessorio("Ar-condicionado");
            Acessorio airbag = new Acessorio("Airbag");
            Acessorio som = new Acessorio("Som Premium");

            em.persist(ar);
            em.persist(airbag);
            em.persist(som);

            // Cria um carro e relaciona
            Carro corolla = new Carro("Corolla Altis", 2022);
            toyota.adicionarCarro(corolla); // seta dos dois lados (marca <-> carro)

            corolla.adicionarAcessorio(ar);
            corolla.adicionarAcessorio(airbag);
            corolla.adicionarAcessorio(som);

            em.persist(corolla);

            em.getTransaction().commit();

            // Consulta rápida para validar
            List<Carro> carros = em.createQuery(
                "SELECT c FROM Carro c JOIN FETCH c.marca", Carro.class
            ).getResultList();

            System.out.println("\n== Carros cadastrados ==");
            carros.forEach(System.out::println);

        } finally {
            em.close();
            emf.close();
        }
    }
}
