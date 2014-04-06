package com.silverlaine.controleDeEstoque.entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Saida {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	/*@Column(nullable=false)
	private Produto produto;
	@Column(nullable=false)
	private Usuario usuario;*/
	@Column(nullable=false)
	private Integer quantidadeRetirada;
	@Column(nullable=false)
	private Integer quantidadeRestante;
	@Column(nullable=false)
	private Date dataRetirada;
	private String observacao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;

	}
/*	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}*/
	public Integer getQuantidadeRetirada() {
		return quantidadeRetirada;
	}
	public void setQuantidadeRetirada(Integer quantidadeRetirada) {
		this.quantidadeRetirada = quantidadeRetirada;
	}
	public Integer getQuantidadeRestante() {
		return quantidadeRestante;
	}
	public void setQuantidadeRestante(Integer quantidadeRestante) {
		this.quantidadeRestante = quantidadeRestante;
	}
	public Date getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}	
}
