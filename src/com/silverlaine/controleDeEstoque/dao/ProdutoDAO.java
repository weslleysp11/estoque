package com.silverlaine.controleDeEstoque.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import antlr.collections.List;

import com.silverlaine.controleDeEstoque.entidades.Produto;

public class ProdutoDAO {
	
	//perceba, nao tem mais o import, vou usar o ctrl+barra de espaço pra pegar o import
	
	private EntityManager getentEntityManager(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(" ");
		EntityManager manager = factory.createEntityManager();
		return manager;
	}
	
	public void InserirProduto(Produto produto) {
		EntityManager manager = getentEntityManager();
		System.out.println("Persistencia iniciada");
		
		manager.getTransaction().begin();
		System.out.println ("persistindo prodiuto");
		manager.persist(produto);
		System.out.println("concomitando");
		manager.getTransaction().commit();
		System.out.println ("persistencia concluida, fechando o entity manager");
		manager.close();
		System.out.println ("terminado");
		
	}
	
	public void ExcluirProduto(int id) {
		EntityManager manager= getentEntityManager();
		try{
			
			manager.getTransaction().begin();
			Produto produto = manager.find(Produto.class, id);
			System.out.println("Excluindo os dados de:" + produto.getId());
			manager.getTransaction().commit();
		}finally{
			
			manager.close();
		}
		
	}
	
	/*public List<Produto> findAll() {
		
		EntityManager manager = getentEntityManager();
		@SuppressWarnings("unchecked")
		List<Produto> produtos = manager.createQuery("FROM" + Produto.class.getName()).getResultList();
		return produtos;
		
		
	}*/
	
	public Produto consultarPorId( int id){
		
		EntityManager manager = getentEntityManager();
		Produto produto = null;
		try{
			
			produto = manager.find(Produto.class,id);
		} finally {
			manager.close();
		
			
		}
		
		return produto;
		
	}
	
	public Produto procuraProduto (String param) {
		
		Produto resultado = new Produto();
		EntityManager manager = getentEntityManager();
		
		Session session = manager.unwrap(Session.class);
		
		Criteria searchCriteria = session.createCriteria(Produto.class);
		searchCriteria.add(Restrictions.eq("Nome", param));
		resultado = (Produto) searchCriteria.uniqueResult();
		
		return  resultado;
		
	}
		//meu, vc precisa entender que o codigo TEM que ficar identado
	//o que estava acontecendo era que aquela '{' estava quebrando o seu codigo
	//¬¬ 
	//tem alguma coisa errada no seu projeto que nao esta conseguindo importar nem produto nem usuario
	//nao sei pq...ai não 
	//enfim, continue codificando, quando vc terminar, me chame pra vermos isso, e nada de ficar ate a meia noite nessa joça
	//eu te chamo
	
	
} 