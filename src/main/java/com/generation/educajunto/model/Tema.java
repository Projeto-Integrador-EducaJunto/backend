package com.generation.educajunto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_temas") 
public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	
	@Column(length = 32)
	@Size(min = 10, max = 32, message = "O nome deve possuir no mínimo 10 caracteres e no máximo 32.")
	@NotBlank(message = " O atributo Nome é obrigatório.")
	private String nome;
	
	@Column(length = 255)
	@Size(min = 10, max = 255, message = "A descrição deve possuir no mínimo 10 caracteres e no máximo 255. ")
	private String descricao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
