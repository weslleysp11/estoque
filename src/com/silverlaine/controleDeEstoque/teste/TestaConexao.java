package com.silverlaine.controleDeEstoque.teste;

import com.silverlaine.controleDeEstoque.bussiness.UsuarioBussiness;
import com.silverlaine.controleDeEstoque.entidades.Usuario;

public class TestaConexao {

	public static void main(String[] args) {
		System.out.println("criando usuário Jessica");

		String nome = "novo ususario";
		String senha = "bla bla";
		String email = "algum.emaile@email.com";
		String login = "login de teste";

		System.out.println("Salvando o usuario " + nome);
		UsuarioBussiness bussiness = new UsuarioBussiness();

//		bussiness.gravarUSuario(nome, senha, email, login);
		System.out.println("usuario salvo");
		Usuario usuarioDoZeRuela = bussiness.pesquisarUsuario(login);

		usuarioDoZeRuela.setNome("novo usuario modificado");//vc estava alterando o usuario para o mesmo nome de antes

		bussiness.alterarUsuario(usuarioDoZeRuela);
	
		}
}