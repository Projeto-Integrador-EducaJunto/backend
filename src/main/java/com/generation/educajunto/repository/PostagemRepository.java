package com.generation.educajunto.repository;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	List<Postagem> findAllByConteudoContainingIgnoreCase(@Param ("conteudo")String conteudo);
}
