package com.leandro.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.leandro.jpa.modelo.Conta;

public class AlteraSaldoLeandroh {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Conta");
		EntityManager em = emf.createEntityManager();
		Conta contaDoLeandroh = em.find(Conta.class, 1L);
		
		em.getTransaction().begin();
		contaDoLeandroh.setSaldo(5002.0);
		em.getTransaction().commit();
		
	}
}
