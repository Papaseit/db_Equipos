package Paquete;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("equipos");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();


        System.out.println(em.createQuery("SELECT e FROM "));
    }
}
