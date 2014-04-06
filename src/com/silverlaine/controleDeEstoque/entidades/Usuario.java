package com.silverlaine.controleDeEstoque.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable=false)
	private String login;
	@Column(nullable=false)
	private String senha;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String email;
	
	
	public int getId() {
		return id;
	}
	public String getLogin() {
		return login;
	}
	public String getSenha(){
		return senha;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setLogin(String login) {
		this.login=login;
	}
	public void setSenha(String senha){
		this.senha= senha;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
