package com.leandro.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.leandro.jpa.modelo.Conta;

public class CriaContaSaldo {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Conta");
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta();
		conta.setTitular("Nome");
		conta.setNumero(2514);
		conta.setAgencia(432);
		conta.setSaldo(1500.0);
		
		em.getTransaction().begin();
		
		em.persist(conta);
		
		conta.setSaldo(3000.0);
		
		em.getTransaction().commit();
	}

}