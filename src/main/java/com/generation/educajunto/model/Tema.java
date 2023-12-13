package com.generation.educajunto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity // defini que vai ser uma tabela
@Table(name = "tb_temas") // defini o nome da tabela 

public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // configura que vai auto incremento
	private long id ;
	
	@Column(length = 32)
	@Size(min = 10, max = 32, message = "O atributo nome precisa ter entre 10 e 32 caracteres.") // definimos o tamanho de no max 32 caracteres
	@NotBlank(message = " O atributo Nome é obrigatório.") // definimos que o nome é obrigatorio
	private String nome;
	
	@Column(length = 255)
	@Size(min = 10, max = 255, message = "O atributo descrição precisa ter entre 10 e 255 caracteres.") // definimos o tamanho da descrição
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
