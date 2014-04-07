package com.silverlaine.controleDeEstoque.bussiness;


import java.sql.Date;

import javax.xml.ws.Response;

import com.silverlaine.controleDeEstoque.dao.ProdutoDAO;
import com.silverlaine.controleDeEstoque.dao.UsuarioDAO;
import com.silverlaine.controleDeEstoque.entidades.Produto;
import com.silverlaine.controleDeEstoque.entidades.Usuario;

public class ProdutoBussiness {
	
public void testeDeInsercaoDeUsuario() {
		
		Produto produto = new Produto();
		
		produto.setId(0);
		produto.setNome("banana");
		produto.setMarca("Hort");
		produto.setTipo("Reagente");
		produto.setArmazenamento("geladeira");
		produto.setQuantidade(52.0);
		produto.setValidade(Date.valueOf("2014-02-2"));
		
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.InserirProduto(produto);
		
		
		
	}

	public String gravarProduto (int id, String nome, String marca,String tipo,String armazenamento, 
			double quantidade, Date validade){
		
		String reposta = "";
		
		System.out.println ("Iniciando a inserção de produtos");
		
		if (!nome.equals(null) || !marca.equals(null)|| !tipo.equals(null) ||
				!armazenamento.equals(null) || quantidade != 0 || validade!= null){
			Produto produto = new Produto();
			
			if (nome.equals(null)) {
				System.out.println("O campo nome eh obrigatorio");
				
				//pronto, eh isso
			}
			
	
			
		}
		
		return reposta;
	}
	
	public String gravarUSuario (String nome, String senha, String email, String login) { 
		
		String resposta = "";
		
		System.out.println("Iniciando inserçao de usuario");
		
		if(!nome.equals(null) || !senha.equals(null) || email.equals(null) || login.equals(null)){ 
			Usuario usuario = new Usuario ();
			
			if (senha.length() > 15) {
				int tamanhoDaSenha = senha.length();
				System.out.println("sua senha deve conter no maximo 15 caracteres, mas contem " + tamanhoDaSenha);
				resposta = "sua senha deve conter no maximo 15 caracteres";
				return resposta;
			}
			
			System.out.println("preenchendo campos");
			usuario.setNome(nome);
			usuario.setSenha(senha);
			usuario.setEmail(email); 
			usuario.setLogin(login);
			
			if (comparar(usuario)) {
				resposta = "Login ja existente, por favor, escolha um login diferente";
				return resposta;
			}
			
			UsuarioDAO dao = new UsuarioDAO();
			System.out.println("persistindo usuario");
			dao.testeDeInserção(usuario);
			
			resposta = "salvo com sucesso";
		} else {
			resposta = "valores nulos";
		}
		
		return resposta;
	}
	
	public Boolean comparar(Usuario usuario) {
		UsuarioDAO dao = new UsuarioDAO();
		
		Usuario usuarioExistente = dao.procuraUsuario(usuario.getLogin());
		
		if (usuarioExistente != null) {
			System.out.println("Usuario ja existe na base de dados");
			return true;
			
		} else {
			System.out.println("Novo usuario encontrado");
			return false;
		}
	}
	public void alterarUsuario(Usuario usuario){ 
		UsuarioDAO dao = new UsuarioDAO(); 
		Usuario usuarioDoBanco = dao.procuraUsuario(usuario.getLogin()); 
		if (usuarioDoBanco != null) {
			usuario.setId(usuarioDoBanco.getId()); 
			System.out.println("número de id do usuário do banco: " + usuarioDoBanco.getId()); 
			dao.alterarUsuario(usuarioDoBanco);
		
		} else {
			System.out.println("Usuário não existente");
	} 
		

	} public Usuario pesquisarUsuario(String param) { 
			UsuarioDAO dao = new UsuarioDAO(); return dao.procuraUsuario(param); }
	}
