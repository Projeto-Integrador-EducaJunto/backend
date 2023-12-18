package com.generation.educajunto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.educajunto.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	List<Postagem> findAllByConteudoContainingIgnoreCase(@Param("conteudo")String conteudo);
}
