package com.silverlaine.controleDeEstoque.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.silverlaine.controleDeEstoque.entidades.Usuario;

public class UsuarioDAO {
	
	private EntityManager getEntiEntityManager(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TESTE");
		EntityManager manager = factory.createEntityManager();
		return manager;
	}
	
	public void testeDeInserção(Usuario usuario) {
		EntityManager manager = getEntiEntityManager();
		System.out.println("Iniciando persistência");
		
		manager.getTransaction().begin();
		System.out.println("persistindo usuário");
		manager.persist(usuario);
		System.out.println("commitando usuário");
		manager.getTransaction().commit();
		System.out.println("persistência concluída, fechando o entity manager");
		manager.close();
		System.out.println("terminado");
	}
	
	
	
	public void testeDeExclusao(int id){
		EntityManager manager= getEntiEntityManager();
		try{
	
			manager.getTransaction().begin();
			Usuario usuario= manager.find(Usuario.class, id);
			System.out.println ("Excluindo os dados de:" + usuario.getId());
			manager.remove(usuario);
			
			manager.getTransaction().commit();
		} finally{
			manager.close();
			
		}
	}
	
	public List<Usuario> findAll() {
		EntityManager manager= getEntiEntityManager();
	     @SuppressWarnings("unchecked")
		List<Usuario> usuarios = manager.createQuery("FROM " + Usuario.class.getName()).getResultList();
	     return usuarios;
	}
		                        	
	public Usuario consultarPorId(int id){
		EntityManager manager = getEntiEntityManager();
		Usuario usuario= null;
		try{
			usuario= manager.find(Usuario.class, id);
		} finally{
			manager.close();
		}
		return usuario;
	}
	
	public Usuario procuraUsuario(String param) {
		Usuario resultado = new Usuario();
		
		EntityManager manager = getEntiEntityManager();
		
	
		
		Session session = manager.unwrap(Session.class);
		
		Criteria searchCriteria = session.createCriteria(Usuario.class);
		
		searchCriteria.add(Restrictions.eq("login", param));
		
		resultado = (Usuario) searchCriteria.uniqueResult(); 
		return resultado;
	}
	
	public void alterarUsuario (Usuario usuario){
		EntityManager manager= getEntiEntityManager();
		//recuperamos a session nessa linha ;)
		Session session = manager.unwrap(Session.class);
		//nessa pegamos a transaction
		Transaction transaction = session.beginTransaction();
		
		//agora vamos destacar o objeto da area temporaria do hibernate, pra depois podermos fazer
		//o merge
		Usuario usuarioA = (Usuario) session.get(Usuario.class, usuario.getId());
		transaction.commit();
//		session.close();
		
//		session = managepossor.unwrap(Session.class);
		transaction = session.beginTransaction();
		
		Usuario usuarioB = (Usuario) session.get(Usuario.class, usuario.getId());
		Usuario usuarioC = (Usuario) session.merge(usuarioA);
		
		if (usuarioB == usuarioC) {
			System.out.println("Ainda nao entendi pra que essa comparaçao =P");
		}
		
		transaction.commit();
		session.close();
		
		/*
		try{
			
				manager.getTransaction().begin();  
	            manager.merge(usuario);  
	            manager.getTransaction().commit();  
	  
		}finally{
	            manager.close();
	  que zona eh essa? cade o catch?
	             }*/ 
	}
	

	
    
}  

	


	

