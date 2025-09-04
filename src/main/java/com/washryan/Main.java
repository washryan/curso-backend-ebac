package com.washryan;

import com.washryan.model.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("lojaPU");
        EntityManager em = emf.createEntityManager();

        Produto produto = new Produto("Notebook", 3500.0);

        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();

        System.out.println("Produto salvo: " + produto);

        em.close();
        emf.close();
    }
}
