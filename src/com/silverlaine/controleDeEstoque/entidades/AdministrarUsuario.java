package com.silverlaine.controleDeEstoque.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdministrarUsuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(nullable=false)
	private Boolean podeCadastrar;
	@Column(nullable=false)
	private Boolean podeConsultar;
	@Column(nullable=false)
	private Boolean podeAlterar;
	@Column(nullable=false)
	private Boolean podeExcluir;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getPodeCadastrar() {
		return podeCadastrar;
	}
	public void setPodeCadastrar(Boolean podeCadastrar) {
		this.podeCadastrar = podeCadastrar;
	}
	public Boolean getPodeConsultar() {
		return podeConsultar;
	}
	public void setPodeConsultar(Boolean podeConsultar) {
		this.podeConsultar = podeConsultar;
	}
	public Boolean getPodeAlterar() {
		return podeAlterar;
	}
	public void setPodeAlterar(Boolean podeAlterar) {
		this.podeAlterar = podeAlterar;
	}
	public Boolean getPodeExcluir() {
		return podeExcluir;
	}
	public void setPodeExcluir(Boolean podeExcluir) {
		this.podeExcluir = podeExcluir;
	}
}
