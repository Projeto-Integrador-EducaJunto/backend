package com.generation.educajunto.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.generation.educajunto.model.Tema;

public interface TemaRepository {

	public List<Tema> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	
	public List<Tema> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}
