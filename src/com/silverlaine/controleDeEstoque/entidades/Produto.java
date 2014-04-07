package com.silverlaine.controleDeEstoque.entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(nullable=false)
	private String marca;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String armazenamento;
	@Column(nullable=false)
	private String tipo;
	@Column(nullable=false)
	private Double quantidade;
	private Date validade;
	
	
	public int getId() {
		return id;
	}
	public String getMarca() {
		return marca;
	}
	public String getNome() {
		return nome;
	}
	public String getArmazenamento() {
		return armazenamento;
	}
	public String getTipo() {
		return tipo;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public Date getValidade() {
		return validade;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}	//me explica pq tem dois pacotes entidades e com praticamente as mesmas entidades, soh que uma com telas?
	//EH isso que ta zuando o codigo, percebeu, praticamente o mesmo nome de pacote com o mesmo nome de classe
	//use ProdutoGUI para a tela de produtos e UsuarioGUI para a de usuario, pra nao confundir
}
